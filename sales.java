import java.util.Scanner;
public class sales {
    public static  void  main( String args[])
    {
           Scanner scanner=new  Scanner(System.in);

        //    System.out.print("enter salary  : ");
        //    int sal=scanner.nextInt();
        //    if(sal < 5000)
        //    {
        //     System.out.println("0% ");
        //    }
        //   else if(sal>=5000 && sal<7000)
        //    {
        //     System.out.println("10% ");
        //    }
        //   else if(sal>=7000 && sal<=9000)
        //    {
        //     System.out.println("15% ");
        //    }
        //   else if(sal>=9000 && sal<=12000)
        //    {
        //     System.out.println("20% ");
        //    }
        //  else if(sal>12000)
        //    {
        //     System.out.println("25% ");
        //    }
        // else
        // {
        
        // }

        System.out.print("enter no of calls  : ");
        double call=scanner.nextFloat();
        double total = bill(call);
        System.out.println("total bill : "+total);

    }

static double bill(double call)
{
    double total=0;
        if(call<=100)
        {
        total=call*0;
        System.out.print("1");
        }
        else if(call<=200 && call>100)
        {
        total=(call-100)*0.20;
        System.out.print("2 ");
        }
        else if(call>200 && call<=300)
        {
        total=(100*0.20)+(call-200)*0.40;
        System.out.print("3");
        }
        else if(call>300 && call<=500 )
        {
            total=(100*0.20)+(100*0.40)+(call-300)*0.80;
            System.out.print("4 ");
        }

        else if(call>500 )
        {
            total=(100*0.20)+(100*0.40)+(100*0.80)+(call-500)*1.20;
            System.out.print("5");
        }
        else
        {
            System.out.print("6 ");
        }
    total+=99.0;
    return total;
}

}
