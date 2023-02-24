import java.util.*;
class palstring
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int l=0,r=str.length()-1,flag=0;
        while(l<r)
        {
            if(str.charAt(l)!=str.charAt(r))
            {
                flag=1;
                break;
            }
            l++;
            r--;
        }
        if(flag==0)
         System.out.println("palindrome");
        else
         System.out.println("not palindrome");
    }
}
                           