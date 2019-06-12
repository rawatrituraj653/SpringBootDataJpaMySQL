package com.st.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.entity.Product;
import com.st.repo.ProductRepository;

@Component
public class ConsoleRuuner implements CommandLineRunner{

	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * repo.save(new Product("Emi", "gmail", 3.3)); repo.save(new Product("sap",
		 * "main", 3.3)); repo.save(new Product("wes", "rest", 3.3)); repo.save(new
		 * Product("met", "quora", 3.3)); repo.save(new Product("set", "provide", 3.3));
		 * repo.save(new Product("red", "redhat", 3.3)); repo.save(new Product("mapper",
		 * "sahre", 3.3)); repo.save(new Product("shop", "wise", 3.3));
		 */
		//repo.save(new Product(101,"wins", "wets", 5.3));
		//repo.save(new Product(102,"wines", "wets", 6.3));
		
		List<Product> pList=Arrays.asList(
				new Product(103,"R", "A", 10.3),
				new Product(104,"I", "C",11.3),
				new Product(105,"T", "W", 12.3),
				new Product(106,"U", "L", 13.3),
				new Product(107,"R", "K", 14.3),
				new Product(108,"A", "J",15.3),
				new Product(109,"A", "J", 16.3),
				new Product(110,"J", "B", 17.3)
				);
				
			repo.saveAll(pList);	
			
			Optional<Product> o= repo.findById(201);
			if(o.isPresent()) {
				Product p=o.get();
				System.out.println(p.getProdName()+"......."+p.getComName()+"....."+p.getProdCost());
			}else
				System.out.println("Row is Not present"); 
			
			List<Product> plist=repo.findAll();
			//plist.forEach(System.out::println);
			plist.forEach((s)->System.out.println(s));
			//repo.deleteById(101);
			//repo.deleteAll();
			//repo.deleteAllInBatch();
			
	} 
	
}
