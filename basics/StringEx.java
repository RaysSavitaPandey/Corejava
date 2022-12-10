package in.co.rays.basics;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Vijay Dinanath Chauhan";
		System.out.println(s.length());
		System.out.println(s.charAt(6));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
        System.out.println(s.indexOf("Dina"));
        System.out.println(s.indexOf("i"));
        System.out.println(s.replace("a","b"));
        System.out.println(s.lastIndexOf("i"));
        System.out.println(s.replaceAll("a","b"));
        //String Buffer
 StringBuffer sb=new StringBuffer("Hello");
 System.out.println(sb);
 sb.append("CoreJava Batch");
 sb.append(", 12-1pm");
 System.out.println(sb);
        
        

	}

}
