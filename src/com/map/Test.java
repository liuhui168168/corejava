package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Dept> map = new HashMap<String,Dept>();
		Dept dept = new Dept();
		dept.setDepId(1L);
		dept.setDepName("�ƹ�һ��");
		map.put("dept", dept);
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee emp = new Employee();
		emp.setEmpId(1L);
		emp.setName("С��");
		emp.setAge(20);
		emp.setSex(1);
		employees.add(emp);
		
		Employee emp2 = new Employee();
		emp2.setEmpId(2L);
		emp2.setName("С��2");
		emp2.setAge(22);
		emp2.setSex(1);
		employees.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setEmpId(3L);
		emp3.setName("С��3");
		emp3.setAge(23);
		emp3.setSex(1);
		employees.add(emp3);
		
		dept.setEmployees(employees);
		dept.setDepId(2L);
		
		System.out.println(map.get("dept").getDepId());
		System.out.println(dept.getDepId());
	}

}
