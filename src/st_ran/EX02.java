package st_ran;

public class EX02 {
public static void main(String[] args) {
	String str = "test";
	System.out.println("length :"+str.length() );//문자 길이
	System.out.println("charAt(1)"+str.charAt(1) );//문자 순서를 적으면 찾아준다
	
	System.out.println(str.charAt(0)=='t');
	System.out.println(str.charAt(0)!= 't');
	System.out.println(str.equals("aaaa"));
	
	
	String jumin = "900014";
	if(jumin.length()==6) {
		int i=0;
		for (;i<6;i++) {
			if(jumin.charAt(i) < '0'
					||jumin.charAt(i) > '9') {
				System.out.println("숫자를 입력하세요");
			break;
			}
		}
			if( i== jumin.length() ) {
				System.out.println("뒷자리 주민번호를 입력하세요");
			}
		}else { 
		System.out.println("길이가 잘못");	
	}
	System.out.println("--------------");
	
	int i = 0;
	for(;i<5;i++) {
		if(i==4) break;
	}
		System.out.println("i : "+i);
	
}
}

