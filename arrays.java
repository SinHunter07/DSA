import java.util.*;


public class arrays {

    public static void main(String[] args) {
        /* 
       // int [] marks = new int[3];
       int marks[] = new int[3];

        marks[0]= 97;
        marks[1]= 98;
        marks[2]= 99;

        for(int i=0; i<3;i++){
            System.out.println(marks[i]);
        }
            */
            



            // take an array as input from the user search for a given numbe x and prnt the index at which it occurs 

            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int numbers[]= new int[size];

            for(int i=0;i<size;i++){
                numbers[i]= sc.nextInt();
            }

            int x= sc.nextInt();

            for(int i=0;i<numbers.length;i++){
             //   System.out.println(numbers[i]);
            

                if(numbers[i]== x){
                    System.out.println("x found at index "+i);
                }
            }


    }
}
