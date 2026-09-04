package com.vit.vit_result_management;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PortalController {

    @GetMapping("/student/{prn}")
    public String studentPortal(
            @PathVariable String prn,
            Model model) {

        model.addAttribute("prn", prn);

        return "portal";
    }
}