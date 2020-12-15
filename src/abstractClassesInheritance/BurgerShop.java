package abstractClassesInheritance;

import java.util.List;

public class BurgerShop extends Franchise{

    // Properties specific to this franchise
    private String manager;
    private List<String> menuItems;
    private List<String> menuCategories;
    private int maxSeatingCapacity;
    private int openingTime;
    private int closingTime;

    // Constructor

    public BurgerShop(String manager, List<String> menuItems, List<String> menuCategories, int maxSeatingCapacity, int openingTime, int closingTime) {
        this.manager = manager;
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.maxSeatingCapacity = maxSeatingCapacity;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }


    // now we have to define all the methods we set up in the Franchise abstract method
    // We'll need to "override" each of the methods we define (from the abstract class)

    // Broil Stuff method
    @Override
    public void broilStuff(String menuItem) {
        System.out.println("The kitchen has now cooked a fresh " + menuItem);
    }

    // Business Hours
    @Override
    public void businessHours(int openTime, int closeTime) {
        // We can now output the open and close time
        System.out.println("Open time is: " + openTime);
        System.out.println("Close time is: " + closeTime);
    }

    // Getters & Setters

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

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

    public int getMaxSeatingCapacity() {
        return maxSeatingCapacity;
    }

    public void setMaxSeatingCapacity(int maxSeatingCapacity) {
        this.maxSeatingCapacity = maxSeatingCapacity;
    }

    public int getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(int openingTime) {
        this.openingTime = openingTime;
    }

    public int getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(int closingTime) {
        this.closingTime = closingTime;
    }
}
