import java.lang.*;
import java.util.*;

class p19{

	public static void main(String args[]){
		
		for(int i = 1; i <= 7; i++){
			
			for(int j = 1; j < i; j++){
				
				System.out.print(j+" ");
			}
			
			for(int j = i; j >= 1; j--){
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
}