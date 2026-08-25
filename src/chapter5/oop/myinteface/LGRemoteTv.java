package chapter5.oop.myinteface;

public class LGRemoteTv implements IRemoteControl{

	@Override  //오버라이딩 규칙을 지켰는지를 체크하는 어노테이션(annotation)
	public void powerOn() {
		System.out.println("TV 전원 On!!");
	}

	@Override
	public void powerOff() {
		System.out.println("TV 전원 Off!!");		
	}
	
	public String getBrandName() {
		return "LG TV";
	}
}
