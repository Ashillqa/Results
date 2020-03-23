package com.qa.main;

public class runner {

	public static void main(String[] args) {
		
		Results grade = new Results();
		
		grade.totalGrade(49, 55, 62);
		
		System.out.println("");
		
		System.out.println(grade.gradePercentage());
		
		System.out.println(grade.Outcome());

	}

}
