package abstractClassesInterfaces;

import java.util.ArrayList;
import java.util.List;

public class OnlyRunThings {
    // this is a waste of a class that only exists to run things
    public static void main(String[] args) {
        // Let's try to access some of a McBurgerShop's items / methods
        List<String> theseMenuItems = new ArrayList<>();
        theseMenuItems.add("Big Mac");
        theseMenuItems.add("French Fries");
        theseMenuItems.add("Quarter Pounder");
        List<String> theseCategories = new ArrayList<>();
        theseCategories.add("Entrées");
        theseCategories.add("Sides");
        theseCategories.add("Drinks");
        McBurgerShop mcDonaldsDallas = new McBurgerShop(theseMenuItems, theseCategories, 200, 800, 2300, true);

        Franchise.broilStuff("Big Mac", 43);

        // Loop through all of the menu items and print each one of them to the screen
        for ( String thisItem : mcDonaldsDallas.getMenuItems() ) {
            // Looking at one menu item at a time
            mcDonaldsDallas.broilStuff(thisItem);

            // System.out.println("Menu Item: " + thisItem);
        }

        // Create an instance of AustinMcD, which implements methods SLIGHTLY differently than McBurgerShop
        AustinMcD austinMcDonalds = new AustinMcD(theseMenuItems, theseCategories, 200, 800, 2300, true);
        for ( String thisItem : austinMcDonalds.getMenuItems() ) {
            // See how Austin cooks their menu items
            austinMcDonalds.broilStuff(thisItem);
        }
    }
}
