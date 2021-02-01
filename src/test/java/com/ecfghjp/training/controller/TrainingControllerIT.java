/*package com.ecfghjp.training.controller;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.net.ssl.SSLContext;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.ecfghjp.training.TrainingApplication;
import com.ecfghjp.training.entities.Training;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TrainingApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TrainingControllerIT {

	@LocalServerPort
	private int port;

	//TestRestTemplate restTemplate = new RestTemplate();

	HttpHeaders headers = new HttpHeaders();
	
	@Test
	public void testPostTraining() throws RestClientException, Exception {

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("jsonObject").getFile());
		String json = readFile(file.getAbsolutePath(), Charset.defaultCharset());
		ObjectMapper objectMapper = new ObjectMapper();
		Training training = objectMapper.readValue(json, Training.class);

		HttpEntity<Training> entity = new HttpEntity<Training>(training, headers);

		ResponseEntity<String> response = restTemplate().exchange(createURLWithPort("/training/"), org.springframework.http.HttpMethod.POST, entity, String.class);;

		JSONAssert.assertEquals(json, response.getBody(), false);

		//JSONAssert.assertEquals(expected, response.getBody(), false);
	}

	@Test
	public void testSearchTraining() throws RestClientException, Exception {

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("jsonObject").getFile());
		String json = readFile(file.getAbsolutePath(), Charset.defaultCharset());
		ObjectMapper objectMapper = new ObjectMapper();
		Training training = objectMapper.readValue(json, Training.class);

		HttpEntity<Training> entity = new HttpEntity<Training>(training, headers);

		ResponseEntity<List> response = restTemplate().exchange(createURLWithPort("/training/search/"), org.springframework.http.HttpMethod.POST, entity, List.class);;

		String expected = "["+training+"]";
		//JSONAssert.assertEquals(expected, response.getBody(), false);

		//JSONAssert.assertEquals(expected, response.getBody(), false);
	}

	private String createURLWithPort(String uri) {
		return "https://localhost:" + port + uri;
	}

	private String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}
	
	private RestTemplate restTemplate() throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();
	    SSLContext sslContext = new SSLContextBuilder()
	    	      .loadTrustMaterial(new File(classLoader.getResource("com.ecfghjp.com.p12").getFile()), "himAchAl@123".toCharArray())
	    	      .build();
	    	    SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContext);
	    	    HttpClient httpClient = HttpClients.custom()
	    	      .setSSLSocketFactory(socketFactory)
	    	      .build();
	    	    HttpComponentsClientHttpRequestFactory factory = 
	    	      new HttpComponentsClientHttpRequestFactory(httpClient);
	    	    return new RestTemplate(factory);
	    	}
}
*/