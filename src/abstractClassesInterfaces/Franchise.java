package abstractClassesInterfaces;

// I am declaring this to be an abstract class
public abstract class Franchise {
    // All the methods in an abstract class are like a list of rules or requirements for what needs to be implemented in any class that **extends** this abstract class

    // If we were to create a class that extends a Franchise
    //   i.e. McDonald's on I-10 vs McDonald's on Loop 1604

    // Properties (constant values)
    private final String companyName = "McDonald's"; // this is always the same, no matter where we build a franchise location
    private String managerName;

    // If we have enough properties to warrant a constructor - to set those values when initializing this class - let's create that here
    public Franchise(String managerName) {
        // we don't have to set companyName because it is already final
        this.managerName = managerName;

    }


    // Methods
    // abstract = have to write out this method WHEN you EXTEND/IMPLEMENT the abstract class / Interface
    public abstract void broilStuff(String menuItem); // broilStuff("bigMac")

    // static method = need to define it fully, so that when you call it (i.e. Franchise.broilStuff(...), it knows what to do
    public static void broilStuff(String menuItem, int randNumber) {
        System.out.println("Statically broiling some " + menuItem);
    }
    // for example, 8am = 800, 10pm = 2200
    public abstract void businessHours(int openTime, int closeTime);

    // non-void method
    public abstract boolean iceCreamMachineWorking();

    // non-abstract method
    public void greetCustomer() {
        // we have to write out the method body, because we did NOT use the
        //   abstract keyword when declaring the method
        System.out.println("Welcome to " + this.companyName + ". Enjoy your meal");
    }

    // Static
    // double result = Math.pow(10, 2);

    // Non-static
    // Math myCoolMathTool = new Math(); // the Math library doesn't let us do this

    // Getter / Setter
    public String getCompanyName() {
        return companyName; // can retrieve this from any class that extends this abstract class, even though it's declared private
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
