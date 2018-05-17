package rest;


import beans.Hero;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/json/hero")
public class JsonRestService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Hero getInJSON() {
		return new Hero("Iron Man", "Intelligent");
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postInJSON(Hero hero) {
		return Response.status(Response.Status.CREATED).entity(hero.toString()).build();
	}
}