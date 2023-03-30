package Task;


	import java.util.Scanner; 
	class challenge
	{ 
	public static void main(String[] args)
	{
	int challenge;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the Value:");
		challenge = sc.nextInt();
	}
	if(challenge==7)
	{
	System.out.println("Challenge.isSeven("+challenge+") ---> True");
	}
	else
	{
	System.out.println("Challenge.isSeven("+challenge+") ---> False");
	}
	}
	}


