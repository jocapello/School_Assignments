import java.util.Scanner;

public class A3A
{
	private String Actor;
	private String Weapon;
	private String Job;
	private String District;
	public static Scanner input = new Scanner (System.in);
	public A3A(String Actor, String Weapon, String District, String Job){
		this.setActor(Actor);
		this.setWeapon(Weapon);
		this.setDistrict(District);
		this.setJob(Job);
	}
	// give value to District 
	public void setDistrict (String District) {
		// replace numbers with anything and it will check if districts is one of them
		if (District.equals("1")||District.equals("2")||District.equals("3")||District.equals("4")||
			District.equals("5")||District.equals("6")||District.equals("7")||District.equals("8")||
			District.equals("9")||District.equals("10")||District.equals("11")||District.equals("12")) {
			this.District = District;	
		}	
		else {
		}}
	public String getDistrict() {
		return District;
	}

	// getters and setters
	public String getActor() {
		return this.Actor;
	}
	public void setActor(String Actor) {
		this.Actor = Actor;
	}

	public String getWeapon() {
		return this.Weapon;
	}
	public void setWeapon(String Weapon) {
		this.Weapon = Weapon;
	}
	public String getJob() {
		return this.Job;
	}	public void setJob(String Job) {
		this.Job = Job;
	}}