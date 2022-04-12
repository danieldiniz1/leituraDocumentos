package application;

import java.io.*;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        String path = "C:\\Users\\danie\\Documents\\Daniel_Diniz\\java\\Prof-Nelio-alves\\leitura-documentos\\in.txt";


        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line = bf.readLine();
            while (line != null){
                System.out.println(line);
                line = bf.readLine();
            }
        }catch (IOException ex){
            System.out.println("ERRO: " + ex.getMessage());
        }
    }
}
