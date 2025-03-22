/**
 * @author Dr Andreas Shepley (asheple2@une.edu.au | andreashepley01@gmail.com)
 * created for COSC120 (Trimester 1 2022)
 * last revised: Trimester 1 2024
 */

public class DogBreeds {

    /**
     * Program demonstrating how to create and assign values to an array variable
     * Demonstrates alteration of array values, i.e. changing elements to lowercase using for loop
     * Also demonstrates use of for each loop and contains method for selectively displaying array elements
     * @param args none required
     */
    public static void main(String[] args){
        //declare and initialise a String array
        String[] dogBreeds = {"bulldog", "dalmatian", "jack Russell terrier", "moodle",
                "Yorkshire terrier", "golden retriever", "BULL terrier", "pomeranian",
                "pit bull terrier", "Siberian husky"};

        //use a standard for loop and the toLowerCase method to change the Strings to lower case
        System.out.println("********ALL BREEDS*********");
        for(int i=0;i<dogBreeds.length;i++){
            dogBreeds[i] = dogBreeds[i].toLowerCase();
            System.out.println(dogBreeds[i]);
        }

        System.out.println("\n*****TERRIERS*******");
        //use an enhanced for loop (for each loop) because we're not changing the contents of the array
        for (String dogBreed : dogBreeds) {
            //check if the String dogBreed contains the characters "terrier"
            if (dogBreed.contains("terrier")) {
                //skip printing the terrier if it is a pit bull
                if (dogBreed.contains("pit bull")) continue;
                System.out.println(dogBreed); //only print terriers that are not pit bull terrier
            }
        }
    }
}
