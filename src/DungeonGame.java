import java.util.Random;
import java.util.Scanner;

public class DungeonGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Welcome to the Dungeon!");
        System.out.println("===================================");

/*
        Let's create a boss to defeat.
        - a variable to store the enemyName
        - a variable to store its maxHealth
        - a variable to store its enemyAttackDamage
 */
        Random rand = new Random();

        String enemyName = "Grandma Terl";
        int enemyMaxHealth = rand.nextInt(100);
        String enemyAttack = "Book 1:1";
        int enemyAttackDamage = 15;



/*
        Now let's create our player.
        - a variable to store heroName ask for user input.
        - a variable to store health
        - a variable to store  attackDamage
        - how many healthPotions should we have?
        - how much health should the potion restore?
 */
        System.out.println("Hello hero, what is your name?");
        String heroName = sc.next();
        int myHealth = 100;
        int attackDamage = 20;
        int healthPotions = 3;
        int healthPotionHeal = 30;

        System.out.println("Do you accept the challenge," +  heroName + "?");
        String answer = sc.next();

        if(answer.equalsIgnoreCase("yes")){
            System.out.format("Then, you must defeat %s\n", enemyName);
            System.out.println("ENEMY STATS\n============================");
            System.out.format("Health: %d\n", enemyMaxHealth);
            System.out.format("Attack: %s\n", enemyAttack);
            System.out.format("Damage: %s\n\n\n", enemyAttackDamage);

            System.out.println("YOUR STATS\n=============================");
            System.out.format("Health: %d\n", myHealth);
            System.out.format("Damage: %d\n", attackDamage);
            System.out.format("# of Potions: %d\n", healthPotions);
            System.out.format("Potion effects: + %d health\n\n", healthPotionHeal);
        }
        System.out.println("Ready to start?");
        String start = sc.next();

        if(start.equalsIgnoreCase("yes")){
            System.out.println("What would you like to do?");
            do{
                System.out.println("1. Push your code\n2. Drink potion\n3. Run?");
                int action = sc.nextInt();
                if(action == 1){
                    System.out.format("You attack %s! You deal %d damage.\n", enemyName, attackDamage);
                    enemyMaxHealth -= attackDamage;
                    if (enemyMaxHealth < 0) {
                        enemyMaxHealth = 0;
                    }
                    System.out.format("Enemy Health: %d\n", enemyMaxHealth);
                }else if(action == 2){
                    System.out.println("You drink the potion! +30 health.");
                }else if(action == 3){
                    System.out.println("You can't run!");
                }else{
                    System.out.println("That is not an option please try again");
                }

                if (enemyMaxHealth == 0 || enemyMaxHealth < 0){
                    System.out.printf("You have defeated %s%n", enemyName);
                }
            }while(enemyMaxHealth > 0);
        }
    }
}
