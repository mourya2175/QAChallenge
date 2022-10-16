package com.modulo;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@SpringBootTest(classes = ApplicationInitializer.class)
class ModuloServiceTest2 extends AbstractTestNGSpringContextTests {
	@Autowired
	private WebApplicationContext webApplicationContext;
	private MockMvc mockMvc;
	
	@BeforeClass
	public void setup() {
//		https://www.javainuse.com/spring/springboot_testng
//		https://www.techgeeknext.com/testng/spring-boot-testng
		mockMvc = MockMvcBuilders
                .webAppContextSetup(webApplicationContext)
                .build();
	}
	
	  @Test void testCalculateFizzOrBuzz() throws Exception { 
	
		  mockMvc.perform(get("/modulo"));
         
          
	  }
}
