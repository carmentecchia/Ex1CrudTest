package com.example.Ex1CrudTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
@ActiveProfiles(value = "test")
class Ex1CrudTestApplicationTests {
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
