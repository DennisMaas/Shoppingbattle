package de.made.shoppingbattle.list.service;

import de.made.shoppingbattle.list.dao.ItemDao;
import de.made.shoppingbattle.list.model.Item;
import de.made.shoppingbattle.list.model.ItemDto;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListService{

    private final ItemDao itemDao;


    @Autowired
    public ListService(ItemDao itemDao) {
        this.itemDao = itemDao;
    }


    public List<Item> getAllItems(String user){
        val optionalList = itemDao.findAllBy(user);
        if (optionalList.isPresent()) {
            return optionalList.get();
        } else {
            return List.of();
        }
    }


    public Item addItem(ItemDto itemDto, String user) {
        return null;
    }
}