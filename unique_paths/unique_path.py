class Solution:
	def uniquePaths(self, m: int, n: int) -> int:
		if n == 1 or m == 1:
			return 1
		fields = []
		for i in range(n*m): 
			if i < n + 1 or i % n == 0:
				fields.append(1)
			else:
				newElem = fields[i - 1] + fields[i - n]
				fields.append(newElem)
		return fields.pop()			
