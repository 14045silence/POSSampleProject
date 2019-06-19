package com.latihan.POS.Point.of.Sales.stuffs.Controllers;

import javax.validation.constraints.NotBlank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.latihan.POS.Point.of.Sales.stuffs.Models.ItemsModel;


@RestController
@RequestMapping("/items")
public class ItemsController {
	private Integer originalStock=0;
	private Integer resultStock=0;
	@GetMapping("/")
	public ItemsModel get_items() {
		ItemsModel items = new ItemsModel();
		return items;
	}
	
	@GetMapping("/{itemId}")
	public ItemsModel get_item_detail(@PathVariable("itemId") @NotBlank String itemId) {
		ItemsModel item = new ItemsModel();
		item.setId(itemId);
		return item;
	}
	
	@PostMapping("/")
	public ItemsModel add_item(@RequestBody ItemsModel itemInfo) {
		ItemsModel item = new ItemsModel();
		item.setId(itemInfo.getId());
		item.setName(itemInfo.getName());
		item.setStock(itemInfo.getStock());
		return item;
	}
	
	@PostMapping("/{itemId}/stock")
	public ItemsModel add_item_stock(@PathVariable("itemId") @NotBlank String itemId,@RequestBody Integer addedStockCount) {
		ItemsModel item = new ItemsModel();
		item.setId(itemId);
		originalStock=item.getStock();
		resultStock=originalStock+addedStockCount;
		item.setStock(resultStock);
		return item;
	}
}

