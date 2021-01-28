package newTests;

public class MyClass {

    public int getSomNum(int num) {
        if(num == 0){
            throw  new IllegalArgumentException("0 нельзя");
        }
        return num + 4;
    }
}
