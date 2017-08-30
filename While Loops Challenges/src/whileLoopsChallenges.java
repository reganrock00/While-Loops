import java.util.Scanner;
public class whileLoopsChallenges
	{

		public static void main(String[] args)
			{
				Back();
				Letter();
				Number();
			}

		private static void Back()
			{
				int i = 5;
				while ( i >=1 )
					{
						System.out.println(i);
						i--;
					}
			}

		private static void Letter()
			{
				Scanner in = new Scanner(System.in);
				System.out.println("What's your favorite letter.");
				String letter = in.nextLine();
				boolean run = true;
				if (letter.equals("q"))
					{
						run = false;
						System.out.println("cool");
					}
				while (run)
					{
						System.out.println("try again.. that letter sucks.");
						String letteragain = in.nextLine();
						if (letteragain.equals("q"))
							{
								run = false;
								System.out.println("cool");
							}	
					}
			}

		private static void Number()
			{
				Scanner into = new Scanner(System.in);
				System.out.println("Guess a number between 1-10");
				int guess = into.nextInt();
				int randomnumber = (int)(Math.random()*10)+1;
				
			}

	}
