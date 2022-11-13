import java.lang.*;
import java.util.*;

class p18{
	
	public static void main(String args[]){
		
		for(int i = 1; i <= 7; i++){
			int x = 7;
			for(int j = 1; j <= i; j++){
			
				System.out.print(x+" ");
				x--;
			}
			
			System.out.println();
		}
	}
}