import java.io.*;
class fileop
{
  public static void main(String[] args)throws IOException {
    int ch;
    FileInputStream fi=new FileInputStream("fib.java");
    int i=1;
    if(fi.available()!=0)
    {
        System.out.print((i++)+".");
    }
    while(fi.available()!=0)
    {
        ch=fi.read();
        System.out.print((char)ch);
        if(ch =='\n'&& fi.available()!=0)
        {
            System.out.println((i++)+".");
        }
    }
    fi.close();
    
  }
}
