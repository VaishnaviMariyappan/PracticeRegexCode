package Task;

import java.util.Random;

public class usernamevalidation
{
int name;
String[]userNames= {"Vaishnavi","Gayathri","aArathiya"};
String mobiles[]= {"265","176","918","742"};
String citys[]= {"Erode","Maduari","Chennai","Salem"};
{
name=3;
}
public void generateName()
{
Random rand=new Random();
String userName = userNames[rand.nextInt(name)];
String mobile= mobiles[rand.nextInt(name)];
String city= citys[rand.nextInt(name)];
System.out.println(isValidUsername(userName,city,mobile));	   					
}	   
public static String isValidUsername(String name,String city,String mob) {
String a=name.replaceAll("^[A-Za-z]{1,3}\\\\w{2}\\\\d{3}$1", name);
String b=city.replaceAll("^[A-Za-z]{1,3}\\\\w{2}\\\\d{3}$2", city);
String c=mob.replaceAll("^[A-Za-z]{1,3}\\\\w{2}\\\\d{3}$3", mob);
return (a+b+c);
}
public static void main(String[]args)
{
usernamevalidation cs=new usernamevalidation();
System.out.println("List of Random names");
cs.generateName();
}
}




			  
	

