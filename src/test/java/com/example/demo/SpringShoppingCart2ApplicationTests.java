package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.TestExecutionResult.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.controller.MainController;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest( MainController.class)
class SpringShoppingCart2ApplicationTests {

	@Autowired
	private MockMvc mockmvc;

//	@MockBean
//	private 
	
	private final ObjectMapper objectMapper = new ObjectMapper();
	
	@Test
	void healthCheck() throws Exception{
		MvcResult result = (MvcResult) mockmvc.perform(MockMvcRequestBuilders.get("/403")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().contentType("text/html"));
		assertEquals("/403",result.getResponse().getContentAsString());
	}

	
}
