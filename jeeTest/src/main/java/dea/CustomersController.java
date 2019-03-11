package dea;

import dea.dto.Customer;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("customers")

public class CustomersController {

    List<Customer> customers = new ArrayList<>();

    public CustomersController(){
        Customer piet = new Customer();
        piet.setSurName("Piet");
        piet.setFamilyName("de Vries");
        piet.setId(0);

        Customer jan = new Customer();
        jan.setSurName("Jan");
        jan.setFamilyName("de Hol");
        jan.setId(1);

        customers.add(piet);
        customers.add(jan);
    }

    @GET
    @Produces("application/json")
    public Response getCustomers(){

        return Response.ok().entity(customers).build();
    }

    @GET
    @Path("{customerId}")
    @Produces("application/json")
    public Response getCustomer(@PathParam("customerId") int id){

        if(customers.size() <= id){
            return Response.ok().entity(customers.get(id)).build();
        }

        return Response.status(404).build();
    }

//    @GET
//    @Path("{customerId}/surname")
//    @Produces("plain/text")
//    public String getCustomerSurName(@PathParam("customerId") int id){
//        Customer customer = customers.get(id);
//        return customer.getSurName();
//    }

    @GET
    @Path("{customerId}/surname")
    @Produces("application/json")
    public String getCustomerSurNameAsJson(@PathParam("customerId") int id){
        Customer customer = customers.get(id);
        return customer.getSurName();
    }

    @DELETE
    @Path("{customerId}/")
    @Produces("application/json")
    public List<Customer> deleteCustomer(@PathParam("customerId") int id){
        customers.remove(id);

        return customers;
    }

    @POST
    @Consumes("application/json")
    public List<Customer> addNewCustomer(String name){
        Customer customer = new Customer();
        customer.setSurName(name);
        customer.setFamilyName("driessen");
        customer.setId(5);
        customers.add(customer);

        return customers;
    }
}
