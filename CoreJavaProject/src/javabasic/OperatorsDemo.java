package javabasic;

public class OperatorsDemo {

	public static void main(String[] args) {
		// DEMO FOR % and / 
		int num1 = 20;
		int num2 = 3;
		int result1 = num1 % num2;
		int result2 = num1 / num2;
		double result3 = (double)num1 / (double)num2;
		System.out.println("20 % 3 = " + result1);
		System.out.println("20 / 3 = " + result2);
		System.out.println("20 / 3 = " + result3);
		
		System.out.println("----------------------");
		// DEMO FOR *=
		int num5 = 20;
		num5 *= 3; // this line is expanded as num5 = num5 * 3
		System.out.println("num5 *= 3 is: " + num5);
		
		System.out.println("----------------------");
		// DEMO FOR ternary operator ?: and relational operator ==
		// to check if a number is odd or even
		int num6 = 20;
		char result6 = (num6%2 == 0)?'y':'n';
		System.out.println(num6 + " is even? " + result6);
		
		System.out.println("----------------------");
		// DEMO FOR bitwise opertors
		// Bitwise AND
		byte myByte1 = 5; 					// 0000 0101
		byte myByte2 = 3; 					// 0000 0011
		int answer1 = myByte1 & myByte2;	// 0000 0001	
		System.out.println("5 & 3 = " + answer1);
		
		// Bitwise OR
		int answer2 = myByte1 | myByte2;	// 0000 0111 = 7
		System.out.println("5 | 3 = " + answer2);
		
		// Bitwise XOR
		int answer3 = myByte1 ^ myByte2;	// 0000 0110 = 6
		System.out.println("5 ^ 3 = " + answer3);
		
		// Bitwise left shift operator  <<
		int answer4 = myByte1 << 3; // 00000101 << 1 = 00001010 , 00001010 << 1 = 00010100, 00010100 << 1 = 00101000 = 40 
		System.out.println("5 << 3 = " + answer4); // formula is 5 * 2^3
		
		// Bitwise unsigned right shift >>>
		// here the sign is not preserved

		int myByte5 = -40;
		int answer5 = myByte5 >>> 3; 
		System.out.println("-40 >>> 3 = " + answer5); 
		
		// Bitwise signed right shift >>
		// here the sign is preserved
		int myByte6 = -40;
		int answer6 = myByte6 >> 3; 
		System.out.println("-40 >> 3 = " + answer6); // formula is 40 / 2^3
	}

}