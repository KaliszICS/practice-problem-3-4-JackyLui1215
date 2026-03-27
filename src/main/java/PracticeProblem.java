/**
	* Lesson: Nested Ifs
	* Author: Jacky Lui
	* Date Last Modified: March 26, 2026
	*/
public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int min(int num1, int num2, int num3) {
		int min = 0;
	    if(num1 <= num2) {
			if (num1 <= num3) {
			min = num1;
			}
		}
		if(num2 <= num1) {
			if(num2 <= num3) {
			min =num2;
			}
	    }
		if(num3 <= num1) { 
			if(num3 <= num2) {
			min =num3;
			}
		}
		return min;

        }

		public static boolean isLeapYear(int year) {
			boolean isLeapYear = false;
			if((year%4) == 0) {
            if((year%100) == 0) {
            if((year%400) == 0) {
                isLeapYear=true;
			}
			else {
				isLeapYear=false;
			}
			}
			else {
				isLeapYear=true;
			}
			}
			else {
				isLeapYear=false;
			}
			return isLeapYear;
		}
	
}
