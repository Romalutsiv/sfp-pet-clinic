package com.romychdev.sfppetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"/", "/index", "", "/owner/index.html"})
    public String ownerList(){
        return "owners/index";
    }
}
