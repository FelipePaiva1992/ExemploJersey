package br.com.fiap.rs.exemplos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("exemplo")
public class OlaWeb {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response ola() {
		return Response.status(Response.Status.OK).entity("SHABAUa").build();
	}
}
