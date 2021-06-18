package filehandling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "8778452995 7458673440";
		Pattern p = Pattern.compile("4{2}");
		Matcher m = p.matcher(name);
		while (m.find()) {
			System.out.print(m.group());
			}
	}

}
