package courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import courses.beans.Classes;
import courses.repository.ClassesRepository;

/**
 * @author Nick - ntambroson
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
@Controller
public class WebController {
	@Autowired
	ClassesRepository repo;
	
	@GetMapping({ "/", "viewAll" })
		public String viewAllClasses(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewClasses(model);
		}
			model.addAttribute("classes", repo.findAll());
			return "results";
	}
	
	@GetMapping("/inputClasses")
	public String addNewClasses(Model model) {
		Classes c = new Classes();
		model.addAttribute("newClasses", c);
		return"input";
	}

	@PostMapping("/inputClasses")
	public String addNewClasses(@ModelAttribute Classes c, Model model) {
		repo.save(c);
		return viewAllClasses(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateClasses(@PathVariable("id") long id, Model model) {
		Classes c = repo.findById(id).orElse(null);
		model.addAttribute("newClasses", c);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseClasses(Classes c, Model model) {
		repo.save(c);
		return viewAllClasses(model);
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Classes c = repo.findById(id).orElse(null);
		repo.delete(c);
		return viewAllClasses(model);
	}

}
