package String;

public class PalinSub {
	public static int countsubstring(String str) {
		int n=str.length();
		int a,b;
		int result=0;
		for(int i=0;i<n;i++) {
			a=i;
			b=i;
			while(a>=0 && b<n &&(str.charAt(a)==str.charAt(b))) {
				result++;
				a--;
				b++;
			}
			a=i;
			b=i+1;
			while(a>=0 && b<n &&(str.charAt(a)==str.charAt(b))) {
				result++;
				a--;
				b++;
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		int answer=countsubstring("aaa");
		System.out.println(answer);
	}

}
