
public class Naive extends Agent2 {
	public static int lastmove;
	
	@Override
	int Offense(int rand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int Defense(int rand) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	int pickRandomMove(int rand) {
		lastmove = rand;
		return rand;
	}

}
