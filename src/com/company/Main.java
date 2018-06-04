package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mv;
        ArrayList<String> aList = new ArrayList<String>();

        System.out.print("Enter the Movie name ");
        mv = sc.nextLine();

        while (!mv.toLowerCase().equals("q")) {
                if (aList.contains(mv)){
                System.out.println("duplicate Movie name, Please re-enter movie name");
                mv = sc.nextLine();
            }
            else {
                aList.add(mv);
                System.out.print("Enter another Movie name ");
                mv = sc.nextLine();
            }
        }
        System.out.println("Thank you for playing game, Here is your List:");

        for(int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }
    }
}