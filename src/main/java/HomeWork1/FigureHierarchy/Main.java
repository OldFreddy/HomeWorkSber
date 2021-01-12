package HomeWork1.FigureHierarchy;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Rect rect = new Rect();
        rect.draw();

        new Square().draw();

        new Triangle().draw();
    }
}
