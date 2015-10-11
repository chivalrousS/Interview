#include <iostream>
using namespace std;
/*
[编程题] 删数
有一个数组a[N]顺序存放0-N，要求没隔两个数删掉一个数，到末尾时循环至开头继续进行，求最后一个被删掉的数的原始下标位置。以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。

输入描述:
每组数据为一行一个整数n(小于等于1000)，为数组成员数,如100，则对a[999]进行计算。

输出描述:
一行输出最后一个被删掉的数的原始下标位置。

输入例子:
8

输出例子:
6
*/

struct Node
{
    int value;
    bool isDeleted;
};

int deleteNum(int n)
{
    Node a[n];
    int i;
    for (i = 0; i < n; ++i)
    {
        a[i].value = i;
        a[i].isDeleted = false;

    }
    int cur = 0,count,num = n;
    while (num != 1)
    {
        count = 0;
        while (count != 2)
        {
            cur = (cur+1)%n;
            if (a[cur].isDeleted == false)
            {
                count++;
            }
        }
        a[cur].isDeleted = true;
        while (a[cur].isDeleted != false)
        {
            cur = (cur+1)%n;
        }
        --num;
    }
    return cur;
}

int main()
{
    int n;
    while(cin >> n)
    {
        cout << deleteNum(n)<<endl;
    }
    return 0;
}

