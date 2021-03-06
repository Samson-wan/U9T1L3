public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public boolean isHasTrailer(){
    return hasTrailer;
  }

  public double calculateTollPrice(){
    if(isHasTrailer()){
      return getTollFee() * axles * 2;
    }
    return getTollFee() * axles;
  }

  public boolean validateLicensePlate(){
    if(!isHasTrailer()) {
      return true;
    }
    else if ((axles > 4 && getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX")) || (axles <= 4) && getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX")) {
        return true;
    }
    return false;
  }


  public void printInfo(){
    super.printInfo();
    System.out.println("Number of axles: " + axles);
    System.out.println("Has trailer? "+ hasTrailer);
  }
}