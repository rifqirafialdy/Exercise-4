package org.Rifqi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputNumber {
    private Scanner scanner;
    boolean response;
    List<Integer> numbers = new ArrayList<>();
    public InputNumber(Scanner scanner){
        this.scanner=scanner;
    }
    public void inputNumber(){
        do {
            System.out.print("Input Number : ");
            int number = scanner.nextInt();
            numbers.add(number);
            System.out.println("Do U want to continue? (y/n)");
            response = scanner.next().toLowerCase().equals("y");
        }while (response);
                System.out.println("Close program");


System.out.print("Number entered : ");
for (int i = 0 ; i< numbers.size();i++){
    if (i>0){
        System.out.print(",");
    }
    System.out.print(numbers.get(i));
}
scanner.close();
    }

}
