package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Challenge 1:XdY - Done
        //Challenge 2:While Loop - Done

        int playAgain = 1;
        while (playAgain == 1){

            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter the number of dice and the number of sides you would like to roll in this format: XdY");
            System.out.println("X is the number of dice and Y is the number of sides, so 3 dice and 5 sides would be 3d5");
            System.out.print("Please enter your answer here: ");
            String userInput = input.nextLine();

            String[] parts = userInput.split("d");
            int numDice = Integer.parseInt(parts[0]);
            int numSides = Integer.parseInt(parts[1]);

            int total = 0;
            int[] dice = new int[numDice];
            for (int i = 0; i < numDice; i++) {
                Random rand = new Random();
                dice[i] = rand.nextInt(numSides) + 1;
            }

            String msg = "";
            for (int die : dice) {
                msg += "You rolled a " + die + " on a " + numSides + " sided dice\n";
                System.out.println(msg);
                total += die;
            }
            System.out.println("Your total is " + total);

            //play again?
            System.out.println();
            System.out.println("Do you want play again?");
            System.out.println("1) Yes");
            System.out.println("2) No");
            System.out.print("Please enter your choice as an integer: ");
            Scanner restart = new Scanner(System.in);
            playAgain = restart.nextInt();
        }











    }
}
