import java.util.*;

public class loops3 {
    public static void main(String args[]){

        /* 
        //butterfly pattern 

        int n = 5;

        //upper half 

        for(int i=1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            //spaces
            int spaces = 2*(n-i);
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half

        for(int i=n;i>=1;i--){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            //spaces
            int spaces = 2*(n-i);
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            

            // solid rohombus 

            int n = 5;

            for(int i=1;i<=n;i++){
                //for spaces
                for(int j =1;j<=n-i;j++){
                    System.out.print(" ");

                }
                for(int j=1;j<=5;j++){
                    System.out.print("*");
                }

                System.out.println();
            }
                

            //number pyramid 

            int n=5;

            for(int i=1;i<=n;i++){

                //space 
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");

                }
                //numbers

                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }

                System.out.println();
            }

            



            // palendromic pattern

            int n=5;

            for(int i=1;i<=n;i++){

                //spaces
                for(int j =1;j<=n-i;j++){
                    System.out.print(" ");
                }
                //1st half
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }

                System.out.println();
            }

            



            //daimond shape pattern

            int n = 4;

            //upper half
            

            for(int i=1;i<=n;i++){
                int k=(2*i)-1;
                //spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }

                for(int j=1;j<=k;j++){
                    System.out.print("*");
                }

                System.out.println();
            }

            //lower half
            for(int i=n;i>=1;i--){
                int k=(2*i)-1;
                //spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }

                for(int j=1;j<=k;j++){
                    System.out.print("*");
                }

                System.out.println();
            }

            */
 
 


    }
}