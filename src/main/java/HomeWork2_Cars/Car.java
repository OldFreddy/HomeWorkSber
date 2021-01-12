package HomeWork2_Cars;

class Car {
    String model;
    String type;

    public Car(String model, String type) {
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return this.model + " " + this.type;
    }
}
