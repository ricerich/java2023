package ex04.p10;

public class Dictionary 
{
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	
	public static String kor2Eng(String word) 
	{
		for(int i=0; i<eng.length;++i)
		{
//			if(kor[i].equals(word))
			if(word.equals(kor[i]))
				return eng[i];
		}
		
		return null;
	}
}
