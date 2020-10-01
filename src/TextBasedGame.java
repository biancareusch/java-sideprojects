import java.util.Scanner;
public class TextBasedGame {
//    Ask if the user is ready to start. If they type in "yes", start the game.
//    Ask the user for their name. Store this as a variable to personalize the adventure.

//    A classic RPG will have the hero going through different scenarios and battling their enemies.
//    Display enemy stats and hero stats. Properties and values can be assigned by you.
//    For example: Health, Attack Points, etc.
//    Decide on what actions your hero can take.
//    -Attack (decreases enemyHealth)
//    -Drink potion (adds to heroHealth)
//    -Run? (ends the game)
//    -Keep asking for user input until the enemyHealth reaches 0, then end the game.

    //    Bonuses
//
//    Allow the user to specify hero stats and enemy stats.
//    Automate an enemyAttack after each time the hero takes a turn.
//    End the game if either heroHealth or enemyHealth drops to 0.
//    Indicate how many potions your hero starts with. Decrement this number each time 'Use Potion' action is used.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wanna play a game? [y/N] ");
        String startGame = sc.next();
        boolean starting = startGame.equalsIgnoreCase("y");
        if(starting){
            System.out.println("Awesome! What's your name? ");
            String user = sc.next();
            System.out.println("Hey, " + user + "!");
            int userHealth = 100;
            int enemyHealth = 100;
            System.out.println("It's a beautiful sunny day and you're feeling adventurous, so you head into the Woods.");
            System.out.println("On your walk you see a mysterious cave.");
            System.out.println("You were looking for an adventure so you head in...");
            System.out.println("Inside, you can see something glowing out of a hole in the cave's wall...");
            System.out.println("You walk towards the glow and when you reach out to grab you it you feel... glass!?");
            System.out.println("");













        }else{
            System.out.println("Okkkkk byeeeeeee.");
        }
    }
}
