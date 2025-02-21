
import java.util.*;
public class array {
    public static  void  main( String args[])
    {
           Scanner scanner=new  Scanner(System.in);
        
           int sum=0,len=0,i=0;
           System.out.print("Enter nth term  : ");
           int nth_term=scanner.nextInt();
           int arr[]=new int[nth_term];
           for(i=0;i<nth_term;i++)
           {
            System.out.print("Enter "+(i)+" element : ");
            arr[i]=scanner.nextInt();
            len++;
            sum+=arr[i];
           }
           System.out.print("Enter element to find  index : ");
        int find_term=scanner.nextInt();
           int f=-1;
           for(i=0;i<nth_term;i++)
           {
            if( arr[i]==find_term)
            {
                 f=i;
                
            }
            else
            {   
            }
           }
         if(f>-1)
         {
            System.out.println("\nELEMENT EXIST AT  "+(f)+" INDEX.\n");
         }
         else
         {
            System.out.println("\nELEMENT NO EXIST..\n");  
         }
           System.out.println("entered elements : "+Arrays.toString(arr));
           System.out.println("sum of array elements :  "+sum);
           System.out.println("length of array elements(++) :  "+len);
           System.out.println("length of array elements(fn) :  "+arr.length);
          
    }

}
