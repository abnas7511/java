import java.util.*;
class pal 
    {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the string");
            String str=sc.nextLine();
            System.out.println("enter the char to be searched");
            char c=sc.next().charAt(0);
            int ind=str.indexOf(c);
            if(ind==-1)
                System.out.println("not found");
            else
            System.out.println("found at "+(ind+1));
        }
    }