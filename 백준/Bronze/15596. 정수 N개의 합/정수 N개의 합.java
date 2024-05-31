class Test {
    long sum(int[] a) {
		long lSum = 0;        
		for(int i = 0; i < a.length; i++) {
			lSum += a[i];
		}
		return lSum;
	}
}