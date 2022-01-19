package Longest;

 class LIS {
	static int max;
	static int _lis (int arr[],int n) {
		if(n==1)
			return 1;
		int res , end=1;
		for(int i=1;i<n;i++) {
			res=_lis(arr ,i);
			if(arr[i-1]<arr[n-1]&& res+1>end)
				end=res+1;
		}
		if(max<end)
			max=end;
		return end;
	}
	static int _lis1(int arr[],int n) {
		max=1;
		_lis(arr ,n);
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {10,22,9,33,21,50,41,60};
		int n=arr.length;
		System.out.println("longest increasing subsequence="+_lis(arr ,n));
		}
 }
		
