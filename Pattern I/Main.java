#include<iostream>
using namespace std;
int main()
{
	int n,count = 0,stop;
	cin>>n;
	stop = n + 3;
	for(int i = n; i <= stop; i++)
	{
		count++;
		for(int j = 1; j <= count; j++)
		cout<<i;
		cout<<endl;
	}
	for(int i = stop; i >= n; i--)
	{
		for(int j = 1; j <= count; j++)
		{
			cout<<i;
		}
		cout<<endl;
		count--;
	}
	return 0;
}