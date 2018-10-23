package Queue_Array;

/**
 * @file Recursive.java
 * @date Oct 23, 2018 , 6:24:59 PM
 * @author Muhammet Alkan
 */
public class Recursive {

    public static void main(String[] args) {
        String word = "ali";
        
        String result = reverseRecursive(word);
        
        System.out.println(result);
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
