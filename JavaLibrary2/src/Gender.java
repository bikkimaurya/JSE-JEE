import java.util.Scanner;
import java.lang.reflect.*;

@What()
enum Gender {
	Male, Female;
	
	@What()
	public static Gender acceptGender() {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if(str.trim().toLowerCase().equals("male"))
			return Male;
		else
			return Female;
		
		
		
	}
	
}
