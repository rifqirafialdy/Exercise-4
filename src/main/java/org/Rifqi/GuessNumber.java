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
            System.out.println("Do u want to Try again? yes/no");
            boolean responese= scanner.next().toLowerCase().equals("yes");
            if (!responese){
                System.out.println("The number is"+ number);
                break;
            }



        }
        scanner.close();
    }
}
