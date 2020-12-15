package abstractClassesInterfaces;

import java.util.ArrayList;
import java.util.List;

public class McBurgerShop implements McFranchise {

    // Properties (can have as many custom as we want)
    protected List<String> menuItems;
    protected List<String> menuCategories;
    protected int seatingCapacity;
    protected int openTime;
    protected int closeTime;
    protected boolean iceCreamTime;



    // Constructor (for McBurgerShop)
    public McBurgerShop(List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime) {
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.iceCreamTime = iceCreamTime;
    }

    // Overrides
    @Override
    public void broilStuff(String menuItem) {
        System.out.println("The kitchen just cooked an order of: " + menuItem);
    }

    @Override
    public void businessHours(int openTime, int closeTime) {
        System.out.println("We are open from  " + openTime + " to " + closeTime);
    }

    @Override
    public String iceCreamMachineWorking() {
        if (this.iceCreamTime) {
            return "Time for ice cream!";
        }  else {
            return "No ice cream for you";
        }
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
