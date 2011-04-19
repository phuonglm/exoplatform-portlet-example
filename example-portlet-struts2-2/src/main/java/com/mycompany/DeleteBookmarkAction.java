package com.mycompany;

import javax.portlet.PortletPreferences;

import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.apache.struts2.portlet.interceptor.PortletPreferencesAware;

public class DeleteBookmarkAction extends DefaultActionSupport implements PortletPreferencesAware{

	   private String bookmarkName;
		
	   private PortletPreferences portletPreferences;

	   public void setBookmarkName(String bookmarkName) {
	      this.bookmarkName = bookmarkName;
	   }
		
	   public void setPortletPreferences(PortletPreferences portletPreferences) {
	      this.portletPreferences = portletPreferences;
	   }
		
	   @Override
	   public String execute() throws Exception {
	      portletPreferences.reset(bookmarkName);
	      portletPreferences.store();
	      return SUCCESS;
	   }

	}
