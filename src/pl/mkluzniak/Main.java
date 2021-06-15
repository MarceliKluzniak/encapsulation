package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {
        // Encapsulation = attributes of a class will be hidden or private,
        //                 Can be accessed only through methods (getters & setters)
        //                 You should make attributes private if you don't have a reason to make them public / protected
        Car car = new Car("Chevrolette", "Camaro", 2021);

        car.setYear(2022);//setter for change year of production
        car.setModel("Dust");//setter for change model of car
        System.out.println(car.getMake());//display every function what we want
        System.out.println(car.getModel());
        System.out.println(car.getYear());



    }
}
