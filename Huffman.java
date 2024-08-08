import java.util.*;




class A
{
public static void main(String args[])
{


  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  int sum=0,r=0,rem;

  do{
    rem = n%10;
    
    r = r*10 + rem;

    sum=sum+rem;

    n=n/10;
  }

  while(n>0);

  


 System.out.println("reverse is " + r);

 System.out.println(sum);
  



}}