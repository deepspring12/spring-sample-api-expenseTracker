package com.deepspring12.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deepspring12.tag.Tag;

@RestController
@RequestMapping("expense-tracker/tags")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/{tagId}/sum")
	public int getPriceForTag(@PathVariable String tagId) {
		return itemService.getPriceForTag(tagId);
	}
	
	
	@RequestMapping("/{tagId}/items")
	public List<Item> getAllItems(@PathVariable String tagId) {
		return itemService.getAllItems(tagId);
	}

	@RequestMapping("/{tagId}/items/{name}")
	public Item getItem(@PathVariable String name) {
		return itemService.getItem(name);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/{tagId}/items/")
	public void addItem(@RequestBody Item item, @PathVariable String tagId) {
		item.setTag(new Tag(tagId, "",""));
		itemService.addItem(item);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{tagId}/items/{id}")
	public void updateItem(@RequestBody Item item, @PathVariable String tagId) {
		item.setTag(new Tag(tagId,"",""));
		itemService.updateItem(item);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{tagId}/items/{name}")
	public void removeItem(@PathVariable String name) {
		itemService.removeItem(name);
	}
	

}
