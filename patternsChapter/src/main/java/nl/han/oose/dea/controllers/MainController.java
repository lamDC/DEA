package nl.han.oose.dea.controllers;

import nl.han.oose.dea.AnimalSound;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/")
public class MainController {

    @GET
    public String hello(){
        return "Hello World";
    }

    @GET
    @Path("Dog/{number}")
    @Produces("application/json")
    public Response getDogSound(@PathParam("number") int number){
        AnimalSound geluid = new AnimalSound("Dog", number);
        return Response.ok().entity(geluid.getSound()).build();

//        Dog hond = new Dog();
//        return Response.ok().entity(hond.bark(number)).build();
    }

    @GET
    @Path("Cat/{number}")
    @Produces("application/json")
    public Response getCatSound(@PathParam("number") int number){
        AnimalSound geluid = new AnimalSound("Cat", number);
        return Response.ok().entity(geluid.getSound()).build();

//        Cat kat = new Cat();
//        return Response.ok().entity(kat.miauw(number)).build();
    }

    @GET
    @Path("{number}")
    @Produces("application/json")
    public Response getAnimalSound(@PathParam("number") int number, @QueryParam("animal") String animal){
        AnimalSound geluid = new AnimalSound(animal, number);
        return Response.ok().entity(geluid.getSound()).build();

        //typ in localhost: <number>?animal=<animal>
    }
}
