package han.oose.dea;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/items")
public class ItemResource {

    @GET
    @Produces("plain/text")
    public String getTextItems(){
        return "bread, butter";
    }

    @GET
    //@Produces("application/json")
    public String getJsonItems(){
        return "[bread, butter]";
    }
}
