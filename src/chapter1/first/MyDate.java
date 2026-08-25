package chapter1.first;

public class MyDate{
    private int day = 1;
    private int month = 1;
    private int year = 2000;
     
    public MyDate(){
    }
           
    public MyDate( int newDay, int newMonth, int newYear ){
        day = newDay;
        month = newMonth;
        year = newYear ;
    }
    
    public int getDay(){
    	return day;
    }

    public int getMonth(){
    	return month;
    }
    
    public int getYear(){
    	return year;
    }

	/**
	  * day�� ���� setting ���ִ� method
	  */
    public void setDay( int newDay ){
    	day = newDay;
    }
    
    public void setMonth( int newMonth ){
    	month = newMonth;
    }

    public void setYear( int newYear ){
    	year = newYear;
    }
}