package a_oca.q042;

public class Q042 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("A");
		sb.append("A");
		sb.append("A");
		sb.append("A");
		System.out.println("before delete: " + sb);
		
		sb.delete(0, sb.length()); // this is the way to delete all in stringbuilder
		
		System.out.println("after delete: " + sb);

	}
}
