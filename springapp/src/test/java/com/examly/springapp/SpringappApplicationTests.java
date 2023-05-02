package com.examly.springapp;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
class SpringappApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void test_case1() throws Exception {

		String st = "{\"email\":\"demo@gmail.com\",\"password\": \"demo@123\",\"mobileNumber\": \"9876543211\",\"userRole\":\"user\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/user/signup")
				.contentType(MediaType.APPLICATION_JSON)
				.content(st)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();
	}

	@Test
	void test_case2() throws Exception {

		String st = "{\"jobId\":\"01\",\"jobDescription\": \"demo\",\"jobLocation\": \"cbe\",\"fromDate\":\"01-01-2000\",\"toDate\":\"01-01-2001\",\"wagePerDay\":\"100\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/job/addjobs")
				.contentType(MediaType.APPLICATION_JSON)
				.content(st)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();
	}

	@Test
	void test_case3() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/user/dashboard")
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").isNotEmpty())
				.andReturn();
	}

	@Test
	void test_case4() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.delete("/delete/01")
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();
	}

	@Test
	void test_case5() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/list")
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").isNotEmpty())
				.andReturn();
	}

	@Test
	void test_case6() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/lists")
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").isNotEmpty())
				.andReturn();
	}

	@Test
	void test_case7() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.delete("/job/deleteJob/01")
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();
	}

	@Test
	void test_case8() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.delete("/admin/deleteProfile/01")
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();
	}

}
