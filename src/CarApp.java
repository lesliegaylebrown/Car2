import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Grand Circus Car Dealership\n");
        System.out.println("Here is a list of the available cars");


        ArrayList<Car> roster = new ArrayList<Car>();
        roster.add(new Car2("Tesla", "Model S",
                2017, 54999.90));
        roster.add(new Car2("Ford", "Focus",
                2017, 24500.99));
        roster.add(new Car2("Chevy", "Vette",
                2017, 64500.99));
        roster.add(new UsedCar("Honda", "S2000",
                2009, 53500.99, used, 12745.8));
        roster.add(new UsedCar("Ford", "Edsel",
                1958, 94500.99, used, 288.5));
        roster.add(new UsedCar("Ford", "Pinto",
                1975, 500.99, used, 8888.30));


        for (Car p : roster) {
            System.out.println(p);

            Scanner scan = new Scanner(System.in);

            System.out.println("Which car would you like?");


        }


    }
}
