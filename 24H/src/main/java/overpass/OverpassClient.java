package overpass;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import de.ixilon.osm.schema.ObjectFactory;
import de.ixilon.osm.schema.Osm;


public class OverpassClient {

	  private final RestTemplate restTemplate;
	  private final URI url;

	  public OverpassClient(URI url) {
	    this(url, new RestTemplate());
	  }

	  public OverpassClient(URI url, RestTemplate restTemplate) {
	    this.url = url;
	    this.restTemplate = restTemplate;
	    this.restTemplate.getMessageConverters().add(new JaxbConverter<Osm>(Osm.class, ObjectFactory.class));
	  }

	  public Osm get(String query) {
	    UriComponentsBuilder builder = UriComponentsBuilder.fromUri(url);
	    builder.query(query);
	    return restTemplate.getForEntity(builder.build().encode().toUri(), Osm.class).getBody();
	  }

	  public Osm post(String query) {
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_XML);
	    HttpEntity<String> request = new HttpEntity<String>(query, headers);
	    return restTemplate.exchange(url, HttpMethod.POST, request, Osm.class).getBody();
	  }

	}