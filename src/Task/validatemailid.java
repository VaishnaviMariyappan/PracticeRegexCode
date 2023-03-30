package Task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class validatemailid
{
public static void main(String[]args)
{		
String chainsys="vaishnavisaisai5@chainsys.com";
System.out.println(" "+valEmail(chainsys));
}
public static boolean valEmail(String input)
{
String emailRegex="^[a-z0-9_%+-]+@[chainsys]+\\.[a-z]{2,6}$";
Pattern emailPat=Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
Matcher matcher=emailPat.matcher(input);
return matcher.find();
}
}


