package string;

public class StringBuliderTest {
	public static void main(String[] args) {
		String  javaStr = new String("java");
		System.out.println("javaStr문자열 주소:"+System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산전 buffer 메모리 주소 :"+System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append("  android");
		buffer.append("  programming if fun!");
		System.out.println("연산 후 buffer 메모리 주소: " +System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소:"+ System.identityHashCode(javaStr));

	}

}
