package com.ash.inventory_service;

import com.ash.inventory_service.Repository.InventoryRepository;
import com.ash.inventory_service.model.Inventory;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
//
//		return args -> {
//			Inventory inventory = new Inventory();
//			inventory.setSkuCode("iphone_13");
//		inventory.setQuantity(100);
//
//			Inventory inventory1 = new Inventory();		inventory1.setSkuCode("iphone_13_red");
//			inventory1.setQuantity(100);
//
//		inventoryRepository.save(inventory);
//		inventoryRepository.save(inventory1);
//		};
//
//	}
}
