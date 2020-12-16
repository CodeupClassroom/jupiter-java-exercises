package abstractClassesInterfaces;

// Declaring this as an 'interface'
public interface McFranchise {
    // Properties
    String companyName = "McDonald's"; // this String is a constant

    // We won't have a constructor in an 'interface'  ( only in abstract classes )

    // Abstract Methods (that we have to completely write out in any class that IMPLEMENTS this interface
    void broilStuff(String menuItem);
    void businessHours(int openTime, int closeTime);
    String iceCreamMachineWorking();
    // void greetCustomer(); // declare as abstract
}
