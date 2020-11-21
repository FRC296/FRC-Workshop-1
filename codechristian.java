public class Code 
{
  public static void main(String[] args) 
  {
    int V = 1;
    int C = 2;
    int P = 0;
    P = V * C;
    System.out.println(P);
    String firstname = "firstname";
    String space = " ";
    String lastname = "lastname";
    String fullname = "a";
    fullname = firstname + space + lastname;
    System.out.println(fullname);
    
    String yeet = "yeet";
    
 	  for(int i = 0; i<yeet.length(); i++)
 	  { 
      String tab = "";
      
      for (int f = 0; f < i; f++) 
      {
        tab = tab + "\t";
      }
   
     
      
      
      
      
      System.out.println(tab + yeet.charAt(i));
    }
  }
}