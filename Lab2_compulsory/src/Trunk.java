public class Trunk extends Vehicle {
    private int capacity;

    public Trunk(int id, Depot depot, int capacity) {
        super(id, depot);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Truck ID: " + getId() + ", Depot: " + getDepot().getName() + ", Capacity: " + getCapacity());
    }

    @Override
    public String toString() {
        return super.toString() + ", capacity=" + capacity;
    }
}
