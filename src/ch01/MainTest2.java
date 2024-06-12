package ch01;

public class MainTest2 {

	public static void main(String[] args) {

		String str1 = "10A";
		String str2 = "20.5";
		String str3 = "true";

		System.out.println(str2 + 100); // 문자열("20.5") + 숫자
		System.out.println(str2 + "A"); // 문자열("20.5") + 문자

		// str1 <-- 10
		// 문자열의 데이터 타입을 정수값으로 변경하는 방법
		try {
			int n1 = Integer.parseInt(str1);
			System.out.println(n1 + 100);
		} catch (Exception e) {
			System.out.println("잘못된 입력 값입니다.");
		}

		// String str1 = "10A";
		// 정수값으로 얼마나 변경해야 하는지 알 수 없기 때문에 NumberFormatException 발생
		// 예외 처리 하기

		// str 2 --> double --> 8byte
		double d = Double.parseDouble(str2);
		System.out.println(d);

		// str3 --> boolean(1byte) -->
		boolean b = Boolean.parseBoolean(str3);
		System.out.println(b);

		// 반대로 -- int 값을 --> String 데이터 타입으로 변환하고 싶다면
		int number = 10000;
		String numberStr = String.valueOf(number);
		System.out.println(numberStr);

	}

}
