package org.Rifqi;

import java.util.Scanner;

public class GuessNumber {
    private int number;
    private int attempts;
    private Scanner scanner;
    public GuessNumber(Scanner scanner){
        number= (int)(Math.random()*101);
        attempts=0;
        this.scanner= scanner;
    }
    public void startGame(){
        int guess =0;
        System.out.println("Welcome");
        System.out.println("I have select number 0 - 100.Pick one!");
        System.out.println(number);
        while (guess!=number){
            System.out.println("Enter your number");
            guess=scanner.nextInt();
            attempts++;
            if (guess<number){
                System.out.println("Too Low, Try Again!");
            } else if (guess>number) {
                System.out.println("Too High,Try again!");

            }else {
                System.out.println("Congrats u guess it in "+attempts+" attempts");
                break;
            }
            String response;
            while (true){
                System.out.println("Do u Want to Try Again? yes/no");
                response= scanner.next();
                if (response.equalsIgnoreCase("yes")){
                    break;
                } else if (response.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for Playing the Number is : "+ number);
                    scanner.close();
                    
                }else {
                    System.out.println("Invalid Response please enter yes/no");
                }
            }



        }
        scanner.close();
    }
}
