package dataresources;

import dea.controllers.dto.LoginRequestDto;
import dea.controllers.dto.LoginResponseDto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

    public LoginResponseDto performLogin(LoginRequestDto request) throws ClassNotFoundException, SQLException {
        ResultSet resultSet = null;
        PreparedStatement st = null;
        DatabaseConnection connection = new DatabaseConnection();
        java.sql.Connection cnEmps = connection.getConnection();
        LoginResponseDto loginResponseDto = new LoginResponseDto();
        String sql = "SELECT * FROM [USER]";

        try {
            st = cnEmps.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resultSet = st.executeQuery();
        while (resultSet.next())
        {
            String     username   = resultSet.getString("USERNAME");
            String     password   = resultSet.getString("PASSWORD");
            if(username.equals(request.getUser()) && password.equals(request.getPassword())){
                String     token   = resultSet.getString("TOKEN");
                String     user   = resultSet.getString("NAME");
                loginResponseDto.setToken(token);

                loginResponseDto.setUser(user);
            }
            else {
                loginResponseDto.setToken("error");
            }
        }
        if(loginResponseDto.getToken() == null){
            loginResponseDto.setToken("error");
        }

//        if ("meron".equals(request.getUser()) && "1234".equals(request.getPassword())) {
//            return "dgsfghbgfs3r34yr";
//        } else {
//            return "error";
//        }
        return loginResponseDto;
    }
}
