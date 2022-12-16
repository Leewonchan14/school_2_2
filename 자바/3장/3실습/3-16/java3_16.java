package java3;

public class java3_16 {

	public static void main(String[] args) {
		System.out.println("2018212031 이원찬");
		int[] intArray = new int[5];
		intArray[0] = 0;
		try 
		{
			for (int i=0; i<5; i++) 
			{
				System.out.println("intArray["+i+"]"+"="+intArray[i]);
				intArray[i+1] = i+1 + intArray[i];
			}
		}
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
			}

		}

}
