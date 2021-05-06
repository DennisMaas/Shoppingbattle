package de.made.shoppingbattle.list.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {
    @Id
    String id;
    String name;
    String description;
    int amount;

}

