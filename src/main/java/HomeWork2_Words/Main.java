package HomeWork2_Words;

import java.io.*;
import java.util.*;

public class Main implements iteratorLifo{
    public static List<String> globalListOfWords;

    public static void main(String[] args) throws IOException {
        File file = new File("D:/1.txt");

        countOfWords(file);

        printSortedByLengthWords(globalListOfWords);

        printSortedByWords(globalListOfWords);

        printCountOfWords(globalListOfWords);

        reverseAllStrings(file);

        printSpecificStrings(file);

        Main main = new Main();
        System.out.println("____________________Переворот итератором____________________");
        System.out.println(main.iteratorLifo(globalListOfWords));

        System.out.println(globalListOfWords);




    }


    public static void countOfWords(File f) throws IOException {
        FileReader fr = new FileReader(f);
        BufferedReader reader = new BufferedReader(fr);

        StringBuffer strBuffer = new StringBuffer();
        while (reader.ready()) {
            strBuffer.append(reader.readLine()).append(" ");
        }


        char[] charArray = strBuffer.toString().toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (char c : charArray) {
            if (c != ',' && c != '.' && c != '!' && c != '?') {
                characterList.add(c);
            }
        }

        List<String> listOfWords = new ArrayList<>();

        StringBuffer clearStringBuffer = new StringBuffer();
        for (Character character : characterList) {
            clearStringBuffer.append(character);
        }
        listOfWords = Arrays.asList(clearStringBuffer.toString().split(" "));
        Set<String> setOfDifferentWords = new TreeSet<>(listOfWords);
        System.out.println(setOfDifferentWords.toString() + '\n');

        System.out.println("Количество слов в тексте равно " + listOfWords.size());
        System.out.println("Количество различных слов в тексте равно " + setOfDifferentWords.size());
        globalListOfWords = listOfWords;

    }

    public static void printSortedByLengthWords(List<String> list) {

        System.out.println("____________________Сортировка по длине слова_____________________");
        Set<String> setOfDifferentFords = new HashSet<>(list);
        List<Word> listOfWords = new ArrayList<>();
        for (String s : setOfDifferentFords) {
            listOfWords.add(new Word(s));
        }
        Collections.sort(listOfWords);

        for (Object o : listOfWords) {
            System.out.println(o);
        }
//        setOfDifferentFords.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }


    public static void printSortedByWords(List<String> list) {
        System.out.println("____________________Сортировка по тексту___________________________");
        Set<String> setOfDifferentWords = new HashSet<>(list);
        //list.stream().sorted(Comparator.comparing(String::hashCode)).forEach(System.out::println);
        List<WordToCompareByWord> listOfWords = new ArrayList<>();
        for (String s : setOfDifferentWords) {
            listOfWords.add(new WordToCompareByWord(s));
        }

        Collections.sort(listOfWords);

        for (WordToCompareByWord o : listOfWords) {
            System.out.println(o.word + " (HashCode = " + o.word.hashCode() + ")");
            // System.out.println();
        }


    }


    public static void printCountOfWords(List<String> list) {

        System.out.println("_____________CountOfWords______________");


        HashMap<String, Integer> mapOfWords = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            mapOfWords.put(list.get(i), 0);
        }

        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i);
            if (mapOfWords.containsKey(key)) {
                mapOfWords.put(key, mapOfWords.get(key) + 1);

            }
        }
        System.out.println(mapOfWords);

    }


    public static void reverseAllStrings(File f) throws IOException {
        System.out.println("_______________________________Reversed Strings__________________________________");
        FileReader fr = new FileReader(f);
        BufferedReader reader = new BufferedReader(fr);
        while (reader.ready()) {
            String reversed = new StringBuffer(reader.readLine()).reverse().toString();
            System.out.println(reversed);

        }
    }

    public static void printSpecificStrings(File f) throws IOException {
        System.out.println("_______________________________PrintStringByUserIndex__________________________________");
        FileReader fr = new FileReader(f);
        ArrayList<String> listOfStrings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(fr);
        while (reader.ready()) {
            String singleString = reader.readLine();
            listOfStrings.add(singleString);
        }
        System.out.println("Введите номер строки в диапазоне от 0 до  " + (listOfStrings.size() - 1));
        BufferedReader inputStringNumberReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int numberOfString = Integer.parseInt(inputStringNumberReader.readLine());
            if (numberOfString == -1) {
                break;
            }
            if (numberOfString < listOfStrings.size() && numberOfString >= 0) {
                System.out.println(listOfStrings.get(numberOfString));
            } else {
                System.out.println("Такой строки не существует");
            }
            System.out.println("Для завершения введите -1");
        }

    }


}



