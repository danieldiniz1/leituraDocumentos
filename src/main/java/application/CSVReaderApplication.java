package application;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReaderApplication {

    private static final String CSV_PATH = "C:\\Users\\danie\\Downloads\\transacoes-2022-01-01.csv";

    public static void main(String[] args) {

        try {
            CSVReader csvReader = new CSVReader(new FileReader(new File(CSV_PATH)));

            List<List<String>> linhas = new ArrayList<List<String>>();
            String[] colunas = null;

            while ((colunas = csvReader.readNext()) != null){
                linhas.add(Arrays.asList(colunas));
            }
            linhas.forEach(cols -> {
                System.out.println(cols);
            });

        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }

    }
}
