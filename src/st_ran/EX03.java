package st_ran;

public class EX03 {
public static void main(String[] args) {
	String str = "test		";
	System.out.println("str : "+str);
	System.out.println(str.equals("test"));
	
	String result = str.trim(); //저장된 공간을 삭제해주는 코드
	System.out.println("result :"+result);
	System.out.println(result.equals("test"));



	String addr = "05214/노원구/동일로4567"; //특정 문자를 짤라준다.따로따로 꺼내올때
	System.out.println(addr);
	
	String[] split = addr.split("/"); //어떤값을 기준으로 자를꺼냐
	for(int i =0;i<split.length;i++) {
		System.out.println(i+"."+split[i]);
	}

	String phone = "010-1234-1234";
	String rep = phone.replace("-","a");  // 문자열의 문자를 변경해준다.
	System.out.println("rep :"+rep);
	
	phone = "1234";
	int num = Integer.parseInt(phone);//문자열상태의 숫자를 숫자로 변경해준다.
	System.out.println( num + 100);
	String s = num + ""; // 다시 문자로 만들때 사용
	System.out.println(s + 100);
	
}
}















