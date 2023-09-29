package com.doingsomesideprojects.CarTrackingBackend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String Index(){
        return "Sup";
    }

}
