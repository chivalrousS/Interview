#include <iostream>
using namespace std;
/*
[�����] ɾ��
��һ������a[N]˳����0-N��Ҫ��û��������ɾ��һ��������ĩβʱѭ������ͷ�������У������һ����ɾ��������ԭʼ�±�λ�á���8����(N=7)Ϊ��:��0��1��2��3��4��5��6��7����0->1->2(ɾ��)->3->4->5(ɾ��)->6->7->0(ɾ��),���ѭ��ֱ�����һ������ɾ����

��������:
ÿ������Ϊһ��һ������n(С�ڵ���1000)��Ϊ�����Ա��,��100�����a[999]���м��㡣

�������:
һ��������һ����ɾ��������ԭʼ�±�λ�á�

��������:
8

�������:
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

