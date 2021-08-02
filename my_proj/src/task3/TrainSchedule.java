package task3;

public class TrainSchedule {
	
	public static void main(String[] args) {
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)");
		System.out.println("--------------------------------------");
		System.out.println("#  Code  Station          Arr.   Dep.");
		System.out.println("--------------------------------------");
		
		Trains t[] = {
				new Trains(1, "YPR", "Yasvantpur Jn", "", "23.40"),
				new Trains(2, "GTL", "Guntakal Jn", "03.45", "03.50"),
				new Trains(3, "SC", "Secundrabad Jn", "08.55", "09.10"),
				new Trains(4, "BPQ", "Balharshah", "13.30", "13.35"),
				new Trains(5, "HBJ", "Habibganj", "21.20", "21.25"),
				new Trains(6, "JHS", "Jhansi Jn", "01.15", "01.20"),
				new Trains(7, "DEE", "Delhi S Rohilla", "07.00", "")
		};
		
		for(Trains t1 : t) {
			t1.printStatement();
		}
		
		System.out.println("--------------------------------------");


	}

}
