import java.util.*;
class poschar
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine();
        System.out.println("enter the char to be searched");
        char ch=sc.next().charAt(0);
        int l=0,r=str.length(),flag=0;
        while(l<r)
        {
            if(str.charAt(l)==ch)
            {
                flag=1;
                break;
            }
            l++;
        }
        if(flag==0)
         System.out.println("not found");
        else 
         System.out.println("found at pos "+(l+1));

    }
}
