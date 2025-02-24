import java.util.Scanner;

public class fib_fn {
    public static  void  main( String args[])
    {
           Scanner scanner=new  Scanner(System.in);
        int n1=0,n2=1;
        System.out.print("enter nth term : ");
        int term=scanner.nextInt();
        fib(n1,n2,term);
    }
 static void fib(int n1,int n2 ,int term)
 {
int s=0;
    for(int i=1;i<=term;i++)
    {
        System.out.print(n1+"\t"); 
        s=n1+n2;
        n1=n2;
        n2=s;
        // if(i==term)
        // {
        //      System.out.print(s+"\t"); 
        // }
    }
 }
}
