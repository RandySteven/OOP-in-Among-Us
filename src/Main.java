import java.util.Random;
import java.util.Scanner;

public class Main {
	Player player;
	String name;
	Scanner scan = new Scanner(System.in);
	int numbRole, taskCount, killCount;
	Random rand = new Random();
	boolean success = false;
	void start() {
		
		if(player instanceof Crewmate) {
			System.out.println("There is 1 impostor among us");
			Crewmate crewmate = (Crewmate)player;		
			int mission;
			for(int i = 1 ; i <= 2 ; i++) {
				mission=rand.nextInt(4)+1;
				crewmate.task(mission);
				System.out.println("");
			}
			System.out.println("Victory");
		}
		
		if(player instanceof Impostor) {
			System.out.println("You're impostor");
			Impostor impostor = (Impostor)player;
			for(int i = 1 ; i <= 10 ; i++) {				
				int target=rand.nextInt(12)+1;
				impostor.kill(target);
			}
			
			if(impostor.getKillCount()<8) {
				System.out.println("Defeat");
			}else {
				System.out.println("Victory");
			}
		}
	}
	
	void play() {
		do {
			System.out.print("Masukkan nama : ");name=scan.nextLine();
		} while (name.length()<0||name.length()>8);
		numbRole = rand.nextInt(2)+1;
		if(numbRole==1) {
			player = new Crewmate(name, taskCount);
		}
		if(numbRole==2) {
			player = new Impostor(name, killCount);
		}
		start();
	}
	
	void rule() {
		System.out.println("1. Crewmate has 2 missions from 4 missions");
		System.out.println("2. Impostor has 10 times to kill impostor");
		System.out.println("3. If impostor kill count less than 8 then impostor lose");
		System.out.println("4. If impostor kill count more than 8 then impostor win");
		System.out.println("5. If crewmate finish all the missions then crewmate win");
	}
	
	void color() {
		System.out.println("1. Red");
		System.out.println("2. Blue");
		System.out.println("3. Pink");
		System.out.println("4. Lime");
		System.out.println("5. Cyan");
		System.out.println("6. Brown");
		System.out.println("7. White");
		System.out.println("8. Black");
		System.out.println("9. Yellow");
		System.out.println("10. Green");
		System.out.println("11. Orange");
		System.out.println("12. Purple");
	}
	
	public Main() {
	
		int input=-1;
		do {
			System.out.println("1. Play");
			System.out.println("2. Rule");
			System.out.println("3. List Color");
			System.out.println("0. Exit");
			System.out.print(">>");input=scan.nextInt();scan.nextLine();
			switch (input) {
			case 1:
				play();
				break;
			case 2:
				rule();
				break;
			case 3:
				color();
				break;
			default:
				break;
			}
		} while (input!=0);
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
