
public abstract class Agent2 {
	
	//Domain Knowledge
	public static char currentState[];
	public static int movesList[];
		
	void updatecurrentState(char[] state)
	{
		currentState = new char[9];
		for(int i =0; i < state.length; i++)
			currentState[i] = state[i];
	}
	boolean checkLegalMove(int move)
	{
		if(currentState[move] == 0)
			return true;
		else
		return false;	
	}
	
	//Strategic Knowledge
	abstract int pickRandomMove(int rand);
	abstract int Offense(int rand);
	abstract int Defense(int rand);
	

}
