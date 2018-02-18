package com.deepspring12.tag;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {

	@Autowired
	private TagRepository tagRepository;
	
	public void addTag(Tag tag) {
		tagRepository.save(tag);
	}

	public void updateTag(String id, Tag tag) {
		tagRepository.save(tag);
	}

	public void removeTag(String id) {
		tagRepository.delete(id);
	}

	public List<Tag> getAllTags() {
		List<Tag> tags = new ArrayList<>();
		tagRepository.findAll().forEach(tags::add);
		return tags;
	}

	public Tag getTag(String id) {
		return tagRepository.findOne(id);
	}

	

}
