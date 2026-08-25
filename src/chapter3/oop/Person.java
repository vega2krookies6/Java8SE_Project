package chapter3.oop;

public class Person {
	/*
	 * instance 변수(객체변수) : name, age, heigth, weight
	 *   : instance 변수는 객체에 속한 변수이므로 반드시 객체를 생성한 후에 접근할 수 있다.
	 * static 변수(클래스변수) : fingerCount
	 *   : static 변수는 클래스에 속한 변수이므로 객체를 생성하지 않고 클래스명.변수 로 
	 *     접근할 수 있다.
	 */
	//이름
	private String name;
	//나이
	private int age;
	//키
	private int height;
	//몸무게
	private int weight;
	//손가락갯수
	static private int fingerCount;
	
	//default constructor
	public Person() {
		System.out.println("default constructor가 호출됨");
	}
	
	public Person(String name, int age, int height, int weight) {
		System.out.println("아규먼트가 있는 생성자가 호출됨");
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//static initializer
	static {
		System.out.println("static initializer 호출됨");
		fingerCount = 100;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static int getFingerCount() {
		return fingerCount;
	}
	public static void setFingerCount(int fingerCount) {
		Person.fingerCount = fingerCount;
	}
	
	
}
