package test;

public class Main {
    public static void main(String[] args) {
        PerimeterSquare perimeterSquare = new PerimeterSquare();
        try {
            perimeterSquare.getPerimeter("g");
        } catch (PerimeterException e) {
            e.printStackTrace();
        }
    }
}
