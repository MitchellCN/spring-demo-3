package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

/**
 * Created by doug on 4/12/17.
 */
@Controller
public class ExampleController {

    @Autowired
    StateRepo stateRepo;

    @RequestMapping("/")
    public String showHome(Model model){

        model.addAttribute("states", stateRepo.listStates());

        return "index";
    }

    @RequestMapping(path = "/createPerson", method = RequestMethod.POST)
    private String createPerson(Model model, Person person, Address address){

        model.addAttribute("person", person);
        model.addAttribute("address", address);
        model.addAttribute("state", stateRepo.getState(address.getStateProvinceId()));

        return "success";
    }

}
