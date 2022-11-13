import java.lang.*;
import java.util.*;

class p16{
	
  public static void main(String[] args){
	  
    int h = 5;
    int w = 5;
	
    int space = w*5;
	
    int x = 1;
	
    for(int a = 1; a <= h; a++){
		
      for(int i = x; i <= w; i++){
		  
        for(int j = space; j >= i; j--){
			
          System.out.print(" ");
		  
        }
		
        for(int k = 1; k <= i; k++){
			
          System.out.print("* ");
		  
        }
		
        System.out.println();
		
      }
	  
      x = x+2;
	  
      w = w+2;
	  
    }
	
    for(int i = 1; i <= 4; i++){
		
      for(int j = space-3; j >= 1; j--){
        
        System.out.print(" ");
      }
	  
      for(int k= 1; k <= 4; k++){
		  
        System.out.print("* ");
		
      }
	  
      System.out.println();
    }
  }
}