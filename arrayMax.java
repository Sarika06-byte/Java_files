
public class arrayMax {
    public static  void  main( String args[])
    {
    //     Scanner scanner=new Scanner(System.in);
    //     System.out.print("enter row : ");
    //     int row=scanner.nextInt();
    //     System.out.print("enter cols : ");
    //     int col=scanner.nextInt();
    //    int a[][]=new int[row][col];
    //    for(int i=0;i<row;i++)
    //    {
    //     for(int j=0;j<col;j++)
    //    {
    //     a[i][j]=scanner.nextInt();
    //    }
       //}
    //    int t=0;
//      int a2[]=new int[col];
    //    for(int i=0;i<row;i++)
    //    {
    //     Arrays.sort(a[i]);
    //     System.out.println(Arrays.toString(a[i]));
    
    //    }
    //    for(int i=0;i<col;i++)
    //    {
    //     for(int j=0;j<row;j++)
    //     {
    //      a2[j]=a[j][i];
    //     }
    //     Arrays.sort(a2);
    //     for(int j=0;j<row;j++)
    //     {
    //         a[j][i]=a2[j];
    //     }
        
        
    //    }

          int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int col = a[0].length,row = a.length,sum=0,len=a.length-1,max=a[0][0];
    
       for(int i=0;i<row;i++)
       {

        for(int j=1;j<col;j++)
        {
            if(max<a[i][j])
            {
               max=a[i][j];
            }
            
        }

    }
    System.out.println("largest no : "+max);









}
}
