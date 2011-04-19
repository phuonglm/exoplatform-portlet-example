package com.mycompany.domain;

public class Bookmark {
	   private String name;
	   private String url;

	   public Bookmark(String name, String url) {
	      this.name = name;
	      this.url = url;
	   }
		
	   public String getName() {
	      return name;
	   }

	   public String getUrl() {
	      return url;
	   }
	}
