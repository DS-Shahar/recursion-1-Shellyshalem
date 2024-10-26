package rekursia;

public class hw1 {

	public static int f1(int n) {
		if(n==1)
			return 1;
		return n+f1(n-1);
	}
	
		
	public static int f2(int n) {
		if(n==1) {
			return 1;
		}
		return n*f2(n-1);
	}
	
	
	public static int f3(int n) {
		if(n%2==0) {
			n=n-1;
		}
		if (n==1)
			return 1;
		
			return n*f3(n-2);
	}
	
	public static int f4(int n) {
		if(n==0) {
			return 0;
		}
		return 1+f4(n/10);
	}
	
	public static int f5(int n1,int n2) {
		if(n1<n2) {
			return 0;
		}
		return 1+f5(n1-n2,n2);
		}
	
	public static int f6(int n1,int n2) {
		if(n1<0) {
			return n1+n2;
		}
		return 0+f6(n1-n2,n2);
		}
	

	public static boolean f7(int n1,int n2) {
		if(n1<0) {
			return false;
		}
		if(n1==0) {
			return true;
		}
		return f7(n1-n2,n2);
		}
	
	public static boolean f8(int n) {
		if(f8_2(n,n-1)==1) {
			return false;
		}
		return true;
		}
	
	public static int f8_2(int n1,int n2) {
		if(n2<=1) {
			return 0;
		}
		else if(n1%n2==0) {
			return 1;
		}
		return 0+f8_2(n1,n2-1);		
	}
	
	public static boolean f9(int n) {
		if(n<10) {
			return true;
		}
		int odd=1;
		int even=2;
		boolean flag;
		if((n%10)%2==0) {
			flag=f9_2(even,n/10);
		}
		else {
			flag=f9_2(odd,n/10);
		}
		return flag;	
	}
	
	public static boolean f9_2(int f,int n) {
		if(n<10) {
			if((n%2==0&&f==2)||(n%2==1&&f==1)) {
				return true;
			}
			return false;
		}
		if((n%2==0&&f==2)||(n%2==1&&f==1)) {
			return f9_2(f,n/10);
		}
		return false;
		
	}
	
	public static void main(String[] args) {
	}

	
}
