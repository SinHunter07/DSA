
import java.util.*;

public class loops2 {

    public static void main(String args[]) {

        /*
         * int n = 3;
         * int m = 3;
         * 
         * 
         * //outer loop
         * for(int i=1 ;i<=n;i++){
         * //inner loop
         * 
         * //rectangle pattern
         * 
         * for(int j=1 ; j<=m;j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * (------------------------------------------)
         * // for(int i=1 ; i<=n;i++){
         * for(int j=1;j<5;j++){
         * if (i==1 || j==1 || i==n || j==m) {
         * System.out.print("*");
         * }
         * //hollow rectangle
         * 
         * else{
         * System.out.print(" ");
         * }
         * 
         * }
         * System.out.println("*");
         * }
         * 
         * // half pyramid
         * 
         * 
         * int n=4;
         * 
         * for(
         * int i = 1;i<=n;i++){
         * 
         * for(int j=1;j<=i;j++){
         * System.out.print("*");
         * 
         * }
         * 
         * System.out.println();
         * }
         * 
        // reverse

        int n = 4;
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        

        // inverted half pyramid 

        int n = 4 ;

             //outer loop
        for(int i=1;i<=n;i++){

            //inner loop for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }

            //inner loop for star or pattern 
            for(int j =1;j<=i;j++){
                System.out.print("*");

            }

            System.out.println();
        }

        


        // Print numbers 

        int n = 5 ;

        for(int i=1;i<=n;i++){

            for( int j=1;j<=i;j++){
                System.out.print(j+" ");

            }

            System.out.println();
        }
            


            // floydd triangle 

            int n = 5 ;
            int number = 1;
            //outer loop
            for(int i=1; i<=n ; i++){
                //inner loop

                for(int j = 1;j<=i;j++){
                    System.out.print(number+" ");
                    number++;

                }

                System.out.println();

            }

            */


        // 0-1 triangle

        int n = 5;
        //outter loop
        for(int i=1;i<=n;i++){
            for(int j= 1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }

        



            
        }





        






















}


