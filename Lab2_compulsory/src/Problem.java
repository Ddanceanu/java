import java.util.ArrayList;

public class Problem {
    private ArrayList<Depot> depots;

    public Problem() {
        this.depots = new ArrayList<>();
    }

    public void addDepot(Depot depot) {
        depots.add(depot);
    }

    public ArrayList<Vehicle> getVehicles() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (Depot depot : depots) {
            vehicles.addAll(depot.getVehicles());
        }
        return vehicles;
    }
}
