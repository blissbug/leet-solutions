class Solution {
    public boolean isAdditiveNumber(String num) {

        for(int i=1;i<Math.min(num.length(), 19);i++) {
			for(int j=i+1;j<Math.min(num.length(), 19);j++) {
				String astr=num.substring(0,i);
				long a=Long.parseLong(astr);
				if(a>0 && astr.startsWith("0")) {
					continue;
				}
				String bstr=num.substring(i,j);
				long b=Long.parseLong(bstr);
				if(b>0 && bstr.startsWith("0")) {
					continue;
				}
				if(next(a,b,num.substring(j))) {
                    return true;
				}
			}
		}
		return false;		

	}
	public static boolean next(long a,long b,String num) {
		if(num.length()==0) {
			return true;
		}
		long res=a+b;
		String start=String.valueOf(res);
		if(num.startsWith(start)) {
			a=b;
			b=res;
			return next(a,b,num.substring(start.length()));
		}
		return false;
	}

}