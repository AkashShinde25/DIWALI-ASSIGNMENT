import java.util.*;

 public class Array22 {
    public static void main(String args[]) {
        
    Integer[] num = {7,34,45,23,38,56,21};
   
    List<Integer> list = Arrays.asList(num);
    Set<Integer> set = new TreeSet<Integer>(list);
    
    System.out.println("The Set elements are :");
    for(Integer var : set)
        System.out.print(var+" ");
  }
}