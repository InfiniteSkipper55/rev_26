package coding_challenge;

import java.util.*;


public class July_Fourth

{

    public static void getMissingValuesOfMagicArray(int N, int X,int[] B){

     
        //write your Logic here:

        for(int i = 0; i < N; i++){

            if(B[i] == -1){

                B[i] = ((X+i+1)*(X+i+2)*(X+i+3))/3;

            }

            System.out.print(B[i] + " ");

        }
        
        

    }

    public static void main (String[] args)

    {

        Scanner sc=new Scanner(System.in);

            

        //INPUT [uncomment & modify if required]

        int N = sc.nextInt();

        int X = sc.nextInt();

        int[] B = new int[N];

        for(int i=0;i<N;i++) {
            B[i]=sc.nextInt();

        } 

        sc.close();



        //OUTPUT [uncomment & modify if required]

        getMissingValuesOfMagicArray(N,X,B);

    }

}
