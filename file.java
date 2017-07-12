package mypackage;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class file 
{

String getq(int i)
{
           getpath g=new getpath();
           String s,n="Question:";
           
try
    {
    FileInputStream fis =new FileInputStream(g.sendpath(i));
    DataInputStream dis =new DataInputStream(fis);
    while( (s=dis.readLine())!=null)
    {
        if(s.endsWith("#"))
        break;
        n=n+s+"\n";
    }//while
dis.close();
}
catch(Exception e)
 {
 ;
 }
return n;
}

String getans(int i)
{
           getpath g=new getpath();
           String s;
           String n="Answers:\n";
         
try
    {
    FileInputStream fis =new FileInputStream(g.sendpath(i));
    DataInputStream dis =new DataInputStream(fis);
    while( (s=dis.readLine())!=null)
    {
        if(s.endsWith("#"))
        break;
    }//while
    while( (s=dis.readLine())!=null)
    {
        if(s.endsWith("@"))
        break;
        n=n+"\n"+s;
    }//while
dis.close();
}
catch(Exception e)
 {
 ;
 }

return n;
}

String getop(int i)
{
        getpath g=new getpath();
        String s,n=null;
    try
    {
    FileInputStream fis =new FileInputStream(g.sendpath(i));
    DataInputStream dis =new DataInputStream(fis);
    while( (s=dis.readLine())!=null)
    {
        if(s.endsWith("#"))
        break;
    }//while
    while( (s=dis.readLine())!=null)
    {
        if(s.endsWith("@"))
        break;
      }//while
    while( (s=dis.readLine())!=null)
    {
        n=s;
    }//while
        

dis.close();
}
catch(Exception e)
 {
 ;
 }
    return n;
}


}//class