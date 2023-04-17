package helloWorld;

public class Hunter {
	private int power;
	
	Hunter(int power){
		this.power = power;
	}
	
	void attack(Monster Monster){
		int hp = Monster.getHp();
		hp = hp - power;
		System.out.println("Hunter 가 %s 을 %d의 파워로 공격 했습니다." + Monster + power);
		Monster.setHp(hp);
		System.out.println("%s의 체력이 %d 남았습니다." + Monster + Monster.getHp());
	}
	
	public static void main(String[] args) {
		Monster M = new Monster(1000);
		Hunter H = new Hunter(100);
		
		H.attack(M);
	}
}
