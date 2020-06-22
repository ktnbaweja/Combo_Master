package Combo_Master;

import java.util.Scanner;

public class Combo extends Hits{
	
	Hits hit;
	
	
	public Combo() {
		// TODO Auto-generated constructor stub
		hit = new Hits();
		
	}
	
	public void combo1(){
		hit.resetStamina();
		hit.armJab();
		hit.armJab();
		hit.armHook();
		hit.legRoundhouseKick();
		hit.totalDamage();
	}
	
	public void combo2(){
		hit.resetStamina();
		hit.legFrontKick();
		hit.armJab();
		hit.armHook();
		hit.legRoundhouseKick();
		hit.totalDamage();
	}
	
	public void combo3(){
		hit.resetStamina();
		hit.legFrontKick();
		hit.legFrontKick();
		hit.legRoundhouseKick();
		hit.legRoundhouseKick();
		hit.armJab();
		hit.armHook();
		hit.totalDamage();
	}
	
}
