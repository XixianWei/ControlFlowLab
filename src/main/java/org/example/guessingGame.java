package org.example;

import java.util.Scanner;

public class guessingGame {public static void main(String[] args) {
    //set a secret number
    int secretNumber = 7;
    //Prompt user to input their favourite chocolate
    System.out.println("What is the secret number?");
    //collect your input
    Scanner reader = new Scanner(System.in);
    int guessingNumber = reader.nextInt();
    // if the guessing number is the same to the secret number,print 'You're right!'
    //if the guessing number is greater than the secret number, print 'Too high, try again.'
    // if the guessing number is smaller than the secret number, print 'Too low, try again.'
    if (guessingNumber == secretNumber){
        System.out.println("You're right!");
    } else if (guessingNumber > secretNumber) {
        System.out.println("Too high, try again.");
    }else {
        System.out.println("Too low, try again.");
    }

}
}
