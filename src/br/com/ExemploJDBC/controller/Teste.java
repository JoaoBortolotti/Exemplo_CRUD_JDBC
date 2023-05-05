package br.com.ExemploJDBC.controller;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.ExemploJDBC.model.Department;
import br.com.ExemploJDBC.model.Students;

public class Teste {
	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);

		AbstractCRUD<Department> crudDept;
		crudDept = new CRUDDepartment<Department>();
		Department dep = new Department();

		// AbstractCRUD<Students> crudStd;
		// crudStd = new CRUDStudents<Students>();
		// Students std = new Students();

		try {
			System.out.println(crudDept.open());
			// System.out.println(crudStd.open());

			dep.setIdDepartment(1);
			dep.setNameDepartment("Teste");
			dep.setBuildingDepartment("TesBuilding");
			dep.setBudgetDepartment(12);

			// std.setIdStudent(3);
			// std.setFirst_name("Marcos");
			// std.setDept_id(4);
			// std.setTot_cred("500");
			crudDept.create(dep);


			System.out.println(crudDept.close());
			// System.out.println(crudStd.close());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
