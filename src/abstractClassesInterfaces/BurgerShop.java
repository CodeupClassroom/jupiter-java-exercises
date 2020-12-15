package abstractClassesInterfaces;

import java.util.ArrayList;
import java.util.List;

// BurgerShop will be the "San Antonio" installation of a "Franchise"
public class BurgerShop extends Franchise {
    // This will be an ACTUAL McDonald's store
    //  It has to follow all the 'rules' set in the "Franchise" abstract class

    // properties (can have as many custom as we want)
    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean iceCreamTime;

    // Constructor
    public BurgerShop(String managerName, List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime) {
        // managerName is in the superclass (Franchise)
        // initialize an instance of the Franchise class
        super(managerName);
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.iceCreamTime = iceCreamTime;
    }

    // Override the methods that have to be written, per the 'Franchise' abstract class
    @Override
    public void broilStuff(String menuItem) {
        System.out.println("The kitchen just cooked up a lovely " + menuItem);
    }

    @Override
    public void businessHours(int openTime, int closeTime) {
        System.out.println("We are open from  " + openTime + " to " + closeTime);
    }

    @Override
    public boolean iceCreamMachineWorking() {
        // This _could_ just be replaced by a getter, but if wanted to make it more complex, we could also check if the store is open, and THEN return true
        if( this.openTime > 100 ) {
            return this.iceCreamTime;
        }
        return false;
    }


    public static void main(String[] args) {
        List<String> theseMenuItems = new ArrayList<>();
        theseMenuItems.add("Big Mac");
        theseMenuItems.add("French Fries");
        List<String> theseCategories = new ArrayList<>();
        theseCategories.add("Entrées");
        theseCategories.add("Sides");
        BurgerShop mcDonaldsSanAntonio = new BurgerShop("Casey Friday", theseMenuItems, theseCategories, 200, 800, 2300, true);

        mcDonaldsSanAntonio.setManagerName("Vivian Canales");
        mcDonaldsSanAntonio.setIceCreamTime(false); // :-(
    }

    // Getters and Setters
    public List<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    public List<String> getMenuCategories() {
        return menuCategories;
    }

    public void setMenuCategories(List<String> menuCategories) {
        this.menuCategories = menuCategories;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isIceCreamTime() {
        return iceCreamTime;
    }

    public void setIceCreamTime(boolean iceCreamTime) {
        this.iceCreamTime = iceCreamTime;
    }
}
