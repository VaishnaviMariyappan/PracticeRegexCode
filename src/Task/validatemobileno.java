package Task;


	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	public class validatemobileno 
	{
	public static void main(String[] args)
	{
		String mobile="+91 7780835431";
		Pattern p=Pattern.compile("(W)?(d{2})?(s)?[7-9][0-9]{9}");
		Matcher m=p.matcher(mobile);
		if(m.find())
		System.out.println(m.group()+"is valid mobile no.");
		else
		System.out.println(mobile+" is not valid mobile no");
	}
	}


	

