package ua.com.evgeniy.limitsmicroservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.evgeniy.limitsmicroservice.beans.Limits;
import ua.com.evgeniy.limitsmicroservice.configuration.LimitsConfiguration;

@RestController
public class LimitsController {

    @Autowired
    private LimitsConfiguration limitsConfiguration;

    @GetMapping("/limits")
    public Limits getLimits()   {
        return new Limits(limitsConfiguration.getMin(), limitsConfiguration.getMax());
    }
}
