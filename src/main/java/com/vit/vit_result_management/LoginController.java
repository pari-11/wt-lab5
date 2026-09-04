package com.vit.vit_result_management;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final StudentRepository studentRepository;

    public LoginController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String prn,
            @RequestParam String password) {

        Optional<Student> student = studentRepository.findByPrn(prn);

        if (student.isPresent()
                && password.equals(student.get().getPassword())) {

            return "redirect:/student/" + prn;
        }

        return "redirect:/login?error=true";
    }
}