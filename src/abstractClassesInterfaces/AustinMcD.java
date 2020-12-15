package abstractClassesInterfaces;

import java.util.List;

public class AustinMcD extends McBurgerShop {



    // Constructor
    public AustinMcD(List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime) {
        super(menuItems, menuCategories, seatingCapacity, openTime, closeTime, iceCreamTime);
        // this super() call, is instantiating an instance that has all of the listed properties, but now available in THIS method
    }

    // Implementing the Override methods from the interface
    @Override
    public void broilStuff(String menuItem) {
        System.out.println("The hipster kitchen just whipped up a " + menuItem);
    }

    @Override
    public void businessHours(int openTime, int closeTime) {
        System.out.println("Our store is open from the lovely hours of " + openTime + " to " + closeTime);
    }

    @Override
    public String iceCreamMachineWorking() {
        if (this.iceCreamTime) {
            return "Made with all organic milk!";
        }  else {
            return "We ran out of organic milk; therefore, no ice cream";
        }
    }


}
