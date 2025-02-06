package org.Rifqi;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    System.out.print(SwapCase.swapCase("HeLlo wOrLd \n"));
    MultipicationTable.printTable(5);
    Pattern.printPattern(0);
        Scanner scanner=new Scanner(System.in);
    GuessNumber game = new GuessNumber(scanner);
    InputNumber input= new InputNumber(scanner);
   input.inputNumber();



    }
}