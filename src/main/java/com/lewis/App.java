package com.lewis;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {

    public String fileLocation = "C:\\Users\\Fraser\\IdeaProjects\\InsultSelector\\insults.csv";

    public static void main( String[] args ) throws IOException {
        insultFinder();
    }

    public static void insultFinder() throws IOException {
        System.out.println("Here is your insult!");
        List<String[]> insults = insultArrayList("C:\\Users\\Fraser\\IdeaProjects\\InsultSelector\\insults.csv");
        System.out.println(fileReader(insults));
    }

    public static List<String[]> insultArrayList(String fileLocation) throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader(fileLocation));
        List<String[]> insults = csvReader.readAll();

        return insults;
    }

    public static String fileReader(List<String[]> insults) throws IOException {
            String[] insultsArray = insults.get(numberGenerator(insults));
            return insultsArray[0];
    }

    public static int numberGenerator(List<String[]> insultsArray){
        Random r = new Random();
        int Low = 0;
        int High = insultsArray.size();
        int result = r.nextInt(High-Low) + Low;

        return result;
    }
}
