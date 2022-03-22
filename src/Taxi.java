public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected){
        super(licensePlate, tollFee, passengers, isElectric);
        this.fareCollected = fareCollected;
    }

    public boolean chargeAndDropOffRiders(double farePerRider){
        int rider = getPassengers() - 1;
        boolean success = dropOffPassengers(rider);
        double fare = farePerRider * rider;

        fareCollected += fare;
        return success;
    }

    public double getFareCollected(){
        return fareCollected;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Fare Collected: " + fareCollected);
    }
}
