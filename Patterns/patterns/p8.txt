import java.lang.*;
import java.util.*;

class p8{
	
	public static void main(String args[]){
		
		for(int i = 1; i <= 5; i++){
			
			for(int j = 1; j <= i; j++){
				
				if(j == 2 || j == 4){
					
					System.out.print("0 ");
				}
				
				else{
					
					System.out.print("1 ");
				}
			}
			
			System.out.println();
		}
	}
}