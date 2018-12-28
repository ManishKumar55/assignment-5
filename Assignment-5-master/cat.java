class Animal{
	String bread;
	String color;
	void speak(){
		System.out.println("Speak-Speak");
	}
}
class Dog extends Animal{
	void speak(){
		System.out.println("bou-bou");
	}
}
class cat extends Animal{
	void speak(){
		System.out.println("meaw-meaw");
	}
	public static void main(String[] args){
		cat c=new cat();
		c.speak();
	}
	
}