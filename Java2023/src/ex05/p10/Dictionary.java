package ex05.p10;

public class Dictionary extends PairMap {

	private int count; 
	
	public Dictionary(int capacity) {
		keyArray = new String[capacity];
		valueArray = new String[capacity];
		count = 0;
	}

	@Override
	void put(String key, String value) {
		//내가 입력한 키가 있는지 확인부터 해야함
		int i=0;
		for(i=0; i<count;i++)
		{
			if(key.equals(keyArray[i]))
				break;
		}
		
		if(i == count)//동일키가 없을 경우
		{
			if(i < keyArray.length)//꽉차지 않았을때
			{
				keyArray[i] = key;
				valueArray[i] = value;
				count++;
			}
		}
		else//동일키가 있을 경우
		{
			keyArray[i] = key;
			valueArray[i] = value;
		}			
	}
	
	@Override
	String get(String key) {
		for(int i=0; i<count;i++)
		{
//			if(key.equals(keyArray[i]))
			if(keyArray[i].equals(key))
				return valueArray[i];
		}
		
		return null;
	}

	@Override
	String delete(String key) {
		int i=0;
		for(i=0; i<count;i++)
		{
			if(key.equals(keyArray[i]))
				break;
		}
		
		if(i == count)//찾는 키가 없다.지울게 없다
			return null;
		
		String str1 = valueArray[i];
		
		for(int j=i;j<count-1;++j)
		{
			keyArray[j] = keyArray[j+1];
			valueArray[j] = valueArray[j+1];
		}
		
		count--;
		
		return str1;
	}

	@Override
	int length() {
		return count;
	}

}
