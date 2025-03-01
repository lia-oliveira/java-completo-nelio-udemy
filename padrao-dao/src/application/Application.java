package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Application {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====== TEST 1: Seller FindById");
		Seller seller = sellerDao.findById(1);
		System.out.println(seller);
		
		System.out.println("====== TEST 2: Seller FindByDepartment");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("====== TEST 3: Seller FindAll");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("====== TEST 4: Seller insert");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("====== TEST 5: Seller update ======");
		seller = sellerDao.findById(1);
		seller.setName("Marta waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		System.out.println("====== TEST 6: Seller delete ======");
		
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.print("Delete completed");
	}

}
