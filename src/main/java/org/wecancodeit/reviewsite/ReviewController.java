package org.wecancodeit.reviewsite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.reviewsite.ReviewRepository;

@Controller
public class ReviewController {

	private ReviewRepository reviewRepository = new ReviewRepository();
	
	@GetMapping("/reviews")
	public String courses(Model model) {
		model.addAttribute("reviews", reviewRepository.getAllReviews());
        return "reviews";
    }
	
    @GetMapping("/reviews/{id}")
    public String course(@PathVariable(value = "id") Long id, Model model) {
    	model.addAttribute("review", reviewRepository.getReview(id));
        return "review";
    }
}
