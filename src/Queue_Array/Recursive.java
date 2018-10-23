package Queue_Array;

/**
 * Recursive function to reverse a given string
 * 
 * @file Recursive.java
 * @date Oct 23, 2018 , 6:24:59 PM
 * @author Muhammet Alkan
 */
public class Recursive {

    public static void main(String[] args) {
        System.out.println("ali  -  " + reverseRecursive("ali"));

        System.out.println("ahmet  -  " + reverseRecursive("ahmet"));

        System.out.println("Fatih Sultan Mehmet  -  " + reverseRecursive("Fatih Sultan Mehmet"));
    }

    static String reverseRecursive(String word) {
        if(word.equals("")){
            return "";
        }
        else{
            char c = word.charAt(0);            
            return reverseRecursive(word.substring(1)) + c;
        }
    }
}
