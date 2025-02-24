public class Stringfn {
    
    public static void main(String[] args)
     {
    // String s1="abc",s2=s1;
    // String temp="";
    // for(int i=s1.length();i>0;i--)
    // {
    //     temp+=s1.charAt(i-1);
    // }
    // if(s2.equals(temp))
    // {
    //     System.out.println("palindrome");
    // }
    // else
    // {
    //     System.out.println("not palindrome");
    // }
    // StringBuffer sb = new StringBuffer(s1);
    // sb.reverse();
    // String rev=sb.toString();
    // if(s1.equals(rev))
    // {
    //     System.out.println("palindrome");
    // }
    //  else
    // {
    //     System.out.println("not palindrome");
    // }
    
    // boolean ans=string_buffer(s1);
    //    if(ans)
    //    {
    //     System.out.println("palindrome");
    //    }
    //     else
    // {
    //     System.out.println("not palindrome");
    // }
    String str1="abcdabcxyz",str2="abc";
    int c=0,l2=str2.length(),l1=str1.length();
    for(int i=0;i<=l1-l2;i++)
    {
        String sub=str1.substring(i,i+l2);
        if(sub.equals(str2))
        {
            c++;
        }
    }
    System.out.println("occurence of abc : "+c);


}

static boolean  string_buffer(String s1)
{
return new StringBuffer(s1).reverse().toString().equals(s1);
}
}
