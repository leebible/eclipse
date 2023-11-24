package kr.or.ddit.sutdy07.sec02.test01;

public class Main {
	public static void main(String[] args) {

		Animal a = new Animal();
		Cat c = new Cat();
		Dog d = new Dog();

		a = c;
		c = (Cat) a;
		
//		c = (Cat) d;
	}

}
