import java.util.Scanner;

public class Player {

	//Declaring attributes:
	static String firstName;
	static String lastName;
	static int AB;
	static int H;
	static int Dubs;
	static int Trips;
	static int HR;
	static int R;
	static int BB;
	
	
	Player (String inf_firstName, String inf_lastName, int inf_AB, int inf_H, int inf_Dubs, int inf_Trips, int inf_HR, int inf_R, int inf_BB){
		firstName = inf_firstName;
		lastName = inf_lastName;
		AB = inf_AB;
		H = inf_H;
		Dubs = inf_Dubs;
		Trips = inf_Trips;
		HR = inf_HR;
		R = inf_R;
		BB = inf_BB;
		
	}
	//Methods:
	String getInfo() {
		return "Name: "+firstName+ " "+lastName+", "+"At bats: "+AB+", "+"Hits: "+H+", "+"Doubles: "+Dubs+", "+"Triples: "+Trips+", "+"Home Runs: "+HR+", "+"Runs: "+R+", "+"Walks: "+BB;
	}
	public static double getBA() {
		double BA = H/AB;
		return BA;
	}
	public static double getOBP() {
		double OBP = ((H + BB + 43)/(AB + BB + 43 + 113)); //43 being the HBP and 113 being SH
		return OBP;
	}
	public static double getSLG() {
		double SLG = ((H + Dubs +Trips + HR)/AB);
		return SLG;
	}
	public static double getOBS() {
		double OBS = ((H + BB + 43)/(AB + BB + 43 + 113)) + ((H + Dubs +Trips + HR)/AB);
		return OBS;
	}
	public static int getTB() {
		int TB = H + Dubs + Trips + HR;
		return TB;
	}
	
	public static void main(String args[]) {
		Scanner playerInfo = new Scanner(System.in);
		
		System.out.println("Enter player's first name:" );
		firstName = playerInfo.toString();
		
		System.out.println("Enter player's last name:" );
		lastName = playerInfo.toString();
		
		System.out.println("Enter player's number of at bats:" );
		AB = playerInfo.nextInt();
		
		System.out.println("Enter player's number of hits:" );
		H = playerInfo.nextInt();
		
		System.out.println("Enter player's number of doubles:" );
		Dubs = playerInfo.nextInt();
		
		System.out.println("Enter player's number of triples:" );
		Trips = playerInfo.nextInt();
		
		System.out.println("Enter player's number of home runs:" );
		HR = playerInfo.nextInt();
		
		System.out.println("Enter player's number of runs:" );
		R = playerInfo.nextInt();
		
		System.out.println("Enter player's number of walks:" );
		BB = playerInfo.nextInt();
	
		System.out.printf("Player's batting average is %d", + getBA());
		System.out.printf("Player's OBP is %d", + getOBP());
		System.out.printf("Player's SLG is %d", + getSLG());
		System.out.printf("Player's OBS is %d", + getOBS());
		System.out.printf("Player's TB is %d", + getTB());
		
	
	
	}
	
}
