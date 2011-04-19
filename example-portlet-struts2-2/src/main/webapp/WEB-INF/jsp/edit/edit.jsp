<%@ taglib prefix="s" uri="/struts-tags" %>

<h2>Edit bookmark</h2>

<s:form action="editBookmark">
   <input type="hidden" name="oldName" value="<s:property value="%{oldName}"/>"/>
   <table>
      <s:textfield name="name" label="Name" value="%{oldName}"/>
      <s:textfield name="url" label="URL"/>
      <s:submit value="Update"/>
   </table>
</s:form>