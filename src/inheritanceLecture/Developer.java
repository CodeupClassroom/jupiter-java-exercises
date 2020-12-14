package inheritanceLecture;

public class Developer extends Employee{
    public Developer(){
    }
    public Developer(String name){
        super(name);
    }

    public void doWork(){
        System.out.println("Writing code...");
    }

    public void working(){
        super.doWork();
    }

    public void debug(){
        System.out.println("DEBUGGING");
    }

    public static void main(String[] args) {
        Employee Bob = new Employee("Bob");
        Bob.doWork();
        System.out.println(Bob.getName());
//        Bob.debug(); <- this will not work

        Developer John = new Developer("John");
        John.doWork();
        John.working();

        System.out.println(John.getName());
        John.debug();
        System.out.println(John.name);;
    }
}
