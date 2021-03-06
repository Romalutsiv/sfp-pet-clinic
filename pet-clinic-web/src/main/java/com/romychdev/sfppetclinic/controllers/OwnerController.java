package com.romychdev.sfppetclinic.controllers;

import com.romychdev.sfppetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/", "/index", "", "/owner/index.html"})
    public String ownerList(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
