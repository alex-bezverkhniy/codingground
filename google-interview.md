Please use this Google doc to code during your interview. To free your hands for coding, we recommend that you use a headset or a phone with speaker option.


1. Given an array, find pairs from values in the array that add up to a value M.


Example:
[1,2,3,4]
M = 5


Pairs:
(1,4)  // (4, 1)
(2,3)


new Pair(1, 4);


---------

```java
findPairs({1,2,3,4}, 5);


List<Pair> findPairs(int[] input, int target) {
	List<Pair> result = new ArrayList();
	for (int i = 0, j = input.length -1; i <= j; i++, j--) {
		int s = input[i] +  input[j];
Pair p =new Pair(input[i],  input[j]);
		if (s == target && !result.contains(p)) {
			result.add(p);
		}
}
return result;
}
```



------


2. Given a collection of numbers, how would you find the longest sequence of consecutive numbers?


Example 1:
{1,3,4,5,7}
Longest Sequence: {3,4,5}


Example 2:
{1,3,4,5,7,8,9,10}
Longest Sequence: {7,8,9,10}


-------



```java
int[] findSeq(int input) {
Map<List> result = new HashMap();
	List<Integer>subresult = ArrayList();
	int maxKey = -1;
	for(int i = 0; i < input.length-1; i++) {

		if ((i + 1) < input.length-1 && input[i+1]  == (++input[i] ) ) {
			subresult.add(input[i]);
} else {
	if (subresult.size() > maxKey) {
		maxKey = subresult.size();
}


	resutl.put(subresult.size(), subresult);
	subresult = new ArrayList();
}
}


	// get max key


	return result.get(maxKey).toArray();
}

```


























[4,5,6,7,1,2,3]

index = 4


-------
```

int findStartIndex(int[] input ) {
	int min = Integer.MAX_VALUE;
	int indexOfMin = 0;
	for (int i = 0; i < input.length - 1; i ++) {
		if(input[i] < min) {
			min = input[i]
			indexOfMin = i;
}
	}

// get index of min
/*
	for (int i = 0; i < input.length - 1; i ++) {
		if (input[i] == min ) {
			return i
}
}
*/


return indexOfMin;
}
```
