package test;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws PerimeterException {
        if (side <= 0) {
            throw new PerimeterException("Side is incorrect");
        }
        this.side = side;
    }
}
