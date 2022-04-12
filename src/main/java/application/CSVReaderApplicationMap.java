package application;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CSVReaderApplicationMap {

    private static final String CSV_PATH = "C:\\Users\\danie\\Downloads\\transacoes-2022-01-01.csv";

    public static void main(String[] args) {

        try {
            CSVReader csvReader = new CSVReader(new FileReader(new File(CSV_PATH)));

            List<Map<String,String>> linhas = new ArrayList<Map<String,String>>();
            String[] headers = csvReader.readNext();
            String[] colunas = null;

            while ((colunas = csvReader.readNext()) != null){
                Map<String, String> campos = new HashMap<String, String>();

                for(int i = 0; i < colunas.length; i++){
                    campos.put(headers[i],colunas[i]);
                }
                linhas.add(campos);
            }
            linhas.forEach(linha -> {
                // BANCO DE ORIGEM,  AGENCIA ORIGEM,  CONTA ORIGEM,  BANCO DESTINO,  AGENCIA DESTINO,  CONTA DESTINO,  VALOR DA TRANSACAO,  DATA
                System.out.println("--------");
                System.out.println(linha);
            });

        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }

    }
}
