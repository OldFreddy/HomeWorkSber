package HomeWork3_1;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<>();
        // добавляет элемент в этот контейнер.
        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);


        //Возвращает количество добавлений данного элемента
        System.out.println("\nВозвращает количество добавлений данного элемента");
        int elem = 10;
        System.out.println(map.getCount(elem) + " раз был добавлен элемент " + elem);

        //количество разных элементов
        System.out.println("\nколичество разных элементов");
        System.out.println(map.size() + " уникальных элемента");


        //Добавить все элементы из source в текущий контейнер,
        // при совпадении ключей, суммировать значения
        System.out.println("\nДобавить все элементы из source в текущий контейнер, при совпадении ключей, суммировать значения ");

        CountMap<Integer> map2 = new CountMapImpl<>();
        map2.add(3);
        map2.add(10);
        map2.add(14);
        map2.add(15);
        map2.add(16);
        map2.add(17);
        map2.add(18);
        map.addAll(map2);


        //Вернуть java.util.Map. ключ - добавленный элемент,
        // значение - количество его добавлений
        System.out.println("\nВернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений");
        Map<Integer,Integer> map3 = map.toMap();
        System.out.println(map3 + "____________");


        //Тот же самый контракт как и toMap(), только всю информацию записать в destination
        System.out.println("\nТот же самый контракт как и toMap(), только всю информацию записать в destination");
        Map<Integer,Integer> mapDestination = new HashMap<>();

        map.toMap(mapDestination);


        //Удаляет элемент из контейнера и возвращает количество его добавлений(до удаления)
        System.out.println("\nУдаляет элемент из контейнера и возвращает количество его добавлений(до удаления)");
        System.out.println(map.remove(5) + " раза был добавлен перед удалением");


    }


}
