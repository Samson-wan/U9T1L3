public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean isElectric(){
    return electric;
  }

  public boolean isDiscountApplied(){
    return discountApplied;
  }

  public boolean dropOffPassengers(int numOut){
    if(numOut < getPassengers()){
      setPassengers(getPassengers() - numOut);
      return true;
    }
    return false;
  }

  public void applyDiscount(){
    if(isElectric() && !isDiscountApplied()){
      setTollFee(getTollFee() / 2);
      discountApplied = true;
    }
  }

  public double calculateTollPrice(){
    if(getPassengers() > 4){
      return getTollFee() * 4;
    }
    return getTollFee() * getPassengers();
  }


  public void printInfo(){
    super.printInfo();
    System.out.println("Electric? " + electric);
    System.out.println("Discount applied? "+ discountApplied);
  }
}