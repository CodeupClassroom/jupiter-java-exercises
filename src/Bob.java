import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

//        Create a class Bob for the following exercise with a main method. Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//            Bob answers 'Sure.' if you ask him a question.
//            He answers 'Whoa, chill out!' if you yell at him.
//            He says 'Fine. Be that way!' if you address him without actually saying anything.
//            He answers 'Whatever.' to anything else.

        Scanner sc = new Scanner(System.in);
        System.out.print("What will you say to Bob? ");
        String userResponse = sc.nextLine().trim();
        System.out.println(userResponse);

        if (userResponse.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userResponse.endsWith("?")) {
            System.out.println("Sure");
        } else if (userResponse.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }

    }
}
