package nl.han.oose.dea;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class hello {

    @GET
    public String hello(){
        return "Hello World";
    }

    @GET
    @Path("Dog/{number}")
    @Produces("application/json")
    public Response getNumber(@PathParam("number") int number){
        MakeSound geluid = new MakeSound("Dog", number);
        return Response.ok().entity(geluid.getSound()).build();

//        Dog hond = new Dog();
//        return Response.ok().entity(hond.bark(number)).build();
    }

    @GET
    @Path("Cat/{number}")
    @Produces("application/json")
    public Response getCatSound(@PathParam("number") int number){
        MakeSound geluid = new MakeSound("Cat", number);
        return Response.ok().entity(geluid.getSound()).build();

//        Cat kat = new Cat();
//        return Response.ok().entity(kat.miauw(number)).build();
    }
}
