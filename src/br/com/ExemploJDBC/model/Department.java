package br.com.ExemploJDBC.model;

public class Department {
	private int idDepartment;
	private String nameDepartment;
	private String buildingDepartment;
	private double budgetDepartment;
	
	public int getIdDepartment() {
		return this.idDepartment;
	}
	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}
	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public String getBuildingDepartment() {
		return buildingDepartment;
	}
	public void setBuildingDepartment(String buildingDepartment) {
		this.buildingDepartment = buildingDepartment;
	}

	public double getBudgetDepartment() {
		return budgetDepartment;
	}
	public void setBudgetDepartment(double budgetDepartment) {
		this.budgetDepartment = budgetDepartment;
	}
	
}
