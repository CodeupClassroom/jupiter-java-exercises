public class Person {
    private String name;

    public Person(String name){
//        setName(name);
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Bob");
        person1.sayHello();
        System.out.println(person1.getName());

        Person person2 = person1;

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        System.out.println(person1 == person2);
    }
}
