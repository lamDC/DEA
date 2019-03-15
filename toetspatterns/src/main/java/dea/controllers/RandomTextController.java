package dea.controllers;

import dea.RandomTextGenerator;
import dea.dto.TextRequestDto;
import dea.factories.RandomTextGeneratorFactory;
import dea.factories.RandomTextType;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

@Path("/")
public class RandomTextController {


    @GET
    @Produces("text/html")
    public String geefRandomText(){
        return "Welcome to the Random text generator";
    }

    @GET
    @Path("{number}")
    @Produces("text/html")
    public Response geefRandomText(@PathParam("number") int number){
        var factory = RandomTextGeneratorFactory.getInstance();
        if(number % 2 == 0){
            var randomTextGenerator = factory.create(RandomTextType.LOREMIPSUM);
            return Response.ok().entity(randomTextGenerator.returnText(number)).build();
        }
        else {
            var randomTextGenerator = factory.create(RandomTextType.RANDOMTEXT);
            return Response.ok().entity(randomTextGenerator.returnText(number)).build();
        }

    }

//    @GET
//    @Path("{number}")
//    @Produces("application/json")
//    public Response geefNummer(@PathParam("number") String number){
//
//        int numberInt = Integer.parseInt(number);
//        if(number.equals(Integer.toString(numberInt))) {
//
//            JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
//            objectBuilder
//                    .add("number ", number).build();
//
//
//
//            String jsonString = "0";
//            try (Writer writer = new StringWriter()) {
//                Json.createWriter(writer).write(objectBuilder);
//                jsonString = writer.toString();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            return Response.ok().entity(jsonString).build();
//        }
//        else {
//            return Response.ok().entity(500).build();
//        }
//    }

    @POST
    @Path("text")
    @Consumes("application/json")
    public Response geefTekst(TextRequestDto request){

        if("Een willekeurige tekst".equals(request.getText())){
            return Response.ok().entity(200).build();
        }

        if(request.getText().isEmpty()){
            return Response.ok().entity(406).build();
        }

        return Response.ok().entity(404).build();

    }
}
