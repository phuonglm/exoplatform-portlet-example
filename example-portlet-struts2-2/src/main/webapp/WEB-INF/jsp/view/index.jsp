<%@ taglib prefix="s" uri="/struts-tags" %>

<strong>Bookmarks</strong>
<p>
   <table>
   <s:iterator value="%{bookmarks}" var="bookmark">
      <tr>
         <td><s:property value="%{name}"/></td>
         <td><a href="<s:property value="%{url}"/>" target="_blank"><s:property value="%{url}"/></a></td>
      </tr>
   </s:iterator>
   </table>
</p>