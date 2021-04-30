package com.aem.demo.core.models;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AuthorImple{
	@Inject
	private String name;
	
	public String getName() {
	return name;
	}
	@Inject
	private String gender;
	
	public String getGender() {
	return gender;
	}
	 @ValueMapValue
	    private List<String> books;
	 
	 public List<String> getBooks() {
	        if (books != null) {
	            return new ArrayList<String>(books);
	        } else {
	            return Collections.emptyList();
	        }
	    }
}
