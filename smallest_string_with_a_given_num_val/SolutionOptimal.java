class SolutionOptimal {
    public String getSmallestString(int n, int k) {
     
        char[]res = new char[n];
		
		int i = n -1;
		while(k > 0) {
			--n;
			int idx = Math.min(k-n, 26);
			res[i] = (char)('a' + idx-1); 
			k -= idx;
            --i;
		}
		
		return new String(res);
        
    }
}
