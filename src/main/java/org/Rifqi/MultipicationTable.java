package org.Rifqi;

public class MultipicationTable {

    public static void printTable (int n){
        for (int i = 1; i<= n;i++){
            for (int j =1 ; j<=n;j++){
                System.out.print((i*j)+" ");
            }
            System.out.println();
        }
    }


}
