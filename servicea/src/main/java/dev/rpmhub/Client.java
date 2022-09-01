package dev.rpmhub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface Client {
  
    @GET
    @Path("/person/{name}")
    @Produces(MediaType.APPLICATION_JSON)

    public Person getPerson(@PathParam("name") String name);

}
