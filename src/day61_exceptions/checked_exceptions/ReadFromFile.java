package day61_exceptions.checked_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args)  {
        try {
            String filePath = " src/day61_exceptions/checked_exceptions/data.txt";
            List<String> data = Files.readAllLines(Paths.get(filePath));
            System.out.println("First line = " + data.get(0));
            for (String datum : data) {
                System.out.println(datum);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("--The End---");
    }
}
