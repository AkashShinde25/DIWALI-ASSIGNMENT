import java.util.*;
class ReplaceCharactersInString
{
	static String replace(String str)
	{
		str=str.replaceAll("[^a-zA-Z0-9\\s]"," ");
		return str;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Line :: ");
		String str=sc.nextLine();
		
		System.out.print(replace(str));
	}

}
