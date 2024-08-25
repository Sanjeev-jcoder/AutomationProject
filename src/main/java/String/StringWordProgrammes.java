package String;

public class StringWordProgrammes {


    public static void main(String[] args){

        String s1 =" Hello World This is Sanjeev Panwar";
        String S2 ="";

        for(int i=0; i<s1.length();i++) {

            char c = s1.charAt(i);
            if(!Character.isWhitespace(c))
            {
                S2+= S2+c;

            }
            System.out.println(c);

        }
        System.out.println(S2);







    }
}
