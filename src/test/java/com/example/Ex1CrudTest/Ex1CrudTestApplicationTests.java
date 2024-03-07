package com.example.Ex1CrudTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
@AutoConfigureMockMvc
@SpringBootTest
@ActiveProfiles(value = "test")
class Ex1CrudTestApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private StudentController studentController;
	@Autowired
	private StudentService studentService;
	@Test
	void studentControllerLoads() {
		assertThat(studentController).isNotNull();
	}
@Test
	void studentServiceLoads(){
		assertThat(studentService).isNotNull();
}
}
