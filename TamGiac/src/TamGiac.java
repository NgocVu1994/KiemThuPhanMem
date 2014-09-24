public class TamGiac {
	String triangle(int a, int b, int c){
		String s = null;
		if(a>=b+c||b>=a+c||c>=a+b){
			s = "khong la tam giac";
		}
		else{
			
			if((a==b) && (c==b)) s = "tam giac deu";
			else{
				if(a!=b && b!=c && a!=c) s = "tam giac thuong";
				else s = "tam giac can";
			}
			if((a*a+b*b==c*c) || (a*a+c*c==b*b) || (c*c+b*b==a*a)) s = "tam giac vuong";
		}
		
		return s;
	}
}