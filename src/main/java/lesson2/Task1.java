package lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(palindromeLoop("anna"));
    }

    public static int getNum(){

        try (Scanner scanner = new Scanner(System.in)){
            return scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Введен неверный формат");
            getNum();
        }
        return 0;
    }

    public static boolean palindrome (String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static boolean palindromeLoop (String str){

        String buf = "";

        for (int i = str.length()-1; i >= 0; i--) {
            buf += str.charAt(i);
        }

        return buf.equals(str);

    }


}
