
public class Thoughtful extends Agent2{
	public static int lastmove;
	


	public int pickMove(int move, int rand) {
		//first move
		if(move == 2){
			if(checkLegalMove(4)){
				lastmove = 4;
				return 4;
			}	
			else{
				lastmove = 0;
				return 0;}
		}
		//else if(move > 2)
			return Offense(rand);
	}
	
	int Offense(int rand) {
		if(lastmove == 0){
			if(currentState[1] == 'x' && checkLegalMove(2)){
				lastmove = 2;
				return 2;}
			else if(currentState[2] == 'x' && checkLegalMove(1)){
				lastmove = 1;
				return 1;}
			else if(currentState[4] == 'x' && checkLegalMove(8)){
				lastmove = 8;
				return 8;}
			else if(currentState[8] == 'x' && checkLegalMove(4)){
				lastmove = 4;
				return 4;}	
		}
		else if(lastmove == 1){
			if(currentState[0] == 'x' && checkLegalMove(2)){
				lastmove = 2;
				return 2;}
			else if(currentState[2] == 'x' && checkLegalMove(0)){
				lastmove = 0;
				return 0;}
			else if(currentState[7] == 'x' && checkLegalMove(4)){
				lastmove = 4;
				return 4;}
			else if(currentState[4] == 'x' && checkLegalMove(7)){
				lastmove = 7;
				return 7;}
		}
		else if(lastmove == 2){
			if(currentState[0] == 'x' && checkLegalMove(1)){
				lastmove = 1;
				return 1;}
			else if(currentState[1] == 'x' && checkLegalMove(0)){
				lastmove = 0;
				return 0;}
			else if(currentState[5] == 'x' && checkLegalMove(8)){
				lastmove = 8;
				return 8;}
			else if(currentState[8] == 'x' && checkLegalMove(5)){
				lastmove = 5;
				return 5;}
			else if(currentState[4] == 'x' && checkLegalMove(6)){
				lastmove = 6;
				return 6;}
			else if(currentState[6] == 'x' && checkLegalMove(4)){
				lastmove = 4;
				return 4;}
		}
		
		else if(lastmove == 3){
			if(currentState[0] == 'x' && checkLegalMove(6)){
				lastmove = 6;
				return 6;}
			else if(currentState[6] == 'x' && checkLegalMove(0)){
				lastmove = 0;
				return 0;}
			else if(currentState[5] == 'x' && checkLegalMove(4)){
				lastmove = 4;
				return 4;}
			else if(currentState[4] == 'x' && checkLegalMove(5)){
				lastmove = 5;
				return 5;}
		}
		else if(lastmove == 4){
			if(currentState[1] == 'x' && checkLegalMove(7)){
				lastmove = 7;
				return 7;}
			else if(currentState[7] == 'x' && checkLegalMove(1)){
				lastmove = 1;
				return 1;}
			else if(currentState[3] == 'x' && checkLegalMove(5)){
				lastmove = 5;
				return 5;}
			else if(currentState[5] == 'x' && checkLegalMove(3)){
				lastmove = 3;
				return 3;}
			else if(currentState[2] == 'x' && checkLegalMove(6)){
				lastmove = 6;
				return 6;}
			else if(currentState[6] == 'x' && checkLegalMove(2)){
				lastmove = 2;
				return 2;}
			else if(currentState[0] == 'x' && checkLegalMove(8)){
				lastmove = 8;
				return 8;}
			else if(currentState[8] == 'x' && checkLegalMove(0)){
				lastmove = 0;
				return 0;}
		}
		else if(lastmove == 5){
			if(currentState[2] == 'x' && checkLegalMove(8)){
				lastmove = 8;
				return 8;}
			else if(currentState[8] == 'x' && checkLegalMove(2)){
				lastmove = 2;
				return 2;}
			else if(currentState[3] == 'x' && checkLegalMove(4)){
				lastmove = 4;
				return 4;}
			else if(currentState[4] == 'x' && checkLegalMove(3)){
				lastmove = 3;
				return 3;}
		}
		
		else if(lastmove == 6){
			if(currentState[0] == 'x' && checkLegalMove(3)){
				lastmove = 3;
				return 3;}
			else if(currentState[3] == 'x' && checkLegalMove(0)){
				lastmove = 0;
				return 0;}
			else if(currentState[7] == 'x' && checkLegalMove(8)){
				lastmove = 8;
				return 8;}
			else if(currentState[8] == 'x' && checkLegalMove(7)){
				lastmove = 7;
				return 7;}
			else if(currentState[4] == 'x' && checkLegalMove(2)){
				lastmove = 2;
				return 2;}
			else if(currentState[2] == 'x' && checkLegalMove(4)){
				lastmove = 4;
				return 4;}
		}
		else if(lastmove == 7){
			if(currentState[4] == 'x' && checkLegalMove(1)){
				lastmove = 1;
				return 1;}
			else if(currentState[1] == 'x' && checkLegalMove(4)){
				lastmove = 4;
				return 4;}
			else if(currentState[6] == 'x' && checkLegalMove(8)){
				lastmove = 8;
				return 8;}
			else if(currentState[8] == 'x' && checkLegalMove(6)){
				lastmove = 6;
				return 6;}
		}
		else if(lastmove == 8){
			if(currentState[2] == 'x' && checkLegalMove(5)){
				lastmove = 5;
				return 5;}
			else if(currentState[5] == 'x' && checkLegalMove(2)){
				lastmove = 2;
				return 2;}
			else if(currentState[7] == 'x' && checkLegalMove(6)){
				lastmove = 6;
				return 6;}
			else if(currentState[6] == 'x' && checkLegalMove(7)){
				lastmove = 7;
				return 7;}
			else if(currentState[4] == 'x' && checkLegalMove(0)){
				lastmove = 0;
				return 0;}
			else if(currentState[0] == 'x' && checkLegalMove(4)){
				lastmove = 4;
				return 4;}
		}
		
		return Defense(rand);
	}
	
	
	int Defense(int rand) {
		//horizontal check
		if(currentState[0]== 'o' && currentState[1] == 'o' && currentState[2] != 'x' && checkLegalMove(2)){
			lastmove = 2;
			return 2;}
		else if(currentState[2] == 'o' && currentState[1] == 'o'&& currentState[0] != 'x' && checkLegalMove(0)){
			lastmove = 0;
			return 0;}
		else if(currentState[0] == 'o' && currentState[2] == 'o'&& currentState[1] != 'x' && checkLegalMove(1)){
			lastmove = 1;
			return 1;}
		
		else if(currentState[3] == 'o' && currentState[4] == 'o'&& currentState[5] != 'x' && checkLegalMove(5)){
			lastmove = 5;
			return 5;}
		else if(currentState[3] == 'o' && currentState[5] == 'o'&& currentState[4] != 'x' && checkLegalMove(4)){
			lastmove = 4;
			return 4;}
		else if(currentState[4] == 'o' && currentState[5] == 'o'&& currentState[3] != 'x' && checkLegalMove(3)){
			lastmove = 3;
			return 3;}
		
		else if(currentState[6] == 'o' && currentState[7] == 'o'&& currentState[8] != 'x' && checkLegalMove(8)){
			lastmove = 8;
			return 8;}
		else if(currentState[6] == 'o' && currentState[8] == 'o'&& currentState[7] != 'x' && checkLegalMove(7)){
			lastmove = 7;
			return 7;}
		else if(currentState[7] == 'o' && currentState[8] == 'o'&& currentState[6] != 'x' && checkLegalMove(6)){
			lastmove = 6;
			return 6;}
		
		//vertical check
		else if(currentState[0] == 'o' && currentState[3] == 'o'&& currentState[6] != 'x' && checkLegalMove(6)){
			lastmove = 6;
			return 6;}
		else if(currentState[0] == 'o' && currentState[6] == 'o'&& currentState[3] != 'x' && checkLegalMove(3)){
			lastmove = 3;
			return 3;}
		else if(currentState[6] == 'o' && currentState[3] == 'o'&& currentState[0] != 'x' && checkLegalMove(0)){
			lastmove = 0;
			return 0;}
		
		else if(currentState[1] == 'o' && currentState[4] == 'o'&& currentState[7] != 'x' && checkLegalMove(7)){
			lastmove = 7;
			return 7;}
		else if(currentState[1] == 'o' && currentState[7] == 'o'&& currentState[4] != 'x' && checkLegalMove(4)){
			lastmove = 4;
			return 4;}
		else if(currentState[4] == 'o' && currentState[7] == 'o'&& currentState[1] != 'x' && checkLegalMove(1)){
			lastmove = 1;
			return 1;}
		
		else if(currentState[5] == 'o' && currentState[2] == 'o'&& currentState[8] != 'x' && checkLegalMove(8)){
			lastmove = 8;
			return 8;}
		else if(currentState[5] == 'o' && currentState[8] == 'o'&& currentState[2] != 'x' && checkLegalMove(2)){
			lastmove = 2;
			return 2;}
		else if(currentState[2] == 'o' && currentState[8] == 'o'&& currentState[5] != 'x' && checkLegalMove(5)){
			lastmove = 5;
			return 5;}
		
		//dianginal check
		else if(currentState[0] == 'o' && currentState[8] == 'o'&& currentState[4] != 'x' && checkLegalMove(4)){
			lastmove = 4;
			return 4;}
		else if(currentState[0] == 'o' && currentState[4] == 'o'&& currentState[8] != 'x' && checkLegalMove(8)){
			lastmove = 8;
			return 8;}
		else if(currentState[4] == 'o' && currentState[8] == 'o'&& currentState[0] != 'x' && checkLegalMove(0)){
			lastmove = 0;
			return 0;}
		
		else if(currentState[4] == 'o' && currentState[2] == 'o'&& currentState[6] != 'x' && checkLegalMove(6)){
			lastmove = 6;
			return 6;}
		else if(currentState[6] == 'o' && currentState[2] == 'o'&& currentState[4] != 'x' && checkLegalMove(4)){
			lastmove = 4;
			return 4;}
		else if(currentState[6] == 'o' && currentState[4] == 'o'&& currentState[2] != 'x' && checkLegalMove(2)){
			lastmove = 2;
			return 2;
	}
		return rand;
	}

	@Override
	int pickRandomMove(int rand) {
		// TODO Auto-generated method stub
		return 0;
	}
		
		
		
}


