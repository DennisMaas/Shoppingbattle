package de.made.shoppingbattle.list.service;

import de.made.shoppingbattle.list.dao.ItemDao;
import de.made.shoppingbattle.list.model.Item;
import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

class ListServiceTest {

    final ItemDao itemDao = Mockito.mock(ItemDao.class);
    final ListService listService = new ListService(itemDao);

    @Test
    @DisplayName("Returns all Items gets Optional.empty List and return Empty List")
    void itShouldGetAllItems() {
        //GIVEN
        val giveUser = "user";
        val expected = List.of();
        Optional<List<Item>> mongoDbFails = Optional.empty();

        when(itemDao.findAllBy(giveUser)).thenReturn(mongoDbFails);
        //WHEN
        val actual = listService.getAllItems(giveUser);

        //THEN
        assertThat(actual, is(expected));
    }
}