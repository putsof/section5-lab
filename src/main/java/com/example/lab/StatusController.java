package com.example.lab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusController {

    // initialzing this variable in the construtor tells Spring to use dependecy injection to wire it in for use
    private final StatusService statusService;

    public StatusController(StatusService statusService){
        this.statusService = statusService;
    }

    @GetMapping("/arrival")
    public String sayHello () {
        return statusService.processStatus(true);
    }

    @GetMapping("/departure")
    public String sayGoodbye () {
        return statusService.processStatus(false);
    }
}
