package chapter1.first;

import java.util.HashSet;
import java.util.Set;

public class EqualsTest {
    public static void main( String[] args ){
    	
        String str1 = "abc";
        String str2 = new String("abc");
        
        if( str1.equals( str2 )){
            System.out.println( "equals test : str1과 st2는 같은 string입니다." );
        }else{
            System.out.println( "equals test : str1과 st2는 다른 string입니다." );            
        }

        if( str1.equalsIgnoreCase( str2 )){
            System.out.println( "equalsIgnoreCase test : str1과 st2는 같은 string입니다." );
        }else{
            System.out.println( "equalsIgnoreCase test : str1과 st2는 다른 string입니다." );            
        }
        System.out.println( "===================" ); 
        Set<String> strSet = new HashSet<>();
        strSet.add(str1);
        strSet.add(str2);
        strSet.add("bfs");
        
        for (String value : strSet) {
			System.out.println(value);
		}
        System.out.println( "===================" ); 
         
        MyDate date1 = new MyDate( 6, 9, 2006 );
        MyDate date2 = new MyDate( 6, 9, 2006 );
        MyDate date3 = date2;

        System.out.println("date1 hashCode " + date1.hashCode());
        System.out.println("date2 hashCode " +date2.hashCode());
        
        System.out.println(date1 == date2);
        System.out.println(date2 == date3);
        
        if ( date1.equals(date2) ){
            System.out.println("동일한 날짜입니다.");
        }else{
            System.out.println("다른 날짜입니다.");
        }
        
        System.out.println( "===================" );   
        System.out.println( "<<toString() method overriding>>" ); 
        
        
        System.out.println( date1 );
        System.out.println( date1.toString() );
        
        System.out.println( "HashSet<MyDate>===================" );
        Set<MyDate> dateSet = new HashSet<>();
        dateSet.add(date1);
        dateSet.add(date2);
        
        for (MyDate myDate : dateSet) {
			System.out.println(myDate);
		}
        
        
        
    }
    
 }