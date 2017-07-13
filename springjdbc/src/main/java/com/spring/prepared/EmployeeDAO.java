package com.spring.prepared;

import java.util.List;

interface EmployeeDAO {
	public Boolean saveEmployeeByPreparedStatement(final Employee e);
	public void updateEmployeeByPreparedStatement(final Employee e);
	public void deleteEmployee(int id);
	public Employee getEmployeebyId(int id);
}
