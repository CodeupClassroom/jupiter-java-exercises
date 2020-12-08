package oopLecture;

public class Dog {

    // relating to slide 3

    public String name;
    public String breed;
    public final String animalType = "Canine";
    public boolean canBreed;
    public int age;

    // relating to slide 4
    public void callForDog(String name) {
        if (name.equalsIgnoreCase(this.name)) {
            System.out.println(this.name + " is now walking toward you!");
        } else {
            System.out.println(this.name + " ignores you.");
        }
    }

}
