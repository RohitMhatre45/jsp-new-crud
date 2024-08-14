package net.java.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.java.Dao.Dao;
import net.java.model.Employee;
import net.java.utill.SqlUtil;

public class DaoImpl implements Dao {

	@Override
	public int save(Employee emp) {
		 int result = -1;
	        try {
	            SqlUtil.Connect();
	            String query = "INSERT INTO employee (id, name, quantity, price, date) VALUES ("
	                + emp.getId() + ", '"
	                + emp.getName() + "', "
	                + emp.getQuantity() + ", "
	                + emp.getPrice() + ", '"
	                + emp.getDate() + "');";
	            result = SqlUtil.insert(query);
	            SqlUtil.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return result;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employeeList = new ArrayList<Employee>();
	        try {
	            SqlUtil.Connect();
	            String query = "SELECT * FROM employee;";
	            ResultSet rs = SqlUtil.fetch(query);
	            System.err.println("doa impl hai");
	            System.out.println(rs);
	            if (rs != null) {
	                while (rs.next()) {
	                    int id = rs.getInt("id");
	                    String name = rs.getString("name");
	                    int quantity = rs.getInt("quantity");
	                    float price = rs.getFloat("price");
	                    String date = rs.getString("date");
	                    Employee emp = new Employee();
	                    emp.setId(id);
	                    emp.setName(name);
	                    emp.setQuantity(quantity);
	                    emp.setPrice(price);
	                    emp.setDate(date);
	                    employeeList.add(emp);
	                }
	            }
	            SqlUtil.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	        return employeeList;
	}

	@Override
	public Employee getById(int id) {
		Employee emp = null;
        try {
            SqlUtil.Connect();
            String query = "SELECT * FROM employee WHERE id = " + id + ";";
            ResultSet rs = SqlUtil.fetch(query);
            if (rs != null && rs.next()) {
                emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setQuantity(rs.getInt("quantity"));
                emp.setPrice(rs.getFloat("price"));
                emp.setDate(rs.getString("date"));
            }
            SqlUtil.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return emp;
	}

	@Override
	public int remove(int id) {
		 int result = -1;
	        try {
	            SqlUtil.Connect();
	            String query = "DELETE FROM employee WHERE id = " + id + ";";
	            result = SqlUtil.delete(query);
	            SqlUtil.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	        return result;
	}

	@Override
	public int update(int id, Employee emp) {
		int result = -1;
        try {
            SqlUtil.Connect();
            String query = "UPDATE employee SET "
                + "name = '" + emp.getName() + "', "
                + "quantity = " + emp.getQuantity() + ", "
                + "price = " + emp.getPrice() + ", "
                + "date = '" + emp.getDate() + "' "
                + "WHERE id = " + id + ";";
            result = SqlUtil.update(query);
            SqlUtil.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return result;
	}

}
