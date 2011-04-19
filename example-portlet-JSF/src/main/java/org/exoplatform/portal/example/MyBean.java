package org.exoplatform.portal.example;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Wesley
 * Date: Feb 17, 2007
 * Time: 2:28:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyBean {

   private boolean showDebugFlag;
   private Map monthList;
   private String selectedMonth;
   public String firstName;

   public boolean isShowDebugFlag() {
      return showDebugFlag;
   }

   public void setShowDebugFlag(boolean showDebugFlag) {
      this.showDebugFlag = showDebugFlag;
   }

   public Map getMonthList() {
      if (monthList == null) {
         monthList = new HashMap();
         monthList.put("Mr.", "Mr.");
         monthList.put("Mrs.", "Mrs.");
         monthList.put("Miss", "Miss");
      }
      return monthList;
   }

   public void setMonthList(Map monthList) {
      this.monthList = monthList;
   }

   public String getSelectedMonth() {
      return selectedMonth;
   }

   public void setSelectedMonth(String selectedMonth) {
      this.selectedMonth = selectedMonth;
   }


   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }


   public String userSignup() {
      FacesContext context = FacesContext.getCurrentInstance();
      if (firstName == null || firstName.length() < 1) {
         context.addMessage(null,
                 new FacesMessage(FacesMessage.SEVERITY_ERROR, "first name cannot be empty", "first name cannot be empty"));
         return "signupError";
      }

      return "signupComplete";
   }

   public String test() {
      return null;
   }
}
