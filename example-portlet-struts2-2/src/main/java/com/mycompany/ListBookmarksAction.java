package com.mycompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletPreferences;

import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.apache.struts2.portlet.interceptor.PortletPreferencesAware;

import com.mycompany.domain.Bookmark;

public class ListBookmarksAction extends DefaultActionSupport implements PortletPreferencesAware {
	   private List<Bookmark> bookmarks = new ArrayList<Bookmark>();
	   private PortletPreferences portletPreferences;

	   public List<Bookmark> getBookmarks() {
	      return bookmarks;
	   }

	   public void setPortletPreferences(PortletPreferences portletPreferences) {
	      this.portletPreferences = portletPreferences;
	   }

	   @Override
	   public String execute() throws Exception {
	      // For simplicity, we'll assume that only bookmarks are stored in the preferences.
	      Map<String, String[]> preferencesMap = portletPreferences.getMap();
	      for(Map.Entry<String, String[]> entry : preferencesMap.entrySet()) {
	         bookmarks.add(new Bookmark(entry.getKey(), entry.getValue()[0]));
	      }
	      return SUCCESS;
	   }
	}
