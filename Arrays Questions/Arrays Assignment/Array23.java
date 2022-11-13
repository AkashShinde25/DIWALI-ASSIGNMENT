import java.util.*;
 

class Array23 {
 
 
    public static void main(String[] args)
    {
 
        
        ArrayList<String> al = new ArrayList<String>();
 
        
        al.add("Anshul Aggarwal");
        al.add("Mayank Solanki");
        al.add("Abhishek Kelenia");
        al.add("Vivek Gupta");
 
       
        String k[] = al.toArray(new String[al.size()]);
 
       
        for (String str : k) {
 
          
            System.out.println(str);
        }
    }
}