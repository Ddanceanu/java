import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Problem problem = new Problem();
        Depot depot1 = new Depot("Iasi");
        Depot depot2 = new Depot("Cluj");
        problem.addDepot(depot1);
        problem.addDepot(depot2);

        new Trunk(1, depot1, 200);
        new Trunk(2, depot1, 350);
        new Drone(10, depot1, 40);
        new Trunk(1, depot2, 180);
        new Trunk(2, depot2, 250);
        new Drone(10, depot2, 60);

        ArrayList<Vehicle> vehicles = problem.getVehicles();
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle);
    }
}