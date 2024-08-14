package net.java.Dao;

import java.util.List;

import net.java.model.Employee;



public interface Dao {
	int save (Employee emp);
	List<Employee> getAll();
	Employee getById(int id);
	int remove(int id);
	int update(int id, Employee emp);
}
