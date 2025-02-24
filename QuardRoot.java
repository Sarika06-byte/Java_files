import java.util.*;

public class QuardRoot
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("ENTER A : ");
        double a=scanner.nextInt();
        System.out.print("ENTER B : ");
        double b=scanner.nextInt();
        System.out.print("ENTER C : ");
        double c=scanner.nextInt();

       double d=(b*b)-(4*a*c);
      System.out.println(d);

        if(d==0)
        {
            double r1=(-b)/(2*a);
            double r2=(-b)/(2*a);

            System.out.println(r1+" and "+r2+"  ROOTS ARE REAL AND EQUAL");
        }
        else if(d>0)
        {
           d= Math.sqrt(d);
           System.out.println(d);
            double r1=(-b-d)/(2*a);
           double r2=(-b+d)/(2*a);
            System.out.println(r1+" and "+r2+"  ROOTS ARE REAL AND UNEQUAL");
        }
        else
        {
            d= Math.sqrt(d);
            System.out.println(d);
             double r1=(-b-d)/(2*a);
            double r2=(-b+d)/(2*a);
            System.out.println(r1+" and "+r2+"  ROOTS ARE IMAGINARY");
        }





    }

}