<%@ page import="com.csw.entity.AugOrder" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Java软件工程师
  Date: 2018/10/25
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/" method="post">
    <%
        {
    %>
       <%
            AugOrder augOrder = new AugOrder();

       %>

    交接单id:<input type="number" value="<%=augOrder.getDelivery_id()%>"><br/><br/>
    订单类型<input type="text" value="<%=augOrder.getOrder_type()%>"><br/><br/>
    <%--货物名称<input type="text" value="${augOrder.cargo_name}"><br/><br/>--%>
    <%--货物重量(按公斤)<input type="text" value="${augOrder.cargo_weight}"><br/><br/>--%>
    <%--邮寄人<input type="number" value="${augOrder.sender_name }"><br/><br/>--%>
    <%--邮寄地址<input type="text" value="${augOrder.sender_address }"><br/><br/>--%>
    <%--配送地址<input type="text" value="${augOrder.delivery_address }"><br/><br/>--%>
    <%--订单状态<input type="text" value="${augOrder.order_state }"><br/><br/>--%>
    <%--邮寄人电话<input type="text" value="${augOrder.sender_tel }"><br/><br/>--%>
    <%--收货人<input type="text" value="${augOrder.consignee }"><br/><br/>--%>
    <%--收货人电话<input type="text" value="${augOrder.consignee_tel }"><br/><br/>--%>
    <%--起始城市<input type="text" value="${augOrder.start_city }"><br/><br/>--%>
    <%--中点城市<input type="text" value="${augOrder.midpoint_city }"><br/><br/>--%>
    <%--终点城市<input type="text" value="${augOrder.destination_city }"><br/><br/>--%>
    <%--运送价格<input type="text" value="${augOrder.transport_price }"><br/><br/>--%>
    <%--配送价格<input type="number" value="${augOrder.delivery_price }"><br/><br/>--%>
    <%--运输价格<input type="number" value="${augOrder.carriage_price }"><br/><br/>--%>
    <%--总价格<input type="number" value="${augOrder.total_price }"><br/><br/>--%>
    <%--车辆<input type="number" value="${augOrder.vehicle }"><br/><br/>--%>
    <%--备注<input type="text" value="${augOrder.order_comment }"><br/><br/>--%>
    <input type="submit">
   <% } %>
</form>
</body>
</html>
