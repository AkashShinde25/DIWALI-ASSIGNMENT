import java.lang.*;
import java.util.*;

class p2{
	
	public static void main(String args[]){
		
		for(int i = 1; i <= 5; i++){
			
			for(int j = 1; j <= i; j++){
				
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 9; j++){
				
				if(i == 1 || j == 1 || i+j == 6){
					
					System.out.print(" * ");
				}
				
				else{
					
					System.out.print("   ");
					
				}
			}
			
			System.out.println();
		}
		
	}
}