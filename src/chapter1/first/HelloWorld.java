package chapter1.first;

public class HelloWorld {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("주민번호와 이름을 아규먼트로 넣으세요!!");
			System.exit(0); //0 :정상종료, -1 : 비정상종료
		}
//		System.out.println(" Hello Java!!!");
		System.out.println("주민번호 : " + args[0]);
		System.out.println("주민번호뒤번호첫글자 :" + args[0].charAt(6));
		checkGender(args);
		System.out.println(checkGender(args[0]));
		
		System.out.println("이름 : " + args[1]);
	}//main
	
	public static String checkGender(String ssn) {
		String genderStr = null;
		char gender = ssn.charAt(6);
		if(gender == '1' || gender == '3') {
			genderStr = "남자";
		}else if(gender == '2' || gender == '4' ) {
			genderStr = "여자";
		}
		return genderStr;
	}
	
	
	public static void checkGender(String[] args) {
		char gender = args[0].charAt(6);
		if(gender == '1' || gender == '3') {
			System.out.println("남자");
		}else if(gender == '2' || gender == '4' ) {
			System.out.println("여자");
		}
	}//checkGender
}//class
