package HomeWork2_Cars;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        Car ladaSedan = new Car("Лада", "Седан");
        Car ladaHatchback = new Car("Лада", "Хэтчбэк");
        Car mercedesSedan = new Car("Мерседес", "Седан");
        Car bmwCrossover = new Car("Бмв", "Кроссовер");
        Car fordHatchback = new Car("Форд", "Хэтчбэк");
        Car peugeotCrossover = new Car("Пежо", "Кроссовер");
        Car toyotaSedan = new Car("Тойота", "Седан");

        cars.add(ladaSedan);
        cars.add(ladaHatchback);
        cars.add(mercedesSedan);
        cars.add(bmwCrossover);
        cars.add(fordHatchback);
        cars.add(peugeotCrossover);
        cars.add(toyotaSedan);


        Set<String> typeSet = new HashSet<>();
        for (Car car : cars) {
            typeSet.add(car.type);
        }

        Map<String, ArrayList<Car>> mapOfCars = new HashMap<>();
        for (String type : typeSet) {
            mapOfCars.put(type, new ArrayList<>());
            ArrayList<Car> bufferArrayOfCars = getArrayListOfTypes(cars, type);
            //System.out.println(bufferArrayOfCars + "\n");
            mapOfCars.put(type, bufferArrayOfCars);
        }

        System.out.println(mapOfCars);
    }

    public static ArrayList<Car> getArrayListOfTypes(List<Car> cars, String type) {
        //System.out.println("________________________ArrayList________________________________");
        ArrayList<Car> typedCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.type.equals(type)) {
                typedCars.add(car);

            }
        }

        return typedCars;
    }
}

