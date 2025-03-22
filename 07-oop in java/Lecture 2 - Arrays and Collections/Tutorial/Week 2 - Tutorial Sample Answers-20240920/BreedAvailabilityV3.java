/**
 * @author Dr Andreas Shepley (asheple2@une.edu.au | andreashepley01@gmail.com)
 * created for COSC120 (Trimester 1 2022)
 * last revised: Trimester 1 2024
 */

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 * This program demonstrates creation and usage of Map
 * Re-enforces knowledge/usage of file loading, user input and nested if statements
 */
public class BreedAvailabilityV3 {

    /**
     * Demonstrates use of Maps, including creation, adding key/value pairs, and altering values of existing keys
     * Demonstrates how to iterate through a Map and check its key/value pairs
     * Re-enforces file I/O and exception handling
     * Re-enforces understanding of exception handling **IMPORTANT**
     * Re-enforces use of JOptionPane to obtain and validate user input
     * @param args none required
     * @throws IOException loads availableBreeds.txt file
     */
    public static void main(String[] args) throws IOException{
        //load the file (using relative path if availableBreeds.txt is in the project repo)
        String filePath = "./availableBreeds.txt";
        Path path = Path.of(filePath);
        String[] fileContents = Files.readString(path).toLowerCase().split(",");
        System.out.println(Arrays.toString(fileContents)); //optionally, print to visualise file contents

        //create a map to contain the breed names, and the number of instances of each breed
        Map<String, Integer> availableBreeds = new TreeMap<>();

        //if the breed is already in the map, increment the value, otherwise, add it and assign it a value of 1
        for(String breed: fileContents){
            if(availableBreeds.containsKey(breed)) availableBreeds.put(breed,availableBreeds.get(breed)+1);
            else availableBreeds.put(breed,1);
        }

        //visualise key/values
        System.out.println("---------------KEYS AND VALUES-------------------");
        System.out.println(availableBreeds);  //all on one line - no formatting
        for (String breed:availableBreeds.keySet()) {
            System.out.println(breed+": "+availableBreeds.get(breed));//one per line formatted
        }

        //increment the number of dalmatians
        availableBreeds.put("dalmatian",availableBreeds.get("dalmatian")+1);
        //create a new key/value for greyhound
        availableBreeds.put("greyhound",1);

        //once keys are created, they can't be changed, so use numRottweilers to keep track of the number of rottweilers
        //next, create a new key/value, spelling rottweiler correctly, then remove the old key/value
        int numRottweilers = availableBreeds.get("rotweiler");
        availableBreeds.put("rottweiler",numRottweilers);
        availableBreeds.remove("rotweiler");

        System.out.println("---------------KEYS AND VALUES-------------------");
        for (String breed:availableBreeds.keySet()) {
            System.out.println(breed+": "+availableBreeds.get(breed));
        }

        //request user enters preferred breed
        String preferredBreed = JOptionPane.showInputDialog("Please enter your preferred breed: ");
        //handle the condition where the user closes/cancels the dialog. Note that the String preferredBreed is set to null if the user
        //            //click cancel or close, which will cause a NullPointerException to be thrown if you call methods such as equals, toLowerCase etc. on the String
        if(preferredBreed==null) System.exit(0);
        preferredBreed=preferredBreed.toLowerCase();

        //check if the user's breed is in the Map
        if(availableBreeds.containsKey(preferredBreed)){
            String adopt = JOptionPane.showInputDialog("Would you like to adopt a dog of breed "+preferredBreed+"? (yes/no)");
            //handle the condition where the user closes/cancels the dialog. Note that the String preferredBreed is set to null if the user
            //click cancel or close, which will cause a NullPointerException to be thrown if you call methods such as equals, equalsIgnoreCase etc. on the String
            if(adopt==null) System.exit(0);
            if(adopt.equalsIgnoreCase("yes")){
                //if the user wants to adopt, decrement the value by 1, or if there is only one instance of that breed, remove the key
                if(availableBreeds.get(preferredBreed)==1) availableBreeds.remove(preferredBreed);
                else availableBreeds.put(preferredBreed,availableBreeds.get(preferredBreed)-1);
                JOptionPane.showMessageDialog(null,"Awesome! A dog of breed "+preferredBreed+" will be reserved for you.");
            }
            else JOptionPane.showMessageDialog(null,"That's OK. If you change your mind, come back later!");
        }else JOptionPane.showMessageDialog(null,"No such breed available.");

        System.out.println("---------------KEYS AND VALUES-------------------");
        for (String breed:availableBreeds.keySet()) {
            System.out.println(breed+": "+availableBreeds.get(breed));
        }
        System.exit(0);
    }

}
