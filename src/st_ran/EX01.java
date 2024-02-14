package st_ran;

public class EX01 {
public static void main(String[] args) {
	String str;
	String str1 = new String();
	String str2 = "test";
	String str3 = new String("test init");
	System.out.println("str3 :"+str3);
	String s1 = str3.toUpperCase();//해당하는 값을 전부 대문자로 변경해준다
	System.out.println("s1 :"+s1);
	String s2 = s1.toLowerCase();//소문자로 변경해준다
	System.out.println("s2 :"+s2);
	
	str3 = "JaVa";//java,JAVA //대소문자 비교할때 사용하는 코드
	if(str3.toLowerCase().equals("java")) {//equals와 같이 사용한다.
		System.out.println("수강 과목은 자바군요");
	}else {
		System.out.println("다르다!");
	}
}
}
