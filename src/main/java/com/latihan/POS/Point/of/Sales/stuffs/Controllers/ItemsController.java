package com.latihan.POS.Point.of.Sales.stuffs.Controllers;

import latihan.math.BasicCalculations;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.latihan.POS.Point.of.Sales.stuffs.Models.ItemsModel;
//import com.latihan.POS.Point.of.Sales.stuffs.simpleStatistics.BasicCalculations;


@RestController
@RequestMapping("/items")
public class ItemsController {
	private Integer originalStock=0;
	private Integer resultStock=0;
	
	private static final Logger log = LoggerFactory.getLogger(ItemsController.class);
	
//	@Autowired //need to be enabled when you're using spring bean instead. but if you're not using spring based library then you have to disable it
	BasicCalculations basicMathUtils;
	
	@PostMapping(path="/stocks/sum")
	public Float allStocks(@RequestBody List<ItemsModel> items) {
		ArrayList<Float> setOfNumbers=new ArrayList<Float>();
		
		for(int index=0;index<items.size();index++) {
			setOfNumbers.add((float) items.get(index).getStock());
		}
		
		if(setOfNumbers.size()>0) {
			log.warn(""+setOfNumbers.size());
			return basicMathUtils.sum(setOfNumbers);
		}
		
		return (float)-1;
	}
	
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

