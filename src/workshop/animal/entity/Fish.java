package workshop.animal.entity;

public class Fish extends Animal implements Pet {
	private String name;
	
	public Fish() {
		super(0);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("물고기는 어항에서 놀아요!");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("물고기는 플랑크톤을 먹어요!");
	}

}
