package com.mycompany;

import java.util.Map;

import javax.portlet.PortletPreferences;

import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.portlet.interceptor.PortletPreferencesAware;

import com.opensymphony.xwork2.Preparable;

public class EditBookmarkAction extends DefaultActionSupport implements PortletPreferencesAware, Preparable, ParameterAware {

	   private String oldName;
	   private String name;
	   private String url;
		
	   private PortletPreferences portletPreferences;
	   private Map<String, String[]> parameters;
		
	   public String getOldName() {
	      return oldName;
	   }
		
	   public void setOldName(String oldName) {
	      this.oldName = oldName;
	   }
		
	   public String getUrl() {
	      return url;
	   }

	   public void setUrl(String url) {
	      this.url = url;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
		
	   public void setPortletPreferences(PortletPreferences portletPreferences) {
	      this.portletPreferences = portletPreferences;
	   }
		
	   public void setParameters(Map<String, String[]> parameters) {
	      this.parameters = parameters;
	   }
		
	   public void prepare() throws Exception {
	      // Since the prepare interceptor is run before the parameter interceptor, 
	      // we have to get the parameter "manually".
	      this.oldName = parameters.get("oldName")[0];
	      this.url = portletPreferences.getValue(oldName, null);
	   }
		
	   public String execute() throws Exception {
	      // The modification is handled as remove/add
	      portletPreferences.reset(oldName);
	      portletPreferences.setValue(name, url);
	      portletPreferences.store();
	      return SUCCESS;
	   }
	}
