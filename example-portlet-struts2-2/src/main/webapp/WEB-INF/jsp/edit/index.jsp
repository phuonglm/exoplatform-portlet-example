<%@ taglib prefix="s" uri="/struts-tags" %>

<h2>Manage bookmarks</h2>

<p>
   <table>
   <s:iterator value="%{bookmarks}" var="bookmark">
      <s:url action="editBookmark!input" id="editUrl">
         <s:param name="oldName" value="%{name}"/>
      </s:url>
      <s:url action="deleteBookmark" portletUrlType="action" id="deleteUrl">
         <s:param name="bookmarkName" value="%{name}"/>
      </s:url>
      <tr>
         <td><s:property value="%{name}"/></td>
         <td><a href="<s:property value="%{url}"/>" target="_blank"><s:property value="%{url}"/></a></td>
         <td><a href="<s:property value="%{editUrl}"/>">Edit</a></td>
         <td><a href="<s:property value="%{deleteUrl}"/>">Delete</a></td>
      </tr>
   </s:iterator>
   </table>
</p>

<s:form action="addBookmark">
   <table>
      <s:textfield name="name" label="Name"/>
      <s:textfield name="url" label="URL"/>
      <s:submit value="Add"/>
   </table>
</s:form>