package de.made.shoppingbattle.list.dao;

import de.made.shoppingbattle.list.model.Item;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface ItemDao extends PagingAndSortingRepository<Item, String> {

    Optional<List<Item>> findAllBy(String user);

}






