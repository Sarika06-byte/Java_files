
import java.util.*;

class Factorial{

    public static  void  main( String args[])
    {
        Scanner scanner=new  Scanner(System.in);
        int no=scanner.nextInt();
        int ans=factorial(no);
        System.out.println("factorial of "+no+" :  "+ans);
    }

    

static int factorial(int no)
{
    int fact=1;
    for(int i=1;i<=no;i++)
    {
     fact*=i;
    }
    return fact;
}
}

