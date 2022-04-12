package application;

import model.Product;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        String path = "C:\\Users\\danie\\Documents\\Daniel_Diniz\\java\\Prof-Nelio-alves\\leitura-documentos\\in.txt";
        List<Product> produtos = new ArrayList<Product>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line = bf.readLine();
            line = bf.readLine();
            while (line != null){
                String[] vect = line.split(",");
                Product produto = new Product(vect[0], BigDecimal.valueOf(Double.valueOf(vect[1])),Integer.parseInt(vect[2]));
                produtos.add(produto);

                line = bf.readLine();

            }
        }
        catch (IOException ex){
            System.out.println("ERRO: " + ex.getMessage());
        }
        produtos.forEach(product -> System.out.println(product.toString()));
    }
}
