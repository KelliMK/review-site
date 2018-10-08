package org.wecancodeit.reviewsite;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewController.class)
public class ReviewControllerTest {
	
	@Autowired
    private MockMvc mockMVC;
 
    @Test
    public void shouldAccessReviewsWithoutProblem() throws Exception { 
        // Arrange
    	mockMVC
    	// Act
        .perform(get("/reviews"))
        // Assert	
        .andExpect(status().isOk());
    }
    
    @Test
    public void shouldReturnReviewsTemplate() throws Exception {
    	// Arrange
    	mockMVC
    	// Act
    	.perform(get("/reviews"))
    	// Assert
    	.andExpect(view().name("reviews"));
    }
 
    @Test
    public void shouldAccessReviewWithoutProblem() throws Exception { 
    	mockMVC
        .perform(get("/review/0"))
        .andExpect(status().isOk());
    }
    
    @Test
    public void shouldReturnReviewTemplate() throws Exception {
    	// Arrange
    	mockMVC
    	// Act
    	.perform(get("/review/0"))
    	// Assert
    	.andExpect(view().name("review"));
    }
}
