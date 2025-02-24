import java.util.Scanner;
public class TwinPrime
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        // int n=1234,c=0,m=0;
        // while(n!=0)
        // {
        //     m=m%10;
        //     c++;
        //     n=n/10;
        // }
        // System.out.println(c);
        int i=1;
        System.out.println("TWIN PRIME : ");
        for(i=1;i<=100;i++)
        { 
         
         if(prime(i) && prime(i+2))
         {
            System.out.println(i+" , "+(i+2));
        

         }
        }
            
        }

    

static  boolean   prime(int n)
{
    int i=2,c=0;
 for(i=2;i<n;i++)
 {
    if(n%i==0)
    {
        c++;
    }
 }
 if(c==0)
 {
     return true;
 }
 else
 {
    return false;
}
}
}
