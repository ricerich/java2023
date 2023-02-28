package ex05.p10;

public class CMain 
{
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(2);
		dic.put("손흥민", "축구");
		dic.put("아이유", "가수");
		dic.put("아이유", "배우");
		dic.put("홍길동", "학생");
		System.out.println("아이유의 값은" + dic.get("아이유"));
		System.out.println("손흥민의 값은" + dic.get("손흥민"));
		String str1 = dic.delete("손흥민");
		System.out.println(str1+"이 삭제되었습니다!");
		
		System.out.println("손흥민의 값은" + dic.get("손흥민"));
	}
}








