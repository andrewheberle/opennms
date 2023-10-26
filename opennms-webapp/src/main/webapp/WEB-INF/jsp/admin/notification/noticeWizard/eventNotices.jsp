<%--
/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2002-2022 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2022 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

--%>

<%@page language="java"
	contentType="text/html"
	session="true"
	import="org.opennms.web.admin.notification.noticeWizard.*"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="https://www.owasp.org/index.php/OWASP_Java_Encoder_Project" prefix="e"%>

<%@ page import="org.opennms.web.utils.Bootstrap" %>
<% Bootstrap.with(pageContext)
          .headTitle("Event Notifications")
          .headTitle("Admin")
          .breadcrumb("Admin", "admin/index.jsp")
          .breadcrumb("Configure Notifications", "admin/notification/index.jsp")
          .breadcrumb("Event Notifications")
          .build(request);
%>
<jsp:directive.include file="/includes/bootstrap.jsp" />

<script type="text/javascript" >

    function editNotice(name)
    {
        document.notices.userAction.value="edit";
        document.notices.notice.value=name;
        document.notices.submit();
    }
    
    function deleteNotice(name)
    {
        if (confirm("Are you sure you want to delete the notification " + name + "?"))
        {
          document.notices.userAction.value="delete";
          document.notices.notice.value=name;
          document.notices.submit();
        }
    }
    
    function setStatus(name, status)
    {
        document.notices.userAction.value=status;
        document.notices.notice.value=name;
        document.notices.submit();
    }
    
    function newNotice()
    {
        document.notices.userAction.value="new";
        document.notices.submit();
    }
    
</script>

<form method="post" name="notices" action="admin/notification/noticeWizard/notificationWizard">
<input type="hidden" name="userAction" value=""/>
<input type="hidden" name="notice" value=""/>
<input type="hidden" name="sourcePage" value="<%=NotificationWizardServlet.SOURCE_PAGE_NOTICES%>"/>

<div class="card">
  <div class="card-header">
    <h4 class="pull-left">Event Notifications</h4>
    <button class="pull-right btn btn-secondary" onclick="javascript:newNotice()"><i class="fa fa-plus"></i> Add New Event Notification</button>
  </div>
  <div class="card-body">
        <table class="table table-sm table-striped">
          <tr>
            <th colspan="3">
              Actions
            </th>
            <th>
              Notification
            </th>
            <th>
              Event
            </th>
            <th>
              UEI
            </th>
          </tr>
          <c:forEach items="${notifications}" var="notification">
          <tr>
            <td>
              <input type="button" class="btn btn-secondary" value="Edit" onclick="javascript:editNotice('${e:forJavaScript(notification.name)}')"/>
            </td>
            <td>
              <input type="button" class="btn btn-secondary" value="Delete"  onclick="javascript:deleteNotice('${e:forJavaScript(notification.name)}')"/>
            </td>
            <td>
            <c:choose>
              <c:when test="${notification.isOn}">
                <input type="radio" value="Off" onclick="javascript:setStatus('${e:forJavaScript(notification.name)}','off')"/>Off
                <input type="radio" value="On" CHECKED onclick="javascript:setStatus('${e:forJavaScript(notification.name)}','on')"/>On
              </c:when>
              <c:otherwise>
                <input type="radio" value="Off" CHECKED onclick="javascript:setStatus('${e:forJavaScript(notification.name)}','off')"/>Off
                <input type="radio" value="On" onclick="javascript:setStatus('${e:forJavaScript(notification.name)}','on')"/>On
              </c:otherwise>
            </c:choose>
            </td>
            <td>
            ${fn:escapeXml(notification.name)}
            </td>
            <td>
              ${fn:escapeXml(notification.eventLabel)}
            </td>
            <td>
              ${fn:escapeXml(notification.displayUei)}
            </td>
          </tr>
          </c:forEach>
        </table>
  </div>
</div> <!-- card -->

</form>

<jsp:include page="/includes/bootstrap-footer.jsp" flush="false" />
