//Initializing Arrays
public class ArrayDemo3 {
	public static void main(String[] args) {
		//배열의 초기값
		//1. 정수형
//		int [] array = new int[4];	//배열 만들때 방 개수 지정
//		for(int i=0; i<array.length; i++) {
//			System.out.print("array[" + i + "] = " + array[i] + "\t");
//		}	//정수형은 자동적으로 0으로 초기화 (byte, int, short, long 모두)
			//아직 넣어준 값이 없기 때문에
		
		//2. 실수형
//		double [] array = new double[4];	//32바이트의 공간
//		for(int i=0; i<array.length; i++) {
//			System.out.print("array[" + i + "] = " + array[i] + "\t");
//		}//double은 0.0으로 초기화
		
		//3. 문자형
//		char [] array = new char[4];
//		for(int i=0; i<array.length; i++) {
//			System.out.print("array[" + i + "] = " + array[i] + "\t");
//		}//문자형은 null값('\0' 또는 '\u0000')으로 초기화
		
		//null값 표현하는 방법(주소x) : ascii, unicode
		
		//4. boolean형
//		boolean [] array = new boolean[4];
//		for(int i=0; i<array.length; i++) {
//			System.out.print("array[" + i + "] = " + array[i] + "\t");
//		}//불린형은 false로 초기화
		
		//5. 참조형 ex.String
		String [] array = new String[4];
		for(int i=0; i<array.length; i++) {
			System.out.print("array[" + i + "] = " + array[i] + "\t");
		}//참조형은 null번지로 초기화(null값 x)
	}
}
