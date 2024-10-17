package com.campusdual.classroom;

public class FuelTank {

  protected int actualFuel = 10;


  public void showDetails() {
    System.out.println("Current capacity is " + this.actualFuel + " liters.");
  }


  public int getActualFuel() {

    return this.actualFuel;

  }

  public void setActualFuel(int newFuel) {
    if (newFuel < 0) {
      System.out.println("Value cannot be a negative number.");
    } else {
      this.actualFuel = newFuel;
    }
  }
}
