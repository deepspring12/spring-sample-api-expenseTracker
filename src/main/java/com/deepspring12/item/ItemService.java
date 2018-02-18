package com.deepspring12.item;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	public void addItem(Item item) {
		itemRepository.save(item);
	}

	public void updateItem(Item item) {
		itemRepository.save(item);
	}

	public void removeItem(String name) {
		itemRepository.delete(name);
	}
	
	public List<Item> getAllItems(String tagId) {
		List<Item> items= new ArrayList<>();
		itemRepository.findByTagId(tagId).forEach(items::add);
		return items;
	}

	public Item getItem(String name) {
		return itemRepository.findOne(name);
	}

	public int getPriceForTag(String tagId) {
		List<Item> items= new ArrayList<>();
		itemRepository.findByTagId(tagId).forEach(items::add);
		int sum = 0;
		for(int i=0; i<items.size(); i++) {
			sum += items.get(i).getPrice();
		}
		return sum;
	}

	

	


}
