package com.mycompany;

import javax.portlet.PortletPreferences;

import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.apache.struts2.portlet.interceptor.PortletPreferencesAware;

public class AddBookmarkAction extends DefaultActionSupport implements PortletPreferencesAware {

	   private String name;
	   private String url;
		
	   private PortletPreferences portletPreferences;

	   public void setName(String name) {
	      this.name = name;
	   }

	   public void setUrl(String url) {
	      this.url = url;
	   }
		
	   public void setPortletPreferences(PortletPreferences portletPreferences) {
	      this.portletPreferences = portletPreferences;	
	   }

	   @Override
	   public String execute() throws Exception {
	      portletPreferences.setValue(name, url);
	      portletPreferences.store();
	      return SUCCESS;
	   }
	}
