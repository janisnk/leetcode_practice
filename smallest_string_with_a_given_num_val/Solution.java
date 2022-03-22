class Solution {
    public String getSmallestString(int n, int k) {
     
        StringBuilder sb = new StringBuilder();
		
		String[] letters = {"a","b","c","d","e","f","g","h", "i",
				"j", "k", "l", "m", "n", "o", "p",
				"q","r","s","t","u","v", "w", "x", "y", "z"};
		
		
		while(k > 0) {
			--n;
			int idx = Math.min(k-n, letters.length);
			sb.append(letters[idx-1]);
			k -= idx;
		}
		
		return sb.reverse().toString();        
    }
}
