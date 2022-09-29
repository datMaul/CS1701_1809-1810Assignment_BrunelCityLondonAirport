package Test;



import java.util.ArrayList;
import java.util.regex.Pattern;

public class Test {

	public static boolean isValid(String email)
	{
		
		String Regex = "[0-9]*";

		Pattern pat = Pattern.compile(Regex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public static void main(String[] args)
	{
		ArrayList<String> X = new ArrayList<>();
		
		X.add("erentastepe23@gmail.com");
		X.add("erentastepe2003@gmail.com");
		X.add("eren.tastepe2003@gmail.com");
		X.add("eren11.tastepe2003@gmail.com");
		X.add("erentastepe2003@gmail.com.uk");
		X.add("review-team@geeksforgeeks.org");
		X.add("writing.geeksforgeeks.org");
		X.add("eren@gmail.com.org");
		X.add("eren@gmail.com.");
		X.add("eren202@gmail.com.org");
		X.add("21eren@gmail.com.org");
		X.add("er21en@gmail.com.org");
		X.add("eren@g");
		X.add("ere.12n@gmail.com.org");
		X.add("er.en@gmail.com.org");
		X.add("user@domain.com");
		X.add("eren");
		X.add("Eren");
		X.add("eRen");
		X.add("7717831312");
		X.add("5453285848");
		X.add("+0447717831312");
		X.add("+95453285848");
		X.add("+0905453285848");
		X.add("+0015453285848");
		X.add("1");
		X.add("0");
		X.add("9");
		X.add("10");
		X.add("15");
		X.add("100");
		X.add("99");
		X.add("-99");
		
		for(String i : X){
			if (isValid(i))
				System.out.println(i + " - Yes");
			else
				System.out.println(i + " - No");
		}
	}
	
}

