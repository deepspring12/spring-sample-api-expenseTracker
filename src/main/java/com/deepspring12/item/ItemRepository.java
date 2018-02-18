package com.deepspring12.item;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, String>{
	
	public List<Item> findByTagId(String tagId);
}
