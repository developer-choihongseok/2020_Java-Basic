package API;

// 문자열 조작이 가능하다!!(추가, 자르기, 삽입, 삭제...)
// 추가적으로 넣는다.
public class StringBufferTest {
	public static void main(String[] args) {
		
//		String str1 = "Hello Java";
//		str1 = "Hello Python";
		
//		String str1 = new String("This is");
//		String str2 = "This is";
		
		StringBuffer sb = new StringBuffer("This is");
		
		sb.append(" test" );	// 문자열 끝에 추가
		System.out.println(sb);
		
		sb.insert(8, "StringBuffer ");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.setCharAt(0, '!');
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.setLength(20);	// 문자열 강제 길이 제한을 둘 때 사용.
		System.out.println(sb);
		
		String sql = "insert into member";
		sql += "values";
		sql += "(";
		sql += "scott";
		sql += "tiger";
		
		System.out.println(sql);
		
		StringBuffer sb1 = new StringBuffer("insert into member");
		sb1.append("values");
		sb1.append("(");
		sb1.append("scott");
		sb1.append("tiger");
		
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("Hello Korea");
		
		sb2.replace(6, 11, "Java");
		System.out.println(sb2.capacity());	// 넉넉하게 잡은 버퍼의 크기를 뜻한다.
		System.out.println(sb2.length());
		
//		sb2.deleteCharAt(3);
		sb2.delete(3, 6);
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer("abc");
		StringBuffer sb4 = new StringBuffer("abc");
		
		System.out.println("sb3 == sb4: " + (sb3 == sb4));
		System.out.println("sb3.equals: " + sb3.equals(sb4));	// 단점 및 중요: StringBuffer는 문자열 비교가 안된다!!
		
		// ★ StringBuffer 문자열 비교하는 방법 : StringBuffer 클래스의 내용을 String 변환.
		String s = sb3.toString();
		String s2 = sb4.toString();
		
		System.out.println("s.equals(s2): " + s.equals(s2));
		
		StringBuffer sb5 = new StringBuffer(s);
		
		sb5.append("Success");
		System.out.println(sb5);
	}
}