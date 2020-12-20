package HomeWork3_2;

import java.sql.SQLOutput;
import java.util.*;

public class CollectionUtils {


    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {

        return new ArrayList<T>();
    }

    public static <T> int indexOf(List<? extends T> source, T o) {
        int index = -1;

        if (source.contains(o)) {
            index = source.indexOf(o);
        }
        return index;
    }


    public static <T> List<T> limit(List<? extends T> source, int size) {
        List<T> shortList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            shortList.add(source.get(i));
        }
        return shortList;
    }


    public static <T> void add(List<? super T> source, T o) {
        source.add(o);


    }

    public static <T> void removeAll(List<? extends T> removeFrom, List<? super T> c2) {

        removeFrom.removeAll(c2);

    }

    public static <T> boolean containsAll(List<? extends T> c1, List<? super T> c2) {

        if (c1.containsAll(c2)) {
            return true;
        } else {
            return false;
        }
    }


    public static <T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        boolean isContains = false;
        for (T t : c2) {
            if (c1.contains(t)) {
                isContains = true;
                break;
            }
        }
        return isContains;
    }


    public static <T> List<T> range(List<? extends Integer> list, T min, T max) {


        Collections.sort(list);
        List<Integer> newList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer >= (Integer) min && integer <= (Integer) max) {
                newList.add(integer);
            }
        }

        return (List<T>) newList;


    }

    public static void main(String[] args) {
        //Реализация addAll()
        System.out.println("Реализация addAll");
        List<Integer> srcList = new ArrayList<>();
        srcList.add(10);
        srcList.add(5);
        srcList.add(1);
        List<Number> dstList = new ArrayList<>();

        addAll(srcList, dstList);
        System.out.println(dstList);


        //Реализация newArrayList()
        System.out.println("Реализация newArrayList()");
        List<Integer> newArrayList = newArrayList();


        //Реализация indexOf()
        System.out.println("Реализация indexOf()");
        int indexOfElement = indexOf(srcList, 10);
        System.out.println(indexOfElement + " - индекс искомого элемента");

        //Реализация limit()
        System.out.println("Реализация limit()");
        List<Integer> list = limit(srcList, 2);
        System.out.println(list);

        //Реализация add()
        System.out.println("Реализация add()");
        Integer o = 100; //Спросить, почему интежер проходит, хотя по super толжны проходить только сам класс и его родительские классы
        add(dstList, o);
        System.out.println(dstList);

        //Реализация removeAll()
        System.out.println("Реализация removeAll()");
        srcList.clear();
        srcList.add(10);
        srcList.add(3);
        srcList.add(4);
        srcList.add(5);
        List<Integer> removeElementsList = new ArrayList<>();
        removeElementsList.add(10);
        System.out.println(srcList);
        srcList.removeAll(removeElementsList);
        System.out.println(srcList);

        //Реализация containsAll()
        System.out.println("Реализация containsAll()");
        System.out.println(srcList);
        dstList.clear();
        dstList.addAll(srcList);
        System.out.println(dstList);
        System.out.println(containsAll(srcList, dstList));

        //Реализация containsAny()
        System.out.println("Реализация containsAny()");
        dstList.clear();
        dstList.add(5);
        System.out.println(srcList);
        System.out.println(dstList);
        System.out.println(containsAny(srcList, dstList));


        //Реализация range()
        System.out.println("Реализация range()");
        System.out.println(range(Arrays.asList(8, 1, 3, 5, 6, 4), 3, 6));


    }


}
