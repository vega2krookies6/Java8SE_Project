package workshop.animal.entity;

public class Spider extends Animal {
	public Spider() {
		super(8);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("거미는 벌레를 먹어요!");
	}

}
