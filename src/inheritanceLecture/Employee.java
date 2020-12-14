package inheritanceLecture;
import util.Input;

public class Employee {
    protected String name;
    public int id;
    public final static String company = "Codeup";

    public Employee(){

    }
    public Employee(String name){
        this.name = name;
    }

    public void doWork(){
        System.out.println("Working... working...");
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

//    public String getString(){
//        Input sc = new Input();
//        return sc.getString();
//    }

    public static void main(String[] args) {
        Employee sarah = new Employee("Sarah");
        Employee ryan = new Developer("Ryan");

        ryan.doWork();
//        ryan.working();

    }
}
