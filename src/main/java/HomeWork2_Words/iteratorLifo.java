package HomeWork2_Words;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public interface iteratorLifo {

     default List<String> iteratorLifo(List<String> list){
        List<String> newList = new ArrayList<>();
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasPrevious()){
            String element = listIterator.previous();
            newList.add(element);
        }

        return newList;
    }


}
