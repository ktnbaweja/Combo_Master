package Combo_Master;

public class Hits {

	public  int stamina = 200;
	public  int health = 100;
	public int damage = 0;

	public Hits() {
		// TODO Auto-generated constructor stub
		
	}

	public void armJab(){
		if(stamina>0){
		performing("armJab");
		this.stamina = stamina-10;
		this.damage = damage + 30;
		}
	}
	
	public void armHook(){
		if(stamina>0){
		performing("armHook");
		this.stamina = stamina-15;
		this.damage = damage + 15;
		}
	}
	
	public void legRoundhouseKick(){
		if(stamina>0){
		performing("legRoundhouseKick");
		this.stamina = stamina-30;
		this.damage = damage + 60;
		}
	}
	
	public void legFrontKick(){
		if(stamina>0){
		performing("legFrontKick");
		this.stamina = stamina-20;
		this.damage = damage + 45;
		}
	}
	
	public void performing(String command){
		System.out.println("performing "+command);
	}
	
	public void resetStamina(){
		
		stamina = 100;
		
	}
	
	public void totalDamage(){
		System.out.println("Total damage done = "+ damage);
		damage = 0;		
		
		
	}
	
	
}
