package br.com.ExemploJDBC.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.ExemploJDBC.model.Students;

public class CRUDStudents<T> extends AbstractCRUD<T> {

	@Override
	public boolean create(T o) throws SQLException {
		Students std = (Students) o;
		String query = 
				"INSERT INTO student (first_name, dept_id, tot_cred) "
				+ "VALUES (?, ?, ?)";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		stmt.setString(1, std.getFirst_name());
		stmt.setInt(2, std.getDept_id());
		stmt.setString(3, std.getTot_cred());
		int rows = stmt.executeUpdate();
		if(rows > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		String query = "DELETE FROM student WHERE student_id = ?";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		stmt.setInt(1,id);

		int rows = stmt.executeUpdate();
		if(rows>0) return true;
		return false;
	}

	@Override
	public boolean update(T o) throws SQLException{
		Students std = (Students) o;
		String query = "UPDATE student SET first_name = ?, dept_id = ?, tot_cred = ? WHERE student_id = ?";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		stmt.setString(1, std.getFirst_name());
		stmt.setInt(2, std.getDept_id());
		stmt.setString(3, std.getTot_cred());
		stmt.setInt(4, std.getIdStudent());

		int rows = stmt.executeUpdate();
		if(rows>0) return true;
		return false;
	}

	@Override
	public T getById(int id) throws SQLException{
		String query = "SELECT * FROM student WHERE student_id = ?";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		stmt.setInt(1, id);
		ResultSet result = stmt.executeQuery();
		result.next();
		Students std = new Students();
		std.setIdStudent(result.getInt(1));
		std.setFirst_name(result.getString(2));
		std.setDept_id(result.getInt(3));
		std.setTot_cred(result.getString(4));
		return (T) std;
	}

	@Override
	public ArrayList<T> listAll() throws SQLException {
		String query = "SELECT * FROM department";
        PreparedStatement stmt = super.connection.prepareStatement(query);
        ResultSet result = stmt.executeQuery();
        ArrayList<Students> students = new ArrayList<Students>();
        while(result.next()) {
            Students std = new Students();
            std.setIdStudent(result.getInt(1));
            std.setFirst_name(result.getString(2));
            std.setDept_id(result.getInt(3));
            std.setTot_cred(result.getString(4));
            students.add(std);
        }
        return (ArrayList<T>) students;
	}


}
