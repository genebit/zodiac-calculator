// package code.sample;

import java.util.*;

public class ZodiacSign
{
	private static Scanner userInput;
	private static int birthYear, birthMonth, birthDay;
	private static int startingYear = 1960;
	private static int currentYear = 2020;
	private static boolean isValidInputYear, isValidInputMonth, isValidInputDay;
	
	public static void main(String[] args)
	{
		do { getUserBirthInfo(birthYear, birthMonth, birthDay); }// Determine the user Info
		while (!isValidInputYear || !isValidInputMonth || !isValidInputDay);
	}
	public static void getUserBirthInfo(int _year, int _month, int _day)
	{
		System.out.println("---INPUT---");

		userInput = new Scanner(System.in);
		System.out.print("Birth Year: ");
		_year = userInput.nextInt(); 
		birthYear = _year;
		
		var inRangeOfRequiredYears = _year >= startingYear && _year <= currentYear;
			if (inRangeOfRequiredYears) { isValidInputYear = true; }  // Check if input year is right in bet. req year
			else { isValidInputYear = false; }

		System.out.print("Birth Month: ");
		_month = userInput.nextInt();
		birthMonth = _month;
		
		var inRangeOfMonthInYears = _month >= 1 && _month <= 12;
			if (inRangeOfMonthInYears) { isValidInputMonth = true; } // Check the month if in-between the month in a year
			else { isValidInputMonth = false; }

		System.out.print("Birth Day: ");
		_day = userInput.nextInt();
		birthDay = _day;
		
		var inRangeOfDaysInMonth = _day >= 1 && _day <= 31;
			if (inRangeOfDaysInMonth) { isValidInputDay = true; } // Check the day is in-between the days in a month
			else { isValidInputDay = false; }

		if (isValidInputYear && isValidInputMonth && isValidInputDay) // if user input met the req: calculate
		{
			System.out.println("---OUTPUT---");
			
			determineZodiacSign(birthMonth, birthDay);
			determineChineseZodiacSign(birthYear);
			determineLeapYear(birthYear);
		}
		else if (!isValidInputYear) System.out.println("Invalid Year input!");
		else if (!isValidInputMonth) System.out.println("Invalid Month input!");
		else if (!isValidInputDay) System.out.println("Invalid Day input!");
	}
	public static void determineLeapYear(int _year)
	{	
		if (_year % 100 == 0 || _year % 400 == 0) { System.out.println("Year " + _year + " is a Leap Year."); } // Formula for getting the leapyear
		else { System.out.println("Year " + _year + " is Not a Leap Year."); }
	}
	public static void determineChineseZodiacSign(int _year)
	{
		String zodiac = "";
		int months = 12;
	
		switch ((_year - 4) % months) // Formula for getting the chinese zodiac
		{
			case 0: zodiac = "Rat"; break;
			case 1: zodiac = "Ox"; break;
			case 2: zodiac = "Tiger"; break;
			case 3: zodiac = "Rabbit"; break;
			case 4: zodiac = "Dragon"; break;
			case 5: zodiac = "Snake"; break;
			case 6: zodiac = "Horse"; break;
			case 7: zodiac = "Goat"; break;
			case 8: zodiac = "Monkey"; break;
			case 9: zodiac = "Rooster"; break;
			case 10: zodiac = "Dog"; break;
			case 11: zodiac = "Pig"; break;
		}
		System.out.println("Chinese Zodiac: " + zodiac);
	}
	private static void determineZodiacSign(int _month, int _day)
	{
		String zodiac = "";

		switch (_month)
		{
			case 1: // January
				if (_day < 20) zodiac = "Capricorn";
				else zodiac = "aquarius";
					break;
			case 2: // February
				if (_day < 19) zodiac = "Aquarius";
				else zodiac = "pisces";
					break;
			case 3: // March
				if (_day < 21) zodiac = "Pisces";
				else zodiac = "aries";
					break;
			case 4: // April
				if (_day < 20) zodiac = "Aries";
				else zodiac = "taurus";
					break;
			case 5: // May
				if (_day < 21) zodiac = "Taurus";
				else	zodiac = "gemini";
					break;
			case 6: // June
				if (_day < 21) zodiac = "Gemini";
				else zodiac = "cancer";
					break;
			case 7: // July
				if (_day < 23) zodiac = "Cancer";
				else zodiac = "leo";
					break;
			case 8: // August
				if (_day < 23) zodiac = "Leo";
				else zodiac = "virgo";
					break;
			case 9: // September
				if (_day < 23) zodiac = "Virgo";
				else zodiac = "libra";
					break;
			case 10: // October
				if (_day < 23) zodiac = "Libra";
				else zodiac = "scorpio";
					break;
			case 11: // November
				if (_day < 22) zodiac = "Scorpio";
				else zodiac = "sagittarius";
					break;
			case 12: // December
				if (_day < 22) zodiac = "Sagittarius";
				else zodiac = "capricorn";
					break;
		}
		System.out.println("Zodiac Sign: " + zodiac);
	}
}
