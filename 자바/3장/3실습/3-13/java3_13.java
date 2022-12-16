package java3;

public class java3_13 {

	public static void main(String[] args) {
		System.out.println("2018212031 이원찬");
		double sum = 0.0;
		for (int i=0; i<args.length; i++) 
		{
			sum += Double.parseDouble(args[i]); // 문자열을 실수(double 타입)로 변환하여 합산
			
		}
		System.out.println("합계 :" + sum);

	}

}
