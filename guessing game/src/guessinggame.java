import java.util.Scanner;

public class guessinggame
	  {

		public static void main(String[] args)
			{

				System.out.println("what is your name?");
                Scanner sc = new Scanner(System.in);
				String username = sc.nextLine();
				
				boolean Game = true;
				while (Game)
					{
				System.out.println("Hi! How are you," + username +"!");
				Scanner difficulty = new Scanner(System.in);
				System.out.println("please choose level: 1=easy 2=hard 3=super hard");
				int counter = 0;
				String numbers = difficulty.nextLine();
				int diff = 10;
				if (numbers.equals("2"))
					{
						diff = 20;
					}
				else if (numbers.equals("3"))
					{
						diff = 100;
					}
				int secretnumber = (int)(Math.random()*diff)+1;
				boolean userGuessing = true;
					while (userGuessing)
						{
							System.out.println("guess a number between 1 to " + diff);
					      
					        int userguess = sc.nextInt();
					       
					        if(userguess == secretnumber)
					        	{
					        		counter++; 
					        		System.out.println("you got it! you spend " + counter + " times to the right answer.");
					                userGuessing = false;
					        
					        	}
					        else if(userguess > secretnumber)
					        	{
					        		System.out.println("you are too high. Please try again");
					        		counter++;
					        	}
					        else if(userguess < secretnumber)
					        	{
					        		System.out.println("you are too low. Please try agian");
					        		counter++;
					            }
					
			}
					
					System.out.println("do you want play again? 1. keep playing. 2. no, I'm good.");
					Scanner userInput = new Scanner(System.in);
					int answer = userInput.nextInt();
					if (answer == 1 )
						{
							Game = true;
							System.out.println("welcome back!");
						
						}
					else
						{
							Game = false;
							System.out.println("ok, see you next time!");
						}
				}
					
						
				}
	  }	
		
	 
				
				
				
				
				
				
			
		
		
		
		