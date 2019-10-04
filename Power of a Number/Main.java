import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int j=1;
      	int a=sc.nextInt();
        int b=sc.nextInt();
      for(int i=0;i<b;i++)
      {
       j=j*a;
      }
      System.out.println(j);
      
    }
}