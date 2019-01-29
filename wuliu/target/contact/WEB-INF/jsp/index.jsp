<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>物流管理</title>
    <style>
        table{
            border:1px solid black;
            width:auto;
            height:auto;
        }

    </style>
</head>
<body>
<table  action="/" method="get">
    <th>交接单id</th>
    <th>订单类型</th>
    <th>货物名称</th>
    <th>货物重量(按公斤)</th>
    <th>邮寄人</th>
    <th>邮寄地址</th>
    <th> 配送地址</th>
    <th> 订单状态</th>
    <th>邮寄人电话</th>
    <th>收货人</th>
    <th>收货人电话</th>
    <th>起始城市</th>
    <th>中点城市</th>
    <th>终点城市</th>
    <th>运送价格</th>
    <th>配送价格</th>
    <th>运输价格</th>
    <th>总价格</th>
    <th>车辆</th>
    <th>备注</th>
    <th>删除</th>
<c:forEach items="${augOrders}" var="augOrder">
    <tr>
    <td>${augOrder.delivery_id}</td>
    <td>${augOrder.order_type}</td>
    <td>${augOrder.cargo_name}</td>
    <td>${augOrder.cargo_weight}</td>
    <td>${augOrder.sender_name }</td>
    <td>${augOrder.sender_address }</td>
    <td>${augOrder.delivery_address }</td>
    <td>${augOrder.order_state }</td>
    <td>${augOrder.sender_tel }</td>
    <td>${augOrder.consignee }</td>
    <td>${augOrder.consignee_tel }</td>
    <td>${augOrder.start_city }</td>
    <td>${augOrder.midpoint_city }</td>
    <td>${augOrder.destination_city }</td>
    <td>${augOrder.transport_price }</td>
    <td>${augOrder.delivery_price }</td>
    <td>${augOrder.carriage_price }</td>
    <td>${augOrder.total_price }</td>
    <td>${augOrder.vehicle }</td>
    <td>${augOrder.order_comment }</td>
    <td><a href="/del/${augOrder.order_id}">删除</a></td>
    </tr>
</c:forEach>
</table>
</body>
</html>