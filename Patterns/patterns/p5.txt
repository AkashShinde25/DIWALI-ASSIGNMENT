import java.lang.*;
import java.util.*;

class p5{

	public static void main(String args[]){
		
		for(int i = 1; i < 4; i++){
			
			for(int j = i; j <= 4; j++){
				
				System.out.print("   ");
			}
			
			for(int j = i; j > 1; j--){
				
				System.out.print(j+"  ");
			}
			
			for(int j = 1; j <= i; j++){
				
				System.out.print(j+"  ");
			}
			
			System.out.println();
		}
		
		int x = 5;
		
		for(int i = 1; i <= 4; i++){
			
			
			for(int j = 1; j <= i; j++){
				
				System.out.print("   ");
			}
			x--;
			for(int j = x; j > 1; j--){
				
				System.out.print(j+"  ");
			}
			
			for(int j = 1; j <= x; j++){
				
				System.out.print(j+"  ");
			}
			
			System.out.println();
		}
	}
}