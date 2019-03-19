package dea.controllers;

import dea.controllers.dto.LoginRequestDto;
import dea.controllers.dto.LoginResponseDto;
import dataresources.LoginDAO;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.sql.*;

@Path("/login")
public class LoginController {

//    @POST
//    @Path("{naam}")
//    @Consumes("application/json")
//    public String testPost(@PathParam("naam")String test){
//        return test;
//    }

    LoginDAO loginDAO;

    @Inject
    public void setLoginDAO(){

    }

    @POST
    //@Path("login")
    @Consumes("application/json")
    public Response login(LoginRequestDto request) throws SQLException, ClassNotFoundException {

        LoginDAO dao = new LoginDAO();

        LoginResponseDto loginResponseDto = dao.performLogin(request);

        System.out.println(loginResponseDto.getToken());


        if("error".equals(loginResponseDto.getToken())){
            return Response.status(401).build();
        }
        else {
            return Response.ok().entity(loginResponseDto).build();
        }
    }

    @GET
    @Path("DAO")
    @Produces("application/json")
    public Response connectie() throws IOException, ClassNotFoundException, SQLException {
        java.sql.Connection cnEmps = null;
        var driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String connectionString = "jdbc:sqlserver://localhost:1433;databaseName=Menu";

        String user = "sa";
        String password = "cuppie123";

//        Properties properties = new Properties();
//        properties.load(getClass().getClassLoader().getResourceAsStream("database.properties"));
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try
        {
            cnEmps = DriverManager.getConnection(connectionString, user, password);
            System.out.println("hij doet het");
            Statement st = cnEmps.createStatement();
            String sql = ("SELECT Naam, Categorie FROM gerechten");
            ResultSet rsEmps = st.executeQuery(sql);
            while (rsEmps.next()) {
                String name = rsEmps.getString("Naam");
                var categorie = rsEmps.getString("Categorie");
                System.out.println(name);
                System.out.println(categorie);
            }
        }
        catch (SQLException e)
        {
            System.out.println("Error connecting to a database: " + e);
        }
        return Response.ok().entity(300).build();
    }
}
