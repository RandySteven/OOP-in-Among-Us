import java.util.Scanner;

public class Impostor extends Player implements Kill{
	private int killCount;
	Scanner scan = new Scanner(System.in);
	public Impostor(String name, int killCount) {
		super(name);
		this.killCount = killCount;
	}
	protected int getKillCount() {
		return killCount;
	}
	protected void setKillCount(int killCount) {
		this.killCount = killCount;
	}
	
	public void addKillCount(int killCount) {
		this.killCount += killCount;
	}
	String color;
	@Override
	public void kill(int i) {
		boolean success=false;
			String killColor;
			if(i==1) {
				color = "Red";
				System.out.print("Kill color " + i + ":");killColor=scan.nextLine();
				if(killColor.equals(color)) 
					success=true;
			}else if(i==2) {
				color = "Blue";
				System.out.print("Kill color : " + i + ":");killColor=scan.nextLine();
				if(killColor.equals(color)) 
					success=true;
			}else if(i==3) {
				color = "Pink";
				System.out.print("Kill color : " + i + ":");killColor=scan.nextLine();
				if(killColor.equals(color)) 
					success=true;
			}else if(i==4) {
				color = "Lime";
				System.out.print("Kill color : " + i + ":");killColor=scan.nextLine();
				if(killColor.equals(color)) 
					success=true;
			}else if(i==5) {
				color = "Cyan";
				System.out.print("Kill color : " + i + ":");killColor=scan.nextLine();
				if(killColor.equals(color)) 
					success=true;
			}else if(i==6) {
				color = "Brown";
				System.out.print("Kill color : " + i + ":");killColor=scan.nextLine();
				if(killColor.equals(color)) 
					success=true;
			}else if(i==7) {
				color = "White";
				System.out.print("Kill color : " + i + ":");killColor=scan.nextLine();
				if(killColor.equals(color)) 
					success=true;
			}else if(i==8) {
				color = "Black";
				System.out.print("Kill color : " + i + ":");killColor=scan.nextLine();
				if(killColor.equals(color)) 
					success=true;
			}else if(i==9) {
				color = "Yellow";
				System.out.print("Kill color : " + i + ":");killColor=scan.nextLine();
				if(killColor.equals(color)) 
					success=true;
			}else if(i==10) {
				color = "Green";
				System.out.print("Kill color : " + i + ":");killColor=scan.nextLine();
				if(killColor.equals(color)) 
					success=true;
			}else if(i==11) {
				color = "Orange";
				System.out.print("Kill color : " + i + ":");killColor=scan.nextLine();
				if(killColor.equals(color)) 
					success=true;
			}else if(i==12) {
				color = "Purple";
				System.out.print("Kill color : " + i + ":");killColor=scan.nextLine();
				if(killColor.equals(color)) 
					success=true;
			}
		
		if(success==true) {
			addKillCount(1);
		}
		System.out.println("Impostor name : " + getName());
		System.out.println("Kill Count : " + getKillCount());
	}
}
