
public class Prac_1_Q3 {

    public static boolean isPalindrome(String word) {

        int strLength = word.length();
        String reverseWord = "";

        // Here we create a for loop that loops through the word backwards and adds the letter backwards.
        // THis makes a backwards string
        for (int i = (strLength - 1); i >=0; --i) {
            reverseWord = reverseWord + word.charAt(i);
        }
        
        // If the words equal, then they are palindrome
        if (word.toLowerCase().equals(reverseWord.toLowerCase())) {
            return true;
        }
        return false;
    }

    /**
     *  Recursive Implementation
     * 
     * @param word
     * @return
     */
    public static boolean isPalindrome2(String word){

        int strLength = word.length();
        String reverseWord = "";

        // Here we create a while loop that loops through the word backwards and adds each letter. It will make the string backwards.
        // THis makes a backwards string
        int index = strLength;
        while (index >= 0) {
            reverseWord = reverseWord + word.charAt(index);
            index -=1;
        }
        
        // If the words equal, then they are palindrome
        if (word.toLowerCase().equals(reverseWord.toLowerCase())) {
            return true;
        }
        return false;

    }

    /**
     *  Recursive Implementation
     * 
     * @param word
     * @return
     */
    public static boolean isPalindrome3(String word){
        
        // Base case, if you have a word like "" or "a", then it is definitely a palindrome
        if(word.length() == 0 || word.length() == 1)
        return true; 
        
        // Check if the first and last letter of the word match.
        if(word.charAt(0) == word.charAt(word.length()-1))
        // Call the method again, but this time use the second and second-last letter.
        return isPalindrome3(word.substring(1, word.length()-1));

        //The first and last letter don't match etc. So false.
        return false;
    }

    /**
     *  Recursive Implmenetation
     * 
     * @param word
     * @return
     */
    public static boolean isPalindrome4(Sting word) {
        
        // Checks the base case
        if(word.length() == 0 || word.length() == 1)
            return true; 

        int i = word.length() - 1;
        if(helper(word, i) == true){
            return isPalindrome4(word.substring(1, i));
        }

        return false;
    }

    /**
     *  Return if the last letter and the first letter are the same
     * @param word
     * @param i
     * @return
     */
    public static boolean helper(String word, int i) {

        if (word.charAt(0) == word.charAt(i)){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        String URL = new String("https://docs.oracle.com/javase/tutorial/java/data/strings.html");
        System.out.println("These docs can be found here " + URL); 
    }

}
