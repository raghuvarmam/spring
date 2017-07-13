package com.spring.prepared;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate jdbc;

	public Boolean saveEmployeeByPreparedStatement( final Employee e){
		String query="insert into employee values(?,?,?)";  
		return jdbc.execute(query, new PreparedStatementCallback<Boolean>(){	
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1,e.getId());  
				ps.setString(2,e.getName());  
				ps.setFloat(3,e.getSalary());  
				return ps.execute();  	
			}
		});
	}
	
	

	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void updateEmployeeByPreparedStatement(final Employee e) {
		String query="update employee set name =?,salary = ? WHERE id =? ";

		PreparedStatementCallback<Integer>  p= new PreparedStatementCallback<Integer>() {
			//Employee ep= new Employee();

			public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(1,e.getName());
				ps.setFloat(2,e.getSalary());
				ps.setInt(3,e.getId());
				int status= ps.executeUpdate();
				
				return status;
			}
		};
		jdbc.execute(query, p);
		System.out.println("updated");
	}



	public void deleteEmployee(final int id) {

		String query="delete from employee where id=?";
		PreparedStatementCallback<Integer> p= new PreparedStatementCallback<Integer>() {			
			public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, id);
				int status= ps.executeUpdate();
				return status;
			}
		};
		jdbc.execute(query, p);
		System.out.println("deleted and rows effected are ");
	}


	
	public Employee getEmployeebyId(int id) {
		String query="select * from employee where id ="+id;
		ResultSetExtractor<Employee> p= new ResultSetExtractor<Employee>() {

			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
				rs.next();
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				return e;
			}
		};
		Employee ed= jdbc.query(query, p);
		System.out.println("employee details");
		return ed;		
	}

}
