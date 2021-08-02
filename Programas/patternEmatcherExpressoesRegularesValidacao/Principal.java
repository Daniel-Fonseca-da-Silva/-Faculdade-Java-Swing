package patternEmatcherExpressoesRegularesValidacao;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Principal {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("da");
		
		Matcher matcher = pattern.matcher("Daniel Fonseca da Silva");
	
		while(matcher.find())
		{
			System.out.println(matcher.start() + " - " + matcher.group());
		}
		
		Matcher matcher2 = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE).matcher("daniel");
		
		while(matcher2.find())
		{
			System.out.println(matcher2.start() + "-" + matcher2.group());
		}
				
	}

}
