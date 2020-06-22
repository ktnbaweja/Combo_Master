package Combo_Master;

import java.util.Scanner;

public class PlayGame extends Combo{
	
	

	public PlayGame() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		Combo combo = new Combo();
		
	        Scanner user_input = new Scanner(System.in);

	        String wantPlay;
	        // asking the player if they want to play
	        System.out.println("Want to play a fighting game?: ");
	        wantPlay = user_input.next();

	        // if the player chooses to play, it will start the game loop
	        if(wantPlay.equals("Yes") || wantPlay.equals("yes")){

	            System.out.println("Hey folks!, were going to have an exiting game today!");

	            String action;
	            System.out.println("What would you like to do? (a)combo1 (b)combo2 (c)combo3: ");
	            action = user_input.next();
	            
	            if(action.equals("a")||action.equals("A")){
	            	combo.combo1();
	            }
	            else if(action.equals("b")||action.equals("B")){
	            	combo.combo2();
	            }
	            else if(action.equals("c")||action.equals("C")){
	            	combo.combo3();
	            }
	            else{
	            	System.out.println("Enter correct input");
	            }
	        }
	        else {
	        	System.out.println("Your inpur is neither Yes nor yes so the won't start.Enter Yes or yes to start the game.");
	        }
		
	       
	}

}


