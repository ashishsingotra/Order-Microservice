package com.ash.inventory_service.Repository;

import com.ash.inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory , Long> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);

    //List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
