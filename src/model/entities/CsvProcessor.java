package model.entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvProcessor {

	public List<Product> readProducts(String originalFilePath) {

		List<Product> product = new ArrayList<>();

		try (BufferedReader read = new BufferedReader(new FileReader(originalFilePath))) {

			String line = read.readLine();

			while (line != null) { // Enquanto estiver algo na linha faça:

				String[] fields = line.split(","); // pegar cada elemento separado por ","

				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				product.add(new Product(name, price, quantity));

				line = read.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		return product;
	}

	public void writeSummary(List<Product> list, String originalFilePath) {
		
		File originalFile = new File(originalFilePath);
		String pastaOrigem = originalFile.getParent(); // pega a pasta onde tá o .csv original

		File pastaOut = new File(pastaOrigem + "/out");
		pastaOut.mkdir(); // cria a pasta se não existir

		File summaryFile = new File(pastaOut, "summary.csv"); // monta o caminho final

		try (BufferedWriter wr = new BufferedWriter(new FileWriter(summaryFile))) {
			for (Product p : list) {
				wr.write(p.toString());
				wr.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}