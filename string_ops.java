package array_list;

public class string_ops {

	public static void main(String[] args) {

		//System.out.println(palin("nitin"));
		substring("nitin");
		//substringpalin("nitin");
	}

	public static boolean palin(String s) {
		int count = 0;
		for (int i = s.length() - 1, j = 0; i > j; i--, j++) {
			if (s.charAt(i) != s.charAt(j))
				return false;

		}

		return true;
	}
	
	public static void substring(String s) {
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i,j));
			}
			
		}
		
}
	
public static void substringpalin(String s) {
		
	int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String ss=s.substring(i,j);
				if(palin(ss))
					count++;
			}
			
		}
		System.out.println(count);
		
}

}