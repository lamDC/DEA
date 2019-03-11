package dea;

import dea.dto.LoginRequestDto;
import dea.dto.LoginResponseDto;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/")
public class LoginController {

//    @GET
//    @Produces("application/json")
//    public String helloWorld(){
//        return "Hello World";
//    }

//    @POST
//    @Path("{naam}")
//    @Consumes("application/json")
//    public String testPost(@PathParam("naam")String test){
//        return test;
//    }

    @POST
    @Path("login")
    @Consumes("application/json")
    public Response login(LoginRequestDto request){

        if("piet".equals(request.getUser())){
            return Response.status(401).build();
        }

        String token = "dgsfghbgfs3r34yr";
        String user = "Meron Brouwer";

        LoginResponseDto response = new LoginResponseDto();
        response.setToken(token);
        response.setUser(user);

        return Response.ok().entity(response).build();
        //return Response.status(401).build();
    }
}
