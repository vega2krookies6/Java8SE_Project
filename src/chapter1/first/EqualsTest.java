package chapter1.first;
public class EqualsTest {
    public static void main( String[] args ){
    	
        String str1 = "abc";
        String str2 = "ABC";
        
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
    	
         
        MyDate date1 = new MyDate( 6, 9, 2006 );
        MyDate date2 = new MyDate( 6, 9, 2006 );

        if ( date1.equals(date2) ){
            System.out.println("동일한 날짜입니다.");
        }else{
            System.out.println("다른 날짜입니다.");
        }
        
        System.out.println( "===================" );   
        System.out.println( "<<toString() method overriding>>" ); 
        
        
        System.out.println( date1 );
        System.out.println( date1.toString() );
    }
    
 }