package HomeWork10_1_Multithreading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String filename = "D:/1.txt";
        List<Long> listOfNums = new ArrayList<>();
        createListOfInts(filename, listOfNums);
        System.out.println(listOfNums);
        for (int i = 0; i < listOfNums.size(); i++) {
            new FactorialThread(listOfNums.get(i)).start();
        }
    }

    public static List<Long> createListOfInts(String filename, List<Long> newList) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            newList.add(scanner.nextLong());
        }
        return newList;
    }
}
