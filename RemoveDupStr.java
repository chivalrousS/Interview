package huawei;

import java.util.Scanner;

/*
 * [编程题] 字符集合
输入一个字符串，求出该字符串包含的字符集合

输入描述:
每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。

输出描述:
每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。

输入例子:
abcqweracb

输出例子:
abcqwer
 */

public class RemoveDupStr {
	public  String removeDupStr(String input)
	{
		boolean[] arr = new boolean[256];
		for(int i = 0;i < arr.length;++i)
		{
			arr[i] = false;
		}
		
		StringBuffer res = new StringBuffer();
		for(int i = 0; i < input.length();++i)
		{
			if(arr[input.charAt(i)] == false)
			{
				res.append(input.charAt(i));
				arr[input.charAt(i)] = true;
			}
		}
		
		String ans = res.toString();
		return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		RemoveDupStr main = new RemoveDupStr();
		while(in.hasNext())
		{
			String input = in.nextLine();
			String res = main.removeDupStr(input);
			System.out.println(res);
		}
	}

}
