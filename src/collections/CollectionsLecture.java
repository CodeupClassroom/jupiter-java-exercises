package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class CollectionsLecture {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(23,46,32,10,6));
        for(int num:nums){
            System.out.println(num);
        }

        HashMap<Character,String> answers = new HashMap<>();

        answers.put('A',"Sally");
        answers.put('B',"Sally");
        answers.put('C',"Jimbo");
        answers.put('D',"Jimbo");
        answers.put('E',"Jim");

        System.out.println(answers.get('C'));

        System.out.println(answers.keySet());
        Set<Character> keys = answers.keySet();

        for(char key:keys){
            if(answers.get(key).equals("Jimbo")){
                System.out.println(key);
            }
        }

//        How can we find all of Jimbo's answers?
//        .value of?
//        Loop and condition
//        is there a value set method?
    }
}
