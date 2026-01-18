package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        //for 1 cup
        int oneCupWater=200;
        int oneCupMilk=50;
        int oneCupCoffeeBeans=15;
        /*Possible for All*/
        int possibleWater = water/oneCupWater;
        int possibleMilk = milk/oneCupMilk;
        int possibleCoffeeBeans= beans/oneCupCoffeeBeans;
        int min = Math.min(Math.min(possibleWater,possibleMilk),possibleCoffeeBeans);
        /*Instruction IF ELSE-IF IF*/
        if (min>cups)System.out.println("Yes, I can make that amount of coffee (and even "+(min-cups)+" more than that)");
        else if(min==cups)System.out.println("Yes, I can make that amount of coffee");
        else System.out.println("No, I can make only "+(min) +" cups of coffee");
    }
}