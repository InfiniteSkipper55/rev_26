package coding_challenge;

import java.util.*;

public class July_Thirty {

    public static String lovePalindromes(String str) {

        //this is default OUTPUT. You can change it.

        char c = str.charAt(str.length()-1);

        String s = Character.toString(c).concat(str);

        StringBuilder sb = new StringBuilder(s);

        if(s.equals(sb.reverse().toString())){

            return Character.toString(c);

        }

        else{

            return "Z";

        }
    }

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        //INPUT [uncomment & modify if required]   

        String str = sc.next();

        

        //OUTPUT [uncomment & modify if required]

        System.out.println(lovePalindromes(str));

    }

}