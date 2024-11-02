package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

   
    @GetMapping("/LoginPage")
    public String showLoginForm() {
        return "LoginPage"; // Renders LoginPage.jsp
    }

    
    @PostMapping("/LoginPage")
    public String processLoginForm(
            @RequestParam("id") int id, 
            @RequestParam("Email") String Email,
            @RequestParam("Password") String Password,
            Model model) {

        model.addAttribute("Email", Email);
        model.addAttribute("id", id);

        // Use if-else to redirect based on `id`
        if (id == 1) {
            model.addAttribute("name", "Abhishek");
            return "Details"; 
        } else if (id == 2) {
            model.addAttribute("name", "Emma Watson");
            return "Details2"; 
        } else {
            return "redirect:/error";
        }
    }
    
  
    	
    
    @GetMapping("/error")
    public String showErrorPage() {
        return "error"; 
    }


   
}
