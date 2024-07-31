package com.ash.inventory_service.service;

import com.ash.inventory_service.Repository.InventoryRepository;
import com.ash.inventory_service.dto.InventoryResponse;
import com.ash.inventory_service.model.Inventory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;

	@Transactional(readOnly = true)
	public List<InventoryResponse> isInStock(List<String> skuCodes) {
//		List<InventoryResponse> inventoryList  = skuCodes.stream()
//				.map(inventoryRepository::findBySkuCodeIn)
//				.map(inventory -> InventoryResponse.builder().skuCode(inventory != null ? inventory.getSkuCode() : "")
//				.isInStock(inventory != null ? inventory.getQuantity() > 0 : false).build())
//				.toList();
//		return inventoryList;
        return inventoryRepository.findBySkuCodeIn(skuCodes)
                .stream()
                .map(inventory ->
                    InventoryResponse.builder()
                            .skuCode(inventory.getSkuCode())
                            .isInStock(inventory.getQuantity() > 0 )
                            .build())
                .toList();
	}
}
