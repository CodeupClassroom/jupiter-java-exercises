package abstractClassesInterfaces;

import java.util.List;

public class McBurgerShop implements McFranchise{

    /*
     * Manager (i.e. "Ronald McDonald")
     * Menu Items (i.e. ['Big Mac', 'French Fries', ...]
     * Menu Categories (i.e. ['Sandwiches', 'Sides', 'Desserts', ...]
     * Max Seating Capacity (i.e. 250)
     * Recipe to Cook Items
     * Opening Time
     * Closing Time
     */

    private String manager;
    private List<String> menuItems;
    private List<String> menuCategories;
    private int maxSeatingCapacity;
    private int openingTime;
    private int closingTime;

    public McBurgerShop(String manager, List<String> menuItems, List<String> menuCategories, int maxSeatingCapacity, int openingTime, int closingTime) {
        this.manager = manager;
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.maxSeatingCapacity = maxSeatingCapacity;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    // Overrides from Interface


    @Override
    public void cookMeal(String foodItem) {
        System.out.println("The kitchen just cooked a " + foodItem);
    }

    @Override
    public void businessHours() {
        System.out.println("We are open from " + getOpeningTime() + " - " + getClosingTime());
    }

    // Getters and Setters
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
