import java.util.Random;
import java.util.Scanner;

public class Crewmate extends Player implements Task{
	private int taskCount;
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	public Crewmate(String name, int taskCount) {
		super(name);
		this.taskCount = taskCount;
	}
	protected int getTaskCount() {
		return taskCount;
	}
	protected void setTaskCount(int taskCount) {
		this.taskCount = taskCount;
	}
	
	//task increment
	public void addTaskCount(int taskCount) {
		this.taskCount += taskCount;
	}
	
	/*
	 * Override
	 * Dapatnya dari interfaace task
	 * */
	@Override
	public void task(int i) {
		//Success akan true apabila berhasil menyelesaikan misi
		boolean success=false;
		
		
		//List misi :
		//1. Swipe card admin
		//2. Cable
		//3. Matematika
		//4. Tebak angka
		if(i==1) {
			int swipeSpeed;
				do {
					System.out.print("Swipe card : ");swipeSpeed=scan.nextInt();scan.nextLine();
					if(swipeSpeed<2) {
						System.out.println("Too slow");
					}else if(swipeSpeed>5) {
						System.out.println("Too fast");
					}else {
						success = true;
					}
				} while (swipeSpeed<2||swipeSpeed>5);
		}
		if(i==2) {
			String cable="";
			do {
				System.out.print("Cable color [red|yellow|pink|blue] : ");cable=scan.nextLine();
				if(!cable.equalsIgnoreCase("yellow")&&!cable.equalsIgnoreCase("pink")&&!cable.equalsIgnoreCase("red")&&!cable.equalsIgnoreCase("blue")) {
					System.out.println("Cable must color red yellow pink blue");
				}
				success = true;
			} while (!cable.equalsIgnoreCase("yellow")&&!cable.equalsIgnoreCase("pink")&&!cable.equalsIgnoreCase("red")&&!cable.equalsIgnoreCase("blue"));
		}
		if(i==3) {
			int a;
			int b;
			int c;
			do {
				a = rand.nextInt(100)+1;
				b = rand.nextInt(100)+1;
				System.out.print(a + " + " + b + " = ");c=scan.nextInt();scan.nextLine();
				if(a+b==c) {
					success = true;
				}
			} while (a+b!=c);
		}
		if(i==4) {
			int randomNumber = rand.nextInt(5) + 1;
			int input;
			do {
				System.out.print("Guest random number [1..5] : ");input=scan.nextInt();scan.nextLine();
				if(input!=randomNumber) {
					System.out.println("False, please try again");
				}
				if(input==randomNumber) {
					System.out.println("Congratulation");
					success=true;
				}
			} while (input!=randomNumber);
		}
		if(i==5) {
			for(int j = 0 ; j <= 100 ; j+=20) {
				System.out.println("Downloading ... " + j + "%");
			}
			success=true;
		}
		//Kalau success maka task nya naik
		if(success=true) {
			addTaskCount(1);
		}
		System.out.println("Crewmate : " + getName());
		System.out.println("Task : " + getTaskCount());
	}
	
	
	
}
