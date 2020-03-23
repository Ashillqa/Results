package com.qa.main;

public class Results {
	
	
	public int Total = 0;
	public int max_Total = 450;
	
	public void   totalGrade(int Physics,int Chemistry, int Biology) {
		
	 Total = Total += Physics + Chemistry + Biology;
		
		System.out.println("Physics: "+ Physics + "\n" + "Chemistry: " + Chemistry + "\n"+ "Biology: " + Biology + "\n"+ "Total: " + Total);
	}
	
	public int gradePercentage() {
		
		int Percentage = (Total * 100)/max_Total;
		
		
		return Percentage;
	}
	
	public String Outcome() {
		
		System.out.println("Final Verdict:");
		
		if (gradePercentage() > 60) {
			return "You have passed";
		} else {
			return "You utter Failure";
		}
	}

	
}
