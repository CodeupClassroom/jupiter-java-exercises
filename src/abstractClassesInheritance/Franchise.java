package abstractClassesInheritance;

import java.util.List;

// we'll declare this an abstract class
public abstract class Franchise {

    // All the methods in this abstract class are like a list of requirements for what needs to be in a class that **extends** this class

    // If we were to create a class that extends a Franchise, what sorts of things should a fresh new franchise do?



    // Properties (constant)
    private final String companyName = "McBurgers";


    // Methods
    public abstract void broilStuff(String menuItem);
    public abstract void businessHours(int openTime, int closeTime);

    // Because these methods are **abstract**, we don't have to actually write them here, but we DO have to write them in any class that EXTENDS this abstract class


}
