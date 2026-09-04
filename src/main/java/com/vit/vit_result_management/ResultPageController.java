package com.vit.vit_result_management;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ResultPageController {

    private final StudentRepository studentRepository;

    public ResultPageController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/result/{prn}")
    public String showResult(
            @PathVariable String prn,
            Model model) {

        Optional<Student> student = studentRepository.findByPrn(prn);

        if (student.isEmpty()) {
            return "redirect:/login?error=true";
        }

        model.addAttribute("student", student.get());

        return "results";
    }
}