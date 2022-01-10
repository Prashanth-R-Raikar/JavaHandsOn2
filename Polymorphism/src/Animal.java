
public class Animal {
void whoAmI(){
	System.out.println("I am an animal");
	}
}
class dog extends Animal{
	void whoAmI(){
		System.out.println("I am a dog");
	}
}
class cow extends Animal{
	void whoAmI(){
		System.out.println("I am a cow");
	}
}
class snake extends Animal{
	void whoAmI(){
		System.out.println("I am a snake");
	}
}	
class RunTimePolymorphismDemo{
	public void main(String[] args) {
		Animal ref1 = new Animal();
		Animal ref2 = new dog();
		Animal ref3 = new cow();
		Animal ref4 = new snake();
		ref1.whoAmI();
		ref2.whoAmI();
		ref3.whoAmI();
		ref4.whoAmI();
	}
}