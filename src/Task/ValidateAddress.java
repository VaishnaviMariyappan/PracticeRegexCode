package Task;
public class ValidateAddress
{
public static void main(String []args) 
{
String address = "8/1A, Northnamman kovil street, southveli street, Madurai";
String[] st = address.split("\\,");
for(String s:st)
{
System.out.println(s);
}
}
}

