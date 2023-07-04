package javapractice;

public class puntermwrcir {
	static double cir()
	{
		int r=2;
		final double pi=3.142;
		double res=pi*r*r;
		return res;
	}
	public static void main(String[]Args)
	{
		System.out.println("--main starts--");
		double s=cir();
		System.out.println(s);
		System.out.println("--main ends--");
	}
	

}
