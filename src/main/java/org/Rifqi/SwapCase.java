package org.Rifqi;

public class SwapCase {
    public static String swapCase(String str){
        String result ="";
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i)==str.toLowerCase().charAt(i)){
                result+=str.toUpperCase().charAt(i);
            }else {
                result += str.toLowerCase().charAt(i);
            }
        }return result;
    }
}
