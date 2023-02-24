import java.io.*;
class fileoperation
{
  public static void main(String[] args)throws IOException {
  int ch;
  FileInputStream fi=new FileInputStream("add.java");
  int i=1;
  if(fi.available()!=0)
  {
    System.out.print((i++)+".");
  }
  while(fi.available()!=0)
  {
    ch=fi.read();
    System.out.print((char)ch);
    if(ch=='\n'&&fi.available()!=0)
    {
        System.out.print((i++)+".");
    }
  }    
  fi.close();
  }
}
