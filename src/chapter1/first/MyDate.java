package chapter1.first;

public class MyDate extends Object {
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

	
    public void setDay( int newDay ){
    	day = newDay;
    }
    
    public void setMonth( int newMonth ){
    	month = newMonth;
    }

    public void setYear( int newYear ){
    	year = newYear;
    }

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		//형변환 (casting)
		MyDate other = (MyDate) obj;
		//day(일)비교
		if (this.day != other.day)
			return false;
		//month(월)비교
		if (this.month != other.month)
			return false;
		//year(년도)비교
		if (this.year != other.year)
			return false;
		return true;
	}
    
	
    
    
}