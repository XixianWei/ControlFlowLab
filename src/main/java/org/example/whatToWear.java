package org.example;

import java.util.Scanner;

public class whatToWear {

    public static void main(String[] args) {
        //Prompt user to input their favourite chocolate
        //collect your input
        System.out.println("What is the weather today?(Choose from rainy, sunny, cloudy or snow)");
        Scanner weather = new Scanner(System.in);
        String weatherToday = weather.nextLine();

        System.out.println("What is the average temperature today?");
        Scanner temperature = new Scanner(System.in);
        int temperatureToday = temperature.nextInt();

        // if the weather is 'rainy' or 'snow', and the temperature is lower/equal to 18, print "Wear a waterproof winter coat"
        // if the weather is 'rainy' or 'snow', and the temperature is higher to 18, print "Wear a raincoat."
        //if the weather is 'sunny' or 'cloudy', and the temperature is higher to 18, print "It's a nice day, wear whatever you like!"
        //if the weather is 'sunny' or 'cloudy', and the temperature is lower/equal to 18, print "Wear a warm coat."
        if (weatherToday.equals("sunny") || weatherToday.equals("cloudy")){
            if (temperatureToday <= 18) {
                System.out.println("Wear a warm coat.");
            }else{
                System.out.println("It's a nice day, wear whatever you like!");
            }
        }
        else if (weatherToday.equals("rainy") || weatherToday.equals("snow")){
            if (temperatureToday <= 18) {
                System.out.println("Wear a waterproof winter coat");
            }else{
                System.out.println("Wear a raincoat");
            }
        }
    }
}
