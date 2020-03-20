/**
 * @Developer   : Rajiv Kumar
 * @CreatedDate : Mar 20, 2020
 * @Version     : 1.0.0
 */
package com.sanlark.boot.controller.ui;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CommonPageController {
	@GetMapping("/")
    public String index(final Model model) {
		log.info("Home Page acccessed => " + LocalDateTime.now());
        model.addAttribute("title", "Docker + Spring Boot");
        model.addAttribute("msg", "Welcome to the docker container!");
        return "index";
    }
}