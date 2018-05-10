package com.map;


import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2397576808640410124L;

	private Long depId;
	private String depName;
	private List<Employee> employees ;
	public Long getDepId() {
		return depId;
	}
	public void setDepId(Long depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public List<Employee> getEmployees() {
		
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		cloneDept(this);
		this.employees = employees;
	}
	
	public void cloneDept(Dept dept){
		Dept deptNew = new Dept();
		deptNew.setDepId(dept.getDepId());
		deptNew.setDepName(dept.getDepName());
		dept = deptNew;
	}
}
