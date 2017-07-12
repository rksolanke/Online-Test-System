package mypackage;

public class getpath 
{
   String javap[]={"java","c","c++","html"};
   
   String sendpath(int i)
   {
       int j=1;
   String fname=new String();
   String t="q";
   t=t+Integer.toString(i+1);
   fname="TestQuestions\\\\"+javap[j]+"\\\\"+t+".txt";
   return fname;
   }
    
}
