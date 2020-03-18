package ing.microservice.esb.backend.services;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientService {
	
	
	@PostMapping(path="/client", consumes = "application/json", produces = "application/json")
	public Client client(@RequestBody String id) {
		return new Client( );
	}
}
