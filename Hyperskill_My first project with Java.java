import java.util.Scanner;





public class Main {
    public static void main(String[] args) {

        System.out.println("Earned amount:");
        int Bubblegum = 202;
        System.out.println("Bubblegum: $" + Bubblegum);
        int Toffee = 118;
        System.out.println("Toffee: $" + Toffee);
        int Ice = 2250;
        System.out.println("Ice cream: $" + Ice);
        int Milk = 1680;
        System.out.println("Milk chocolate: $" + Milk);
        int Doughnut = 1075;
        System.out.println("Doughnut: $" + Doughnut);
        int Pancake = 80;
        System.out.println("Pancake: $" + Pancake);
        System.out.println();
        int income = Bubblegum + Toffee + Ice + Milk + Doughnut + Pancake;
        System.out.println("Income: $" + income);
        System.out.println("Staff expenses:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Other expenses:");
        int number2 = scanner.nextInt();
        int result = income - number1 - number2;
        System.out.println("Net income: $" + result);





    }
}