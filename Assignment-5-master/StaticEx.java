public class StaticEx
{
	static int roll_no;
	static String name;
	static{
		System.out.println("first static block");
		roll_no =99;
		name = "gagan";
	}
	static{
		System.out.println("second static block");
		roll_no=88;
		name ="deep";
	}
	public static void main(String[] args)
	{
		System.out.println("roll_no = "+ roll_no +" , "+  "name = "+ name);
	}

}
