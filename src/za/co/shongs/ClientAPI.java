package za.co.shongs;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ejb.ClientEJB;
import jpa.Client;


@Path("/client")
public class ClientAPI {

		@Inject
		ClientEJB clientEJB;
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("{id}")
		public Client getClient(@PathParam("id") int id) {
			
			return clientEJB.getClient(id);
		
		}
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/getClientList")
		public List<Client>  getClientList(){
		
			return clientEJB.getAll();
		
		}
	
}
