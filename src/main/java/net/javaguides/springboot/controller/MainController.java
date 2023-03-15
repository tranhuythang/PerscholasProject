package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Review;
import net.javaguides.springboot.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

	@Autowired
	private ReviewRepository reviewRepository;

	@GetMapping("/bookreview")
	public String test() { return "bookreview"; }

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

	@GetMapping("/index")
	public String home(Model model) {
		try {
			List<Review> reviews1 = new ArrayList<Review>();
//			reviewRepository.findByUsername(principal.getName()).forEach(reviews::add);
			reviewRepository.findAll().forEach(reviews1::add);
			reviewRepository.findAll().forEach(System.out::println);
			model.addAttribute("reviews1", reviews1);
			model.addAttribute("reviews2", "XYZ");
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
		}
		return "index";
	}
}
