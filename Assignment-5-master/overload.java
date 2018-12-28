class overload{
	void print(){
		System.out.println("Null argument");
	}
	void print(int i){
		System.out.println("integer argument");
	}
	void print(float f){
		System.out.println("float argument");
	}
	public static void main(String[] args){
		overload ov=new overload();
		ov.print();
		ov.print(1);
	      ov.print(1.2f);
		  }
	
}