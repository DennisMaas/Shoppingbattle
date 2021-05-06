package de.made.shoppingbattle.list.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("api/v1/")
public class RestController {

    @GetMapping("/")
    List<Item> getAllItems(String user) {
        return listService.getAllItems(user);
    }

 }