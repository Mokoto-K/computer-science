/**
 * @author Dr Andreas Shepley (asheple2@une.edu.au | andreashepley01@gmail.com)
 * created for COSC120 (Trimester 1 2022)
 * last revised: Trimester 1 2024
 */

import java.util.Arrays;
import java.util.Scanner;

public class BreedAvailability {

    /**
     * This program demonstrates creation and usage of arrays
     * Re-enforces knowledge/usage of nested loops and Scanner
     * @param args none required
     */
    public static void main(String[] args){
        int numberOfFavoriteDogBreeds = 5;
        String[] availableDogBreeds = {"Dalmatian", "Rottweiler", "German Shepherd", "Jack Russell terrier", "Wolfhound", "Siberian Husky", "Chihuahua", "Moodle", "Poodle", "Labrador", "Maremma"};
        //create an array of size 5. The number 5 can also be passed into the square brackets
        String[] favouriteDogBreeds = new String[numberOfFavoriteDogBreeds];

        //prompt the user to enter their favourite dog breeds
        System.out.println("Please enter your 5 favourite dog breeds: (click 'enter/return' after typing up a breed)");
        //create a Scanner object to get user input
        Scanner keyboard = new Scanner(System.in);
        //loop 5 times, allowing the user to enter 5 breeds, then add those breeds to the array
        for(int i=0;i<favouriteDogBreeds.length;i++) favouriteDogBreeds[i] = keyboard.nextLine();

        //use a nested for loop to compare each of the users favourite breeds to the available dog breeds
        for (String favouriteDogBreed : favouriteDogBreeds) {
            for (String availableDogBreed : availableDogBreeds) {
                //ignore the case/capitalisation of breed names using the equalsIgnoreCase method
                //if a match is found, print a message letting the user know
                if (favouriteDogBreed.equalsIgnoreCase(availableDogBreed)) System.out.println("Found match! " + availableDogBreed);
            }
        }
        //sorts the array in alphabetical order
        Arrays.sort(availableDogBreeds);
        //prints the contents of the array in one line
        System.out.println("All breeds: "+Arrays.toString(availableDogBreeds));
    }
}
