import java.util.*;



public class loops1 {
    public static void main(String arg[]){

        //for loop
        //for(int i=0;i<3;i=i+1){
        //    System.out.println("hello world");
        //}

        //while loop
        //int j = 0;
        //while(j<100){
        //    System.out.println("I love badminton");
        //    j++;
        //}

        // print tyhe sum of first n Natural numbers

        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();

        //int sum = 0 ;


        //for(int i=0 ; i<=n ; i++ ){

        //    sum= sum + i;
        //    System.out.println(sum);


        //}

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int table = 0;

        
        int i = 1;

        do{
            table= n*i;
            System.out.println(table);
            i++;
        }while(i<=10 );
    }


    
    
}
