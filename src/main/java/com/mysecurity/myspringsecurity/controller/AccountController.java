package com.mysecurity.myspringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("myAccounts")
    public String accounts() {
        return "My Accounts";
    }
}
