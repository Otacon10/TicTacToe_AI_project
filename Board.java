
import java.util.Random;
import java.util.Scanner;
public class Board {
	
	private static Naive dumb = new Naive();
	private static Thoughtful smart = new Thoughtful();
	
	private static char board[]; 
	static int dumbMoves[];
	static int smartMoves[];
	private static int move;
	//private static int thoughtfulMovesList[];
	//private static int naiveMovesList[];
	
	//private static int naiveDomainTrace[];
	static int naiveStratigicTrace[];
	//private static int thoughtfulDomainTrace[];
	static int thoughtfulStratigicTrace[];

	//private static int lastmove1;
	//private static int lastmove2;

	//Thoughtful vs. Naive
	public static int playtvn()
	{
	
		//int naiveDomainIndex = 0;
		int naiveStratigicIndex = 0;
		//int thoughtfulDomainIndex = 0;
		int thoughtfulStratigicIndex = 0;
		
		int position;

		
		Random rand = new Random();
		//Naive dumb = new Naive();
		//Thoughtful smart = new Thoughtful();
		//int lastmove = 0;
		
		board = new char[9];
		dumbMoves = new int[9];
		smartMoves = new int[9];
		
		//naiveDomainTrace = new int[9];
		naiveStratigicTrace = new int[9];
		//thoughtfulDomainTrace = new int[9];
		thoughtfulStratigicTrace = new int[9];
		dumb.updatecurrentState(board);
		smart.updatecurrentState(board);
		move = 1;
		
		while(move < 11){
		int randdumb = rand.nextInt(9);
		//System.out.println(board[randdumb]);
		while(!dumb.checkLegalMove(randdumb))
			randdumb = rand.nextInt(9);
		//dumb.currentState
		position = dumb.pickRandomMove(randdumb);
		
		//naiveDomainTrace[naiveDomainIndex] = dumb.lastmove;
		board[position] ='o';
		dumbMoves[move] = position;
		naiveStratigicTrace[naiveStratigicIndex] = position;
		naiveStratigicIndex++;
		
		//updates current board state for Naive agent
		dumb.updatecurrentState(board);
		smart.updatecurrentState(board);
		System.out.println(board[0]+"||"+board[1]+"||"+board[2] + "\n" +
				board[3] + "||" + board[4] + "||" + board[5] + "\n" +
				board[6] + "||" + board[7] + "||" + board[8]);
		System.out.println("Move: " + move + "\n");
		move++;
		
		if(move == 10)
			break;
		
		int randsmart = rand.nextInt(9);
		while(!smart.checkLegalMove(randsmart))
			randsmart = rand.nextInt(9);
		
		position = smart.pickMove(move,randsmart);

		//board[position] ='x';
		//lastmove = smart.pickMove(move,randsmart);
		
		//thoughtfulDomainTrace[thoughtfulDomainIndex] = smart.lastmove;
		board[position] ='x';
		smartMoves[move] = position;
		thoughtfulStratigicTrace[thoughtfulStratigicIndex] = position;
		thoughtfulStratigicIndex++;
		
		dumb.updatecurrentState(board);
		smart.updatecurrentState(board);
				System.out.println(board[0]+"||"+board[1]+"||"+board[2] + "\n" +
		board[3] + "||" + board[4] + "||" + board[5] + "\n" +
		board[6] + "||" + board[7] + "||" + board[8]);
				System.out.println("Move: " + move + "\n");	
		move++;
		
		
			//check for win for Thoughtful
			if((board[0] == 'x' && board[1]== 'x' && board[2] == 'x')|| (board[3] == 'x' && board[4]== 'x' && board[5] == 'x')||
					(board[6] == 'x' && board[7]== 'x' && board[8] == 'x') || (board[0] == 'x' && board[3]== 'x' && board[6] == 'x')||
					(board[1] == 'x' && board[4]== 'x' && board[7] == 'x')||(board[2] == 'x' && board[5]== 'x' && board[8] == 'x')||
					(board[0] == 'x' && board[4]== 'x' && board[8] == 'x')||(board[2] == 'x' && board[4]== 'x' && board[6] == 'x'))
				return 0;
			//check for win for Naive
			else if((board[0] == 'o' && board[1]== 'o' && board[2] == 'o')|| (board[3] == 'o' && board[4]== 'o' && board[5] == 'o')||
					(board[6] == 'o' && board[7]== 'o' && board[8] == 'o') || (board[0] == 'o' && board[3]== 'o' && board[6] == 'o')||
					(board[1] == 'o' && board[4]== 'o' && board[7] == 'o')||(board[2] == 'o' && board[5]== 'o' && board[8] == 'o')||
					(board[0] == 'o' && board[4]== 'o' && board[8] == 'o')||(board[2] == 'o' && board[4]== 'o' && board[6] == 'o'))
				return 1;
			//else
				//break;
		
		}
		return 2;
		
	}
			
	
	private static void printMessage(){
		System.out.println("java Board");
		//System.out.println("Thoughtful v Naive: 1");

			}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner readUserInput=new Scanner(System.in);
/*		if(args.length !=1){
			printMessage();
			System.exit(1);
		}*/
		//int games = Integer.parseInt(args[0]);
		try{
		//for(int i=0;i<5;i++){
			int result = 0;
			result = playtvn();
			/*System.out.println(board[0]+"||"+board[1]+"||"+board[2] + "\n" +
					board[3] + "||" + board[4] + "||" + board[5] + "\n" +
					board[6] + "||" + board[7] + "||" + board[8]);
							System.out.println("Move: " + move + "\n");*/
						
			if(result == 0)
				System.out.println("Thoughtful Wins!" + "\n");
			else if(result == 1)
				System.out.println("Naive Wins!" + "\n");
			else
				System.out.println("Draw!" + "\n");
			
			System.out.println("Naive strategic knowledge trace: ");
			for(int index=0; index < (move/2); index++)
			{
				if(naiveStratigicTrace[index] == 0)
					System.out.println("TOP-LEFT,");
				if(naiveStratigicTrace[index] == 1)
					System.out.println("TOP-MIDDLE,");
				if(naiveStratigicTrace[index] == 2)
					System.out.println("TOP-RIGHT,");
				if(naiveStratigicTrace[index] == 3)
					System.out.println("MIDDLE-LEFT,");
				if(naiveStratigicTrace[index] == 4)
					System.out.println("MIDDLE-MIDDLE,");
				if(naiveStratigicTrace[index] == 5)
					System.out.println("MIDDLE-RIGHT,");
				if(naiveStratigicTrace[index] == 6)
					System.out.println("BOTTOM-LEFT,");
				if(naiveStratigicTrace[index] == 7)
					System.out.println("BOTTOM-MIDDLE,");
				if(naiveStratigicTrace[index] == 8)
					System.out.println("BOTTOM-RIGHT,");
				
			}
			System.out.println("");

			System.out.println("Thoughtful strategic knowledge trace: ");
			for(int index=0; index < (move/2); index++)
			{
				if(thoughtfulStratigicTrace[index] == 0)
					System.out.println("TOP-LEFT,");
				if(thoughtfulStratigicTrace[index] == 1)
					System.out.println("TOP-MIDDLE,");
				if(thoughtfulStratigicTrace[index] == 2)
					System.out.println("TOP-RIGHT,");
				if(thoughtfulStratigicTrace[index] == 3)
					System.out.println("MIDDLE-LEFT,");
				if(thoughtfulStratigicTrace[index] == 4)
					System.out.println("MIDDLE-MIDDLE,");
				if(thoughtfulStratigicTrace[index] == 5)
					System.out.println("MIDDLE-RIGHT,");
				if(thoughtfulStratigicTrace[index] == 6)
					System.out.println("BOTTOM-LEFT,");
				if(thoughtfulStratigicTrace[index] == 7)
					System.out.println("BOTTOM-MIDDLE,");
				if(thoughtfulStratigicTrace[index] == 8)
					System.out.println("BOTTOM-RIGHT,");
				
			}
		
			System.out.println("");
			
			//try{
			String response="";
			
			//Thoughtful questions
			while(!response.equals("next") || !response.equals("next")){
			System.out.println("Ask Thoughtful a question. Type the number of the question, then press enter:");
			System.out.println("1 - What action did you take on move “x”?");
			System.out.println("2 - Why did you take the action you did at move “x”?\n");
			System.out.println("Type 'next' to ask Naive a question\n");
			 
			response = readUserInput.nextLine();
 
			 System.out.print("You entered ");
			 System.out.println(response);
			 
			 if(response.equals("2"))
			 {
				 
			 }
			 
			 else if(response.equals("1"))
			 {
				 System.out.println("Choose which move to ask about (from 1 to 9), then press Enter");
				 String move=readUserInput.nextLine();
				 int realMove= 0;
				 if(move.equals("0"))
					 realMove = 0;
				 else if(move.equals("1"))
					 realMove = 1;
				 else if(move.equals("2"))
					 realMove = 2;
				 else if(move.equals("3"))
					 realMove = 3;
				 else if(move.equals("4"))
					 realMove = 4;
				 else if(move.equals("5"))
					 realMove = 5;
				 else if(move.equals("6"))
					 realMove = 6;
				 else if(move.equals("7"))
					 realMove = 7;
				 else if(move.equals("8"))
					 realMove = 8;
				 //for(int i=0; i < smartMoves.length;i++)
//System.out.println(smartMoves[i]);
					          				if(smartMoves[realMove] == 0)
					        					System.out.println("On that move, I picked the TOP-LEFT square\n");
					        				if(smartMoves[realMove] == 1)
					        					System.out.println("On that move, I picked the TOP-MIDDLE square\n");
					        				if(smartMoves[realMove] == 2)
					        					System.out.println("On that move, I picked the TOP-RIGHT square\n");
					        				if(smartMoves[realMove] == 3)
					        					System.out.println("On that move, I picked the MIDDLE-LEFT square\n");
					        				if(smartMoves[realMove] == 4)
					        					System.out.println("On that move, I picked the MIDDLE square\n");
					        				if(smartMoves[realMove] == 5)
					        					System.out.println("On that move, I picked the MIDDLE-RIGHT sqauare\n");
					        				if(smartMoves[realMove] == 6)
					        					System.out.println("On that move, I picked the BOTTOM-LEFT square\n");
					        				if(smartMoves[realMove] == 7)
					        					System.out.println("On that move, I picked the BOTTOM-MIDDLE square\n");
					        				if(smartMoves[realMove] == 8)
					        					System.out.println("On that move, I picked the BOTTOM-RIGHT square\n");
				 }
			 }
			
			//Naive questions
			while(response.equals("Next") || response.equals("next")){
			System.out.println("Ask Naive a question. Type the number of the question, then press enter:");
			System.out.println("1 - What action did you take on move “x”?");
			System.out.println("2 - Why did you take the action you did at move “x”?\n");
			
			response = readUserInput.nextLine();
			 
			 System.out.print("You entered ");
			 System.out.println(response);
			 
			 if(response.equals("2"))
			 {
				 
			 }
			 
			 else if(response.equals("1"))
			 {
				 System.out.println("Choose which move to ask about (from 1 to 9), then press Enter");
				 String move=readUserInput.nextLine();
				 int realMove= 0;
				 if(move.equals("0"))
					 realMove = 0;
				 else if(move.equals("1"))
					 realMove = 1;
				 else if(move.equals("2"))
					 realMove = 2;
				 else if(move.equals("3"))
					 realMove = 3;
				 else if(move.equals("4"))
					 realMove = 4;
				 else if(move.equals("5"))
					 realMove = 5;
				 else if(move.equals("6"))
					 realMove = 6;
				 else if(move.equals("7"))
					 realMove = 7;
				 else if(move.equals("8"))
					 realMove = 8;
	
					          				if(dumbMoves[realMove] == 0)
					        					System.out.println("On that move, I picked the TOP-LEFT square\n");
					        				if(dumbMoves[realMove] == 1)
					        					System.out.println("On that move, I picked the TOP-MIDDLE square\n");
					        				if(dumbMoves[realMove] == 2)
					        					System.out.println("On that move, I picked the TOP-RIGHT square\n");
					        				if(dumbMoves[realMove] == 3)
					        					System.out.println("On that move, I picked the MIDDLE-LEFT square\n");
					        				if(dumbMoves[realMove] == 4)
					        					System.out.println("On that move, I picked the MIDDLE square\n");
					        				if(dumbMoves[realMove] == 5)
					        					System.out.println("On that move, I picked the MIDDLE-RIGHT sqauare\n");
					        				if(dumbMoves[realMove] == 6)
					        					System.out.println("On that move, I picked the BOTTOM-LEFT square\n");
					        				if(dumbMoves[realMove] == 7)
					        					System.out.println("On that move, I picked the BOTTOM-MIDDLE square\n");
					        				if(dumbMoves[realMove] == 8)
					        					System.out.println("On that move, I picked the BOTTOM-RIGHT square\n");
				 }
		}
			 
		}
		
		catch(NumberFormatException e){
			System.out.println("All parameters must be integers!");
			//printMessage();
			System.exit(1);
		}

		
	}
	
}


