package com.example.tacocloud.Controller;

import ch.qos.logback.core.model.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/current")
    public String orderForm(Model model){
        //model.addSubModel("order", new Order());
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Validated Order order, Errors errors){
        log.info("Order submitted: " + order);
        return "redirect:/";
    }
}
