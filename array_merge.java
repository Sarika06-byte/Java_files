
import java.util.*;


public class array_merge {
    
    public static  void  main( String args[])
    {
        //1.......................
        // int a[]={10,1,2,3,4};
        // int b[]= {5,6,7,10,8};
        // int c[]=new int[a.length+b.length];
        // int count=-1;
        // for(int i=0;i<a.length;i++)
        // {
        //     c[i]=a[i];
        // }
        // for(int i=0;i<b.length;i++)
        // {
        //     c[i+a.length]=b[i];
        //  }
//         System.out.println("\nA+B = C : "+Arrays.toString(c));
//  //2........................
//        for(int i=0;i<a.length;i++)
//       {
//         for(int j=0;j<a.length;j++)
//           {
//         if(a[i]==b[j])
//            {
//             System.out.println("\n"+a[i]+" are identical elements in both array that  exist at a["+i+"] & b["+j+"] indecies.");
//             count++;
//            }
//          }
//       }
//       if(count>-1)
//       {  }
//       else
//       {
//         System.out.println("IDENTICAL ELEMENT NOT EXIST IN ARRAYS.");
//       }
//3............................
        // int arr1[]={7,2,5,1,4,2,0};
        // int min=arr1[0],index=-1,max=arr1[0],sum_even=0,sum_odd=0;
        // for(int i=0;i<arr1.length;i++)
        //  {
        //     if(min>arr1[i])
        //     {
        //      min=arr1[i];
        //      index=i;
        //     }
        //  }
        //  System.out.println("\nMINIMUM ELEMENT IN "+Arrays.toString(arr1)+" : "+min+" at "+index+" index.");
        //  for(int i=0;i<arr1.length;i++)
        //  {
        //     if(max<arr1[i])
        //     {
        //      max=arr1[i];

        //     }
        //  }
        //  System.out.println("\nMAXIMUM ELEMENT IN "+Arrays.toString(arr1)+" : "+max);
    //      for(int i=0;i<arr1.length;i++)
    //      {
    //       if(i%2==0)
    //       {
    //         sum_even+=arr1[i];
    //       }
    //       else
    //       {
    //         sum_odd+=arr1[i];
    //       }
    //      }
    //      System.out.println("\nsum of even element in :  "+Arrays.toString(arr1)+" : "+sum_even);
    //      System.out.println("\nsum of odd element in :  "+Arrays.toString(arr1)+" : "+sum_odd);
        int  a[]={1,4,15,6,3,2,17},max=a[0],sec_max=a[0],n=0;;
         for(int i=0;i<a.length;i++)
         {
           if(max<a[i])
           {
            max=a[i];
           }   
        }
        if(sec_max==max)
        {
          sec_max=a[1];
        }
        for(int i=0;i<a.length;i++)
         {
          if(a[i]<max && a[i]>=sec_max)
           {
            sec_max=a[i];
            // System.out.println("a[i] if : "+sec_max);
           } 
          }  
          System.out.println("\n2nd MAXIMUM ELEMENT IN "+Arrays.toString(a)+" : "+sec_max);



     }
    }