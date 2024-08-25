package String;

public class StringCharacterProgrammes {

    public static void main(String[] args){


        String s ="Hello Sanjeev Panwar";
        // Print each character of string in a separate line
        for(int i=0; i < s.length();i++){
            char c = s.charAt(i);
            System.out.println(c);
        }
/* *******************Print String **************************** */
        // Print each character with ascii code
        for(int i=0; i < s.length();i++){
            char c = s.charAt(i);
            System.out.println("  "+c +" "+ (int)c);
        }

        // Print only uppercase character
        for(int i=0; i < s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
            System.out.println(c);
        }

        // Print only lower character
        for(int i=0; i < s.length();i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c))
                System.out.println(c);
        }
         //Charaacter.isDigit(c);
         //Character.isLetterorDigit(c)

            /* *******************Count String **************************** */

            int count =0;int countL =0;

            // Print only lower character
            for(int i=0; i < s.length();i++){
                char c = s.charAt(i);
                if(Character.isUpperCase(c))
                    count++;
                if(Character.isLowerCase(c))
                    countL++;

            }
            System.out.println("Uppercase count" + "  " +count);
            System.out.println("Uppercase count" + "  " +countL);

            //if(Character.isDigit(c)) to count digit
            // if (c=='R' || c == 'r') to count a specific letter
            // if (c=='a' || c == 'e' || c=='i' || c == 'o' || c== 'u') to count a specific letter

            // Char u = Character.toUpperCase(c);
            // if (u=='R")

        /* >>>>>>>>>>>>>>>>Create New String From a Given String >>>>>>>>>>>>> */


    }
}

