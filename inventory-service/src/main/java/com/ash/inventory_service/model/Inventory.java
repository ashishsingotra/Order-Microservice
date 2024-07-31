package com.ash.inventory_service.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_inventory")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String skuCode;
    private Integer quantity;

}
