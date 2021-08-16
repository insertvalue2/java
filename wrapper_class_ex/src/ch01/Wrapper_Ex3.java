package ch01;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		String str = "10";
        String str2 = "10.5";
        String str3 = "true";

        int i = Integer.parseInt(str);
        double d = Double.parseDouble(str2);
        boolean bool = Boolean.parseBoolean(str3);
        
        System.out.println("문자열 int값 변환 : "+i);
        System.out.println("문자열 double값 변환 : "+d);
        System.out.println("문자열 boolean값 변환 : "+bool);
        
	}
}
