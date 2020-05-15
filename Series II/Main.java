#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n,num = 11;
	cin>>n;
	for(int i = 1; i <= n; i++)
	{
		if(i == 1)
		{
			cout<<num * num<<" ";
		}
		else
		{
			num += 4;
			cout<<num * num<<" ";
		}
	}
	return 0;
}