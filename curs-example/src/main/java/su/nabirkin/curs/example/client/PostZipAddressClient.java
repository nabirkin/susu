package su.nabirkin.curs.example.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class PostZipAddressClient {
	public static void main(String[] args) {
		Client client = Client.create();
		 
		WebResource webResource = client.resource("http://localhost:8080/zipcode/zip");
 
		String input = "{\"zipCode\":\"454545\"}";
 
		ClientResponse response = webResource.type("application/json") .post(ClientResponse.class, input);

 
		System.out.println("Output from Server .... \n");
		String output = response.getEntity(String.class);
		System.out.println(output);
	}
}
