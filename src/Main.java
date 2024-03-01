//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Encapsulation = attributes of a class will be hidden or private,
        //Can be accessed only through methods(getters 7 setters)
        //You should make attributes private if you dont have a reason to make them public/protected
        Car car = new Car("Chevrolet", "Camaro", 2021);

        car.setYear(2024);
        System.out.println(car.getYear());
        System.out.println(car.getModel());
        System.out.println(car.getMake());


    }
}