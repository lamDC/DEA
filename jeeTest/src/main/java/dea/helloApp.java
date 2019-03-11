package dea;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/")
public class helloApp {

    @GET
    public String hello() {
        return "hello World";
    }

    @GET
    @Path("hallo")
    public String hallo(@QueryParam("dialect") String dialect){
        if(dialect.equals("limburgs")){
            return "haloooooooo";
        }
        else {
            return "hallo";
        }
    }

    @GET
    @Path("getal")
    @Produces("application/json")
    public Response geefGetal(){
        return Response.status(200).entity(new Integer(37)).build();
    }

}
