public class SnakesAndLadder1 {
	public static final int Snakes_come = 1;
	public static final int Ladder_come = 2;
	public static final int No_play = 3;
	public static void main(String args[]) {
		int no_of_person = 1;
		int position = 0;
		int count = 0;
		int no_of_fields = 100;
		while(position < 100) {
			count = count + 1;
			int dice_roll = (int)Math.floor(Math.random()*10) % 7;
			int check = (int)Math.floor(Math.random()*10) % 3;
			
			switch(check) {
    			case Snakes_come :
    				position = position - dice_roll;
					break;
    			case Ladder_come:
    				position = position + dice_roll;
					break;
				case No_play:
					position = position ;
					break;
    			}
    		if(position > 100) {
			    position = position - dice_roll;
			}
			else if (position == 100){
				position = position;
			}
			else if(position<0){
				position = 0;
			}
		
			System.out.println(position);
		}
		System.out.println("Win");
		System.out.println("Dies rolls: " + count);
	}
}
