package de.made.shoppingbattle.list.controller;

import de.made.shoppingbattle.list.model.ItemDto;
import de.made.shoppingbattle.list.model.Item;
import de.made.shoppingbattle.list.service.ListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("api/v1/")
public class RestController {

    private ListService listService;


    public RestController(ListService listService) {
        this.listService = listService;
    }


    @GetMapping("/")
    List<Item> getAllItems(String user) {
        return listService.getAllItems(user);
    }

    @PostMapping("/add")
    public Item addItem(@RequestBody ItemDto itemDto, String user) {
        return this.listService.addItem(itemDto, user);
    }
 }