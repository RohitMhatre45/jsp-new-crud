<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<%@ page import="net.java.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
 <h1>Employee List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Quantity</th>
            <th>Price</th>
            <th>Date</th>
        </tr>
        <% 
            List<Employee> employeeList = (List<Employee>) request.getAttribute("employeeList");
        	System.out.println(employeeList);
            if (employeeList != null) {
                for (Employee emp : employeeList) {
        %>
        <tr>
            <td><%= emp.getId() %></td>
            <td><%= emp.getName() %></td>
            <td><%= emp.getQuantity() %></td>
            <td><%= emp.getPrice() %></td>
            <td><%= emp.getDate() %></td>
        </tr>
        <% 
                }
            } 
        %>
    </table>
    <a href="addEmployee.jsp">Add New Employee</a>



</body>
</html>