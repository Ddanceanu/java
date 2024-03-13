public abstract class Vehicle {
    private int id;
    private Depot depot;

    public Vehicle(int id, Depot depot) {
        this.id = id;
        this.depot = depot;
        depot.addVehicle(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Depot getDepot() {
        return depot;
    }

    public void setDepot(Depot depot) {
        this.depot = depot;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", depot=" + depot.getName() + // Presupunând că clasa Depot are o metodă getName()
                '}';
    }

    // Metode abstracte care pot fi suprascrise de subclasele specifice (Truck, Drone, etc.)
    public abstract void displayVehicleInfo();
}
