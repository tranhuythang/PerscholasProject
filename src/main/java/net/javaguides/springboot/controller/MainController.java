package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Review;
import net.javaguides.springboot.repository.ReviewRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

	Logger logger = LoggerFactory.getLogger(MainController.class);

	@Autowired
	private ReviewRepository reviewRepository;

	@GetMapping("/login")
	public String login(Model model) {

		try {
			List<Review> reviews = new ArrayList<Review>();
			reviewRepository.findAll().forEach(reviews::add);
			model.addAttribute("reviews", reviews);

		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
		}
		return "login";
	}

	@GetMapping({"/index", "/", "", "logedin"})
	public String allReviewNLoggedin(Model model) {
		try {
			List<Review> reviews = new ArrayList<Review>();
			reviewRepository.findAll().forEach(reviews::add);
			model.addAttribute("reviews", reviews);

		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
		}
		return "logedin";
	}


	@GetMapping(value = {"/yourReviews"})
	public String yourReviews(Model model, Principal principal) {
//		logger.info("Index - Start processing /index");
		try {
			List<Review> reviews = new ArrayList<Review>();
			reviewRepository.findByUsername(principal.getName()).forEach(reviews::add);
			model.addAttribute("reviews", reviews);
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
		}
		return "yourReviews";
	}

	@GetMapping("/delete/{id}")
	public String deleteTutorial(@PathVariable("id") Long id, Model model, RedirectAttributes redirectAttributes) {
		try {
			reviewRepository.deleteById(id);
			redirectAttributes.addFlashAttribute("message", "The review with id=" + id + " has been deleted successfully!");
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("message", e.getMessage());
		}
		return "redirect:/yourReviews";
	}

	@GetMapping("/submit")
	public String submitReview(Model model) {
//		Review review = new Review();
//		review.setUser_id(1);
//
//		model.addAttribute("review", review);
		return "submitReview";
	}

	@PostMapping("/save")
	public String saveTutorial(RedirectAttributes redirectAttributes,
							   @RequestParam("comment") String comment,
							   @RequestParam("rate") Integer rate,
							   @RequestParam("book_id") Integer book_id
//							   @RequestParam("user_id") Integer user_id
							   ) {
		try {
//			reviewRepository.save(review);
			redirectAttributes.addFlashAttribute("message", "The review has been saved successfully!");
		} catch (Exception e) {
			redirectAttributes.addAttribute("message", e.getMessage());
		}
		return "redirect:/yourReviews";
	}

}
