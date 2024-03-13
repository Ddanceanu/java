public class Drone extends Vehicle {
    private int flightDuration;

    public Drone(int id, Depot depot, int flightDuration) {
        super(id, depot);
        this.flightDuration = flightDuration;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Drone ID: " + getId() + ", Depot: " + getDepot().getName() + ", Max Flight Duration: " + getFlightDuration());
    }

    @Override
    public String toString() {
        return super.toString() + ", maxFlightDuration=" + flightDuration;
    }

}
