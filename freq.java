import java.util.*;
class freq{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        System.out.println("enter the character");
        char c=sc.nextLine().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(c==str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("freq of "+c+" in "+str+" is "+count);
    }
}