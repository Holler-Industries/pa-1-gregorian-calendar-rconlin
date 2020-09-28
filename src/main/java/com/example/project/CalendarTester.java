package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar(2020, Calendar.SEPTEMBER,23);


        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument
        System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Expected: 4");     //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.
        // R: This line will display the day, month, and year without printing each one individually.
        System.out.println("myCal Current Date: " + myCal.getTime());

        // R: But, just 'cuz, here's confirmation that each variable is correct.
        System.out.println("myCal Day: " + myCal.get(Calendar.DAY_OF_MONTH));
        int actualMonth = (myCal.get(Calendar.MONTH) + 1);
        System.out.println("Actual Month: " + actualMonth);
        System.out.println("myCal Year: " + myCal.get(Calendar.YEAR));

        // R: Extra credit attempt with if statements.. success!
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==2) {
            System.out.println("Current Day of Week: Monday");
        }
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==3) {
            System.out.println("Current Day of Week: Tuesday");
        }
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==4) {
            System.out.println("Current Day of Week: Wednesday");
        }
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==5) {
            System.out.println("Current Day of Week: Thursday");
        }
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==6) {
            System.out.println("Current Day of Week: Friday");
        }
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==7) {
            System.out.println("Current Day of Week: Saturday");
        }
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==1) {
            System.out.println("Current Day of Week: Sunday");
        }

        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        myCal.add(Calendar.DAY_OF_MONTH, 100); // R: Adds 100 days as per task
        System.out.println("New Time: " + myCal.getTime());


        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html


        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)

        GregorianCalendar bCal = new GregorianCalendar (2020, Calendar.JUNE, 20);
        System.out.println("Birthday 2020: " + bCal.getTime());

        // R: Above prints the full date of my 2020 birthday, weekday included

        bCal.add(Calendar.DAY_OF_YEAR, 10000);
        System.out.println("Birthday + 10,000: " + bCal.getTime()); // I'll be 44!

    }

}