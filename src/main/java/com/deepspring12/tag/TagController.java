package com.deepspring12.tag;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("expense-tracker")
public class TagController {

	@Autowired
	private TagService tagService;
		
	@RequestMapping(method = RequestMethod.POST, value = "/tags")
	public void addTag(@RequestBody Tag tag) {
		tagService.addTag(tag);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/tags/{id}")
	public void updateTag(@RequestBody Tag tag, @PathVariable String id) {
		tagService.updateTag(id, tag);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/tags/{id}")
	public void removeTag(@PathVariable String id) {
		tagService.removeTag(id);
	}

	@RequestMapping("/tags")
	public List<Tag> getAllTags() {
		return tagService.getAllTags();
	}

	@RequestMapping("/tags/{id}")
	public Tag getTag(@PathVariable String id) {
		return tagService.getTag(id);
	}

}
