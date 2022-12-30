import java.util.*;
class repchar
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("Enter the char to be replaced");
        char a=sc.nextLine().charAt(0);
        System.out.println("Enter the char to replace");
        char b=sc.nextLine().charAt(0);
        String newstr=str.replace(a,b);
        System.out.println("Final String is "+newstr);

    }
}