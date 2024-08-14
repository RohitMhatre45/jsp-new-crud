<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Register Form</title>
</head>
<body>
 <h1>Employee Register Form</h1>
  <form action=EmployeeServ method="post">
   <table style="width: 80%">
    <tr>
     <td>Name</td>
     <td><input type="text" name="name" required /></td>
    </tr>
    <tr>
     <td>Quantity</td>
     <td><input type="number" name="quantity" required /></td>
    </tr>
    <tr>
     <td>Price</td>
     <td><input type="text" name="price" required /></td>
    </tr>
    <tr>
     <td>Date</td>
     <td><input type="date" name="date" required /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
</body>
</html>
