package lesson3;

import java.util.ArrayList;
import java.util.Random;

public class RandomNum {

    public static int[] generateRandomArray(int length, int min, int max) {
        int[] array = new int[length];
        Random rand = new Random();
        
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt((max - min) + 1) + min;
        }
        
        return array;
    }

    public static void main(String[] args) {
    
        int length = 10; 
        int min = 2;     
        int max = 10;   
        
        int[] randomArray = generateRandomArray(length, min, max);
        
        // Print the generated array
        System.out.println("Generated Array:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
    }
}
