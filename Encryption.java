package com.company;
import java.security.PublicKey;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     ques();




    }

    public static void ques(){
        System.out.println("Write a number of the operation");
        System.out.println("1.Encryption");
        System.out.println("2.Decryption");
        Scanner num = new Scanner(System.in);
        int enter = num.nextInt();
        switch (enter) {
            case 1 -> encryption();
            case 2 -> decryption();
            default -> {
                System.out.println("Wrong operation, repeat your choose ");
                ques();
            }
        }
    }
        public static void decryption(){
            System.out.println("Welcome to the Decryption service");
            System.out.println("Write a text, to decrypt");
            Scanner str = new Scanner(System.in);
            String text = str.nextLine();

            System.out.println("Write a key");
            Scanner stork = new Scanner(System.in);
            int key = stork.nextInt();
            String test = text;
            char[] chars = test.toCharArray();
            StringBuilder test2 = new StringBuilder();
            for(byte b=0; chars.length>b;b++){

                chars[b]=(char) (chars[b]-key);
                test2.append(chars[b]);}
            System.out.println(test2);
            again();





        }



    public static void encryption(){

        System.out.println("Welcome to the Encryption service");
        System.out.println("Write a text, to encrypt");

        Scanner str = new Scanner(System.in);
        String text = str.nextLine();

        System.out.println("Write a key");
        Scanner stork = new Scanner(System.in);
        int key = stork.nextInt();
        String test = text;
        char[] chars = test.toCharArray();
        StringBuilder test2 = new StringBuilder();
        for(byte b=0; chars.length>b;b++){  chars[b]=(char) (chars[b]+key);
        test2.append(chars[b]);}
        System.out.println(test2);
        again();






    }
public static void again(){
        System.out.println("Finished");
    System.out.println("New session?(Yes or No)");
    Scanner answer = new Scanner(System.in);
    String ank = answer.nextLine();
    switch (ank) {
        case "Yes" -> {
            System.out.println("Starting new session");
            ques();
        }
        case "No" -> System.out.println("Session was finished");
        default -> {
            System.out.println("Repeat your answer, Yes or No");
            again();
            ;
        }
    }



}













}