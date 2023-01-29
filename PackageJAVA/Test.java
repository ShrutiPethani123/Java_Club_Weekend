package teacher;

import student.*;


class Shruti extends Parshwa
{

	void msg()
	{
		talking();
		System.out.println("MSG");
	}

}

public class Test  {

	public static void main(String args[])
	{
		//Parshwa p = new Parshwa();
		//p.talking();

		//Test t = new Test();
		//t.disp();
	
		//Priyansh obj = new Priyansh();
		//obj.owl();

		Shruti s = new Shruti();
		s.msg();
	}

}