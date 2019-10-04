import java.util.Scanner;
class Main
{ 
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      char ch2=Character.toLowerCase(ch);     
      if(ch2==97||ch2==101||ch2==105||ch2==111||ch2==117)
      {
        System.out.println("Vowel");
      }
      else if(ch2>=97 && ch2<=122)
      {
        System.out.println("Consonant");
      }
      else
        System.out.println("Not an alphabet");
      
    }
}