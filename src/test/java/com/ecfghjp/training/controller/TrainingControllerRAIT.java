/*package com.ecfghjp.training.controller;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ecfghjp.training.TrainingApplication;
import com.ecfghjp.training.entities.Training;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TrainingApplication.class)
@WebAppConfiguration
public class TrainingControllerRAIT {

	@Value("${local.server.port}")
	private int serverPort;

	@Test
	public void addTrainingShouldReturnTraining() throws IOException, JsonProcessingException {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("jsonObject").getFile());
		String json = readFile(file.getAbsolutePath(), Charset.defaultCharset());
		ObjectMapper objectMapper = new ObjectMapper();
		Training training = objectMapper.readValue(json, Training.class);
		RestAssured.given().body(training).contentType(ContentType.JSON).when().post("/training/").then()
				.statusCode(HttpStatus.SC_OK);
	}

	private String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}
}
*/