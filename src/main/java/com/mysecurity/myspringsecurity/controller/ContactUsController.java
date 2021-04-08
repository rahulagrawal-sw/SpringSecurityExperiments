package com.mysecurity.myspringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactUsController {

    @GetMapping("contactUs")
    public String contactUs() {
        return "contactUs";
    }
}
