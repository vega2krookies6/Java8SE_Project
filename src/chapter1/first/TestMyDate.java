package chapter1.first;


public class TestMyDate{
 
	public static void main( String[] args ){
	
    /*	
        MyDate date = new MyDate();
        date.setDay( 5 );
        date.setDay( date.getDay() + 1 );

        date.setMonth( 2 );

        date.setYear( 2007 );

        System.out.println( date.getYear() + "년 " + 
	      					date.getMonth() + "월 " + 
	      					date.getDay() + "일 입니다." ) ;
	      					
        */	  

	  MyDate date = new MyDate( 6, 2, 2007 );
         System.out.println( date.getDay() );
	  MyDate date2 = new MyDate();

    }
}