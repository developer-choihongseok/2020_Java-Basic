// 키와 값을 하나의 아이템으로 저장하고 검색 수정이 가능한 추상 클래스.
abstract class PairMap{
	
	protected String keyArray[];					// key들을 저장하는 배열
	protected String valueArray[];					// value들을 저장하는 배열
	
	abstract String get(String key);				// key값으로 value를 검색
	abstract void put(String key, String value);	// key와 value를 쌍으로 저장
	abstract String delete(String key);				// key값을 가진 아이템(value와 함께)을 삭제, 삭제된 value값 리턴
	abstract int length();							// 현재 저장된 아이템의 갯수 리턴
}

class Dictionary extends PairMap{
	
	int count = 0;	// 현재 저장된 아이템의 갯수 -> 전체 배열에 들어있는 아이템의 갯수(= 인덱스)값
	
	public Dictionary(int capacity) {
		keyArray = new String[capacity];
		valueArray = new String[capacity];
	}
	
	// key값으로 value를 검색
	@Override
	String get(String key) {
		// 현재 배열에 저장된 아이템의 갯수만큼 반복.
		for(int i = 0; i < count; i++) {
			if(keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;	// key를 발견할 수 없다면 null을 리턴.
	}

	// key와 value를 쌍으로 저장
	@Override
	void put(String key, String value) {
		int i = 0;
		
		// 현재 배열에 저장된 원소 갯수만큼 반복(배열이 count만큼 돌면서 key값이 같은게 있는지 체크)
		for(i = 0; i < count; i++) {
			if(keyArray[i].equals(key)) {
				break;
			}
		}
		
		// key를 발견하지 못한 경우, 아이템 배열에 들어있는 아이템의 갯수만큼 반복.
		if(i == count) {
			if(i < keyArray.length) {	// 배열이 꽉차지 않은 경우에만 key값과 value값 저장, count 값 증가.
				keyArray[i] = key;
				valueArray[i] = value;
				count++;
			}
		}else {	// key를 발견하고, value가 수정되는 경우, count는 증가 X.
			keyArray[i] = key;
			valueArray[i] = value;
		}
	}
	
	// key값을 가진 아이템(value와 함께)을 삭제, 삭제된 value값 리턴
	@Override
	String delete(String key) {
		int i = 0;
		
		// 현재 배열에 저장된 원소 갯수만큼 반복(배열이 count만큼 돌면서 key값이 같은게 있는지 체크)
		for(i = 0; i < count; i++) {
			if(keyArray[i].equals(key)) {
				break;
			}
		}
		
		if(i == count) {	// 발견 안됨
			return null;
		}
		
		String value = valueArray[i];
		
		// 앞으로 한 자리씩 이동.
		int last = count - 1;
		
		for(int j = i; j < last; j++) {
			keyArray[j] = keyArray[j+1];
			valueArray[j] = valueArray[j+1];
		}
		count--;
		
		return value;
	}
	
	// 현재 저장된 아이템의 갯수 리턴
	@Override
	int length() {
		return count;
	}
}