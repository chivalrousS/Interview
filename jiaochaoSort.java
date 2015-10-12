package huawei;
/*
 * 对输入的数组进行交叉排序，偶数位进行升序排列，奇数位进行降序排列.
 */

public class jiaochaoSort {
	public int[] jiaocha(int[] arr)
	{
		int len = arr.length;
		int len1 = 0,len2 = 0;
		if(len % 2 == 0) //原数组长度为偶数
		{
			len1 = len2 = len/2;
		}
		else {
			len1 = len / 2 + 1;
			len2 = len / 2;
		}
		
		int[] oushu = new int[len1];
		int[] jishu = new int[len2];
		int index1 = 0,index2 = 0;
		for(int i = 0; i < len;++i)
		{
			if(i % 2 == 0) //偶数
				oushu[index1++] = arr[i];
			else  //奇数
				jishu[index2++] = arr[i];
		}
		bubbleSort(oushu);
		for(int i : oushu)
			System.out.print(i);
		System.out.println();
		bubbleSort1(jishu);
		for(int j:jishu)
			System.out.print(j);
		System.out.println();
		
		int[] res = new int[len];
		for(int i = 0;i < oushu.length;++i)
		{
			res[2*i] = oushu[i];
		}
		for(int i = 0;i < jishu.length;++i)
		{
			res[2*i + 1] = jishu[i];
		}
		return res;
	}
	
	public void bubbleSort(int[] arr)
	{
		int len = arr.length;
		for(int i = len -1;i > 0;--i)
		{
			boolean flag = false;
			for(int j = 0; j < i;++j)
			{
				if(arr[j] > arr[j+1])
				{
					swap(arr, j, j+1);
					flag = true;
				}
			}
			if(flag == false)
				return;
		}
	}
	
	public void bubbleSort1(int[] arr)
	{
		int len = arr.length;
		for(int i = len -1;i > 0;--i)
		{
			boolean flag = false;
			for(int j = 0; j < i;++j)
			{
				if(arr[j] < arr[j+1])
				{
					swap(arr, j, j+1);
					flag = true;
				}
			}
			if(flag == false)
				return;
		}
	}
	
	public void swap(int[] arr,int low,int high)
	{
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jiaochaoSort test = new jiaochaoSort();
		int[] arr = {4,6,2,3,6,7,8,1};
		int[] res =test.jiaocha(arr);
		for(int i :res)
			System.out.print(i);
	}
}
