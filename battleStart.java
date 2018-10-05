import java.util.*;

public class battleStart {
        public static Scanner console = new Scanner(System.in);
        public static String chosenPokemon;
        public static Random rand = new Random();
        public static int level;
        public static int hp;
        public static int attack;
        public static int defense;
        public static int sp_atk
        public static void main(String[] args) {
            battleStart();
            damage();
        }

        public static void battleStart(){
            System.out.println("Another trainer is issuing a challenge!");
            System.out.println("Zebstrika appeared");
            System.out.println("Which pokemon do you choose?");
            chosenPokemon = console.nextLine();
            System.out.println("You chose " + chosenPokemon);
            System.out.println("It's a pokemon battle between " + chosenPokemon +" and Zebstrika");
        }
        public static void damage(){
            System.out.println("What's the level?");
            level = console.nextLine();
            System.out.println("What's the attack?");
            level = console.nextLine();
            System.out.println("What's the defense?");
            level = console.nextLine();
            System.out.println("What's the base?");
            level = console.nextLine();
            System.out.println("What's the STAB?");
            level = console.nextLine();
            System.out.println("What's the HP?");
            level = console.nextLine();
            System.out.println("What's the sp. atk?");
            level = console.nextLine();
            System.out.println("What's the sp. def?");
            level = console.nextLine();
            System.out.println("What's the speed?");
            level = console.nextLine();
            double mod = STAB * (0.85 + (1.0 - 0.85) * rand.nextDouble());
            int damage = ((((2 * level + 10)/250) + (attack / defense) * (base) + 2)* mod);


        }

}


