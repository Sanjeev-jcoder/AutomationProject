package String;

public class StringWordProgrammes {


    public static void main(String[] args){

        String s1 =" Hello World This is Sanjeev Panwar";
        String s2 ="";
        s2 += " ";


        for(int i=0; i<s1.length();i++) {
            char c = s1.charAt(i);
            if(c!=' ')
            {
                s2 +=c;

            }

            else {
                System.out.println(s2);
                s2= " ";
            }

        }
/*
        for (int j=0;j<5;j++){
            for (int k=0; k<5; k++){
                System.out.println("*");
           }
        }   System.out.println();
*/
        int n=10;
       for (int j=0; j<n; j++) {

            for (int k=j; k<n; k++) {
                System.out.print(" ");
            }
           for (int k=1; k<j; k++) {
               System.out.print("*");
           }
           for (int k=1; k<j-1; k++) {
               System.out.print("*");
           }
           System.out.println();  // Move to the next line after printing 5 asterisks
        }

    }
}
