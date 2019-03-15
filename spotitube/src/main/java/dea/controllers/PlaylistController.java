package dea.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/playlists")
public class PlaylistController {

    @GET
    @Produces("application/json")
    public String Playlist(){

//        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
//            objectBuilder.add("number ", number).build();
//            String jsonString = "0";
//            try (Writer writer = new StringWriter()) {
//                Json.createWriter(writer).write(objectBuilder);
//                jsonString = writer.toString();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }


        return "Hello world";
    }
}
