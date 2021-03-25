
public class HoltNoahAssignment8 {

	public static void main(String[] args) {
		/*Noah Holt
		 * CS1150 Principles of computer science
		 * m/w section
		 * Due 31 mar
		 * Assignment 8
		 * This assignment is to create a grade organizer of sorts using hardcoded arrays
		 * of grades and then from them, using multiple methods to get the highest grade
		 * the average grade, and assigning letter grades to each array for the two given 
		 * arrays and then printing them in a table for the user.
		 * 
		 * then some weird dog thing, still unsure about that part.
		 */

		// starting variables and arrays
		int[] grades;
		int[] gradesClass1 = {40, 55, 70, 58, 82};
		int[] gradesClass2 = {91, 76, 68, 89, 94, 84, 71, 65, 88};
		char[] letterGrades;
		
		// lets just pass a single array at a time
		for (int i = 0; i < 2; i++) {
			
			if (i == 0) {
				
				System.out.println("Class 1 Grades");
				System.out.println("--------------------------------------");
				System.out.println("Student		Grade	LetterGrade");
				System.out.println("--------------------------------------");
				
				grades = gradesClass1;
				letterGrades = new char[grades.length];
				processGrades(grades, letterGrades);
				
				System.out.println(" ");
				System.out.println(" ");
				
				
			} else {
				
				System.out.println("Class 2 Grades");
				System.out.println("--------------------------------------");
				System.out.println("Student		Grade	LetterGrade");
				System.out.println("--------------------------------------");
				
				grades = gradesClass2;
				letterGrades = new char[grades.length];
				processGrades(grades, letterGrades);
				
			} // if/else statement
			
		} //for statement
		
		
		
		//Dog[] dogArray = new Dog[5];
		
		
	} //main
	
	public static void processGrades(int[] grades, char[] letterGrades) {
		
		int peakGrade = highestGrade(grades);
		double normGrade = averageGrade(grades);
		
		letterAssignment(grades, letterGrades, peakGrade);
		displayGrades(grades, letterGrades, peakGrade, normGrade);
		
		System.out.println("Highest Grade = " + peakGrade);
		System.out.println("Average grade = " + normGrade);
		
		
		
	} //processGrades
	
	public static int highestGrade(int[] grades) {
		
		int highestGrade = 0;
		
		for (int h = 0; h < grades.length; h ++) {
			
			if (grades[h] > highestGrade) {
				
				highestGrade = grades[h];
			
			} //if
			
		} // for loop
		
		return highestGrade;
		
	} //highestGrade
	
	public static double averageGrade (int[] grades) {
		
		int allGrades = 0;
		
		for (int a = 0; a < grades.length; a++) {
			
			allGrades = allGrades + grades[a];
			
		} //for loop
		
		double averageGrade = allGrades / grades.length;
		return averageGrade;
	} //averageGrade
	
	public static void letterAssignment(int[] grades, char[] letterGrades, int highestGrade) {
		
		for (int l = 0; l < grades.length; l ++) {
			
			if (grades[l] >= (highestGrade - 10)) {
				
				letterGrades[l] = 'A';
				
			} else if (grades[l] >= (highestGrade - 20)) {
				
				letterGrades[l] = 'B';
				
			} else if (grades[l] >= (highestGrade - 30)) {
				
				letterGrades[l] = 'C';
				
			} else if (grades[l] >= (highestGrade - 40)) {
				
				letterGrades[l] = 'D';
				
			} else {
				
				letterGrades[l] = 'F';
				
			}
			
		} // for loop
		
		
	} // letterGrade
	
	public static void displayGrades(int[] grades, char[] letterGrades, int highestGrade, double averageGrade) {
		
		for (int d = 0; d < grades.length; d++) {
			
			int student = d+1;
			System.out.println(student + "	" + grades[d] + "	" + letterGrades[d]);
			
		} // for loop
		
	} // displayGrades

} //assignment8

//weird dog thing as mentioned before

class Dog {
	
	private String name;
	
	private String bark;
	
	public Dog(String name, String bark) {
		
		this.name = name;
		this.bark = bark;
		
	} //dog
	
	public String getName() {
		
		return name;
		
	} //getName
	
	public void setName(String name) {
		
		this.name = name;
		
	} //setName
	
	public String getBark() {
		
		return bark;
		
	} //getBark
	
	public void setBark(String bark) {
		
		this.bark = bark;
		
	} //setBark
	
} // dog

