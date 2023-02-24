import java.util.*;
class repstring
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String str =sc.nextLine();
        System.out.println("enter the char to be replaced");
        char ch= sc.next().charAt(0);
        System.out.println("enter the char to palace instead");
        char rep=sc.next().charAt(0);
        String newstr=new String();
        newstr=str.replace(ch, rep);
        System.out.println("the new string is "+newstr);

    }
}
