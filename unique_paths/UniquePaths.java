package leet;

import java.util.ArrayList;
import java.util.List;

public class UniquePaths {

	class Solution {
		
		public int uniquePaths(int m, int n) {

			if (n == 1 || m == 1)
				return 1;

			List<Integer> fields = new ArrayList<>();

			int actIdx = 0;
			
			for (int j = 0; j < n + 1; ++j) {
				fields.add(1);
				++actIdx;
			}

			while (actIdx < m * n ) {
				if (actIdx % n == 0) {
					fields.add(1);
					++actIdx;
				}
				int newElem = fields.get(actIdx - 1) + fields.get(actIdx - n);
				fields.add(newElem);
				++actIdx;
			}

			return fields.get(fields.size()-1);

		}

}
