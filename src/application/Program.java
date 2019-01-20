package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		List<Department> ob = new ArrayList<>();
	
		
		ob.add(obj);
		ob.add(new Department(12, "Gol"));
		ob.add(new Department(33, "RH"));
		
		
		
		System.out.println(ob);

	}

}
