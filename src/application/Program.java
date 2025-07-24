package application;

import java.util.List;
import java.util.Scanner;

import model.entities.CsvProcessor;
import model.entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CsvProcessor service = new CsvProcessor();
		
		System.out.println("File path:");
		String path = sc.nextLine();
		
		List<Product> produtos = service.readProducts(path);
		service.writeSummary(produtos, path);

		
		
		sc.close();
	}

}
