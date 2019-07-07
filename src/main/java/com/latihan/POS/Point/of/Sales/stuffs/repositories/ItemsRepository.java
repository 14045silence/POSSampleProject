package com.latihan.POS.Point.of.Sales.stuffs.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.latihan.POS.Point.of.Sales.stuffs.Models.ItemsModel;

public interface ItemsRepository extends CrudRepository<ItemsModel,String>{
//	List<ItemsModel> getAllItems();
//	List<ItemsModel> getSpecificItem(String id);
//	ItemsModel newItem(ItemsModel itemDetail);
}

