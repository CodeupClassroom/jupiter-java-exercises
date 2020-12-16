import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers); // just a pointer to location in memory
        System.out.println(Arrays.toString(numbers));


        Person[] people = new Person[3];
        people[0] = new Person("Vivian");
        people[1] = new Person("Sophia");
        people[2] = new Person("Justin");

        for(Person person : people){
            System.out.println(person.getName());
        }

        Person[] newArray = addPerson(people, new Person("Casey"));

        for(Person person: newArray){
            System.out.println(person.getName());
        }

    }

    public static Person[] addPerson(Person[] pplArray, Person personToAdd){
        Person[] tempArray = Arrays.copyOf(pplArray, pplArray.length+1);
        tempArray[tempArray.length-1] = personToAdd;

        return tempArray;
    }
}
