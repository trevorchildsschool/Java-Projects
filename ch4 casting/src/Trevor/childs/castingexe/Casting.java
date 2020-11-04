package Trevor.childs.castingexe;
/* trevor childs
 * 9/28
 */



import java.lang.*;

public class Casting {

	public Casting() {
		double value1 = 7.2;
		int value2 = (int)value1;
		
		int number55 = 55;
		char five = (char)number55;
		
		int value3 = 100;
		double value4 = value3;
		
		byte num1 = 127;
		java.lang.Byte num2 = 127;
		/*
		 * byte	java.lang.Byte
		short	java.lang.Short
		int	    java.lang.Integer
		long	java.lang.Long
		float	java.lang.Float
		double	java.lang.Double
		char	java.lang.Character
		boolean	java.lang.Boolean
		 */
		
		
		short num3 = 127;
		Short num4 = 127;
		Integer num5 = 5;
		
		int maxintvalue = Integer.MIN_VALUE;
		
		System.out.println(maxintvalue);
		
		
	}

	public static void main(String[] args) {
		new Casting();
		
	}

}
