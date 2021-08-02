package task3;

public class Trains {
	private int sNo;
	private String trainCode;
	private String stationName;
	private String arrTime;
	private String depTime;
	
	public Trains(int sNo, String trainCode, String stationName, String arrTime, String depTime) {
		this.sNo = sNo;
		this.trainCode = trainCode;
		this.stationName = stationName;
		this.arrTime = arrTime;
		this.depTime = depTime;
	}
	
	public void printStatement() {
		System.out.printf("%d  %-4s  %-15s %6s %6s\n", sNo, trainCode, stationName, arrTime, depTime);
	}

}
