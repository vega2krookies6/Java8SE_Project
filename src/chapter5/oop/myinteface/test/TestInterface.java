package chapter5.oop.myinteface.test;

import chapter5.oop.myinteface.IRemoteControl;
import chapter5.oop.myinteface.LGRemoteTv;

public class TestInterface {


	public static void main(String[] args) {
		//Interface도 추상클래스와 마찬가지로 객체생성 할 수 없다.
		//IRemoteControl rc = new IRemoteControl();
		System.out.println(IRemoteControl.ON);
		
		IRemoteControl rc = new LGRemoteTv(); //2개
		rc.powerOn();
		rc.powerOff();
		
		LGRemoteTv lgTv = new LGRemoteTv(); //3개
		System.out.println(lgTv.getBrandName());
		lgTv.powerOn();
		lgTv.powerOff();
		
		

	}

}
