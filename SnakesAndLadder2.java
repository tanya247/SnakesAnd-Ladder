public class SnakesAndLadder2 {
	public static final int Snakes_come = 1;
	public static final int Ladder_come = 2;
	public static final int No_play = 3;
	public static void main(String args[]) {
		int no_of_person = 2;
		int position1 = 0;
		int position2 = 0;
		int i = 0;
		int count1 = 0;
		int count2 = 0;
		int no_of_fields = 100;
		while(position1 < 100 && position2 < 100) {
		    if(i%2 == 0){
    			count1 = count1 + 1;
    			int dice_roll = (int)Math.floor(Math.random()*10) % 7;
    			int check = (int)Math.floor(Math.random()*10) % 4;
        		switch(check) {
        		    case Snakes_come :
        			    position1 = position1 - dice_roll;
    					    break;
        			case Ladder_come:
        				position1 = position1 + dice_roll;
						    i = i - 1;
    					  break;
    				case No_play:
    				    position1 = position1;
    				    break;
        		}
    			if(position1 > 100) {
    			    position1 = position1 - dice_roll;
    				
    			}
    			else if (position1 == 100){
    				position1 = position1;
    			}
    			else if(position1<0){
    				position1 = 0;
    			}
    			
		    }
		    else{
		        count2 = count2 + 1;
    			int dice_roll = (int)Math.floor(Math.random()*10) % 7;
    			int check = (int)Math.floor(Math.random()*10) % 3;
    			position2 = position2 + dice_roll;
    			switch(check) {
        		    case Snakes_come :
        			    position2 = position2 - dice_roll;
    					    break;
        			case Ladder_come:
        				position2 = position2 + dice_roll;
						    i = i - 1;
    					  break;
    				case No_play :
    				    position2 = position2;
    				    break;
        		}
    			if(position2 > 100) {
    			    position2 = position2 - dice_roll;
    				
    			}
    			else if (position2 == 100){
    				position2 = position2;
    			}
    			else if(position2<0){
    				position2 = 0;
    			}
    			
		    
		    }
		    i = i + 1;
		}
		if (position1 == 100){
		    System.out.println("Person1 wins");
		    
		}
		else{
		    System.out.println("Person2 wins");
		    
		}
	}
}
