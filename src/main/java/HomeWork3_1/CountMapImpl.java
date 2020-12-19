package HomeWork3_1;

import java.util.*;

public class CountMapImpl<T> implements CountMap<T> {

    private ArrayList<T> list = new ArrayList<>();

    public ArrayList<T> getList() {
        return list;
    }

    @Override
    public void add(T o) {
        list.add(o);
        //System.out.println(list);
    }

    @Override
    public int getCount(T o) {
        int count = 0;
        for (T elem : list) {
            if (elem.equals(o)) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int remove(T o) {
        Iterator<T> listIterator = list.iterator();
        int count = getCount(o);
        while (listIterator.hasNext()) {
            T elem = listIterator.next();

            if (elem.equals(o)) {
                listIterator.remove();
            }
        }
        System.out.println(list + " удален элемент " + o);

        return count;
    }

    @Override
    public int size() {
        Set<T> setOfDifferentElements = new HashSet<>(list);
        return setOfDifferentElements.size();
    }


    @Override
    public void addAll(CountMap<T> source) {
        Map<Integer, T> mapOfElements = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            mapOfElements.put(i, list.get(i));
        }

        ArrayList<T> listOfNewElements = ((CountMapImpl<T>) source).getList();
        Map<Integer, T> mapOfSourceElements = new HashMap<>();
        for (int i = 0; i < listOfNewElements.size(); i++) {
            mapOfSourceElements.put(i, listOfNewElements.get(i));
        }
        System.out.println(mapOfElements);
        System.out.println(mapOfSourceElements);

        for (Map.Entry<Integer, T> entry : mapOfSourceElements.entrySet()) {
            Integer key = entry.getKey();
            T value = mapOfSourceElements.get(key);
            if (mapOfElements.containsKey(key)) {
                Integer newValue = (Integer) mapOfElements.get(key) + (Integer) value;
                mapOfElements.put(key, (T) newValue);
            } else {
                mapOfElements.put(mapOfElements.size(), value);
            }
        }
        System.out.println(mapOfElements);


    }

    @Override
    public Map<T, Integer> toMap() {
        Map<T, Integer> mapOfElements = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            mapOfElements.put(list.get(i), 0);
        }

        for (int i = 0; i < list.size(); i++) {
            T key = list.get(i);
            if (mapOfElements.containsKey(key)) {
                mapOfElements.put(key, mapOfElements.get(key) + 1);
            }
        }


        return mapOfElements;
    }

    @Override
    public void toMap(Map<T, T> destination) {
        Map<T, Integer> mapOfElements = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            mapOfElements.put(list.get(i), 0);
        }

        for (int i = 0; i < list.size(); i++) {
            T key = list.get(i);
            if (mapOfElements.containsKey(key)) {
                mapOfElements.put(key, mapOfElements.get(key) + 1);
            }
        }
            destination = (Map<T, T>) mapOfElements;

        System.out.println(destination);

    }


}
