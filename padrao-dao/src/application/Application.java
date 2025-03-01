package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Application {

	public static void main(String[] args) {
		Department departamento = new Department(1, "Books");
		System.out.print(departamento);	
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0);
		System.out.println(seller);
	}

}
