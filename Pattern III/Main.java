#include<iostream>
using namespace std;
int main()
{
	int n,k=0;
	cin>>n;
	for(int i = 1; i <= n; i++)
	{
		k++;
		for(int j = 1; j < i; j++)
		{
			cout<<k<<"*";
		}
		cout<<k<<endl;
	}
	for(int i = n; i >= 1; i--)
	{
		for(int j = 1; j < i; j++)
		{
			cout<<k<<"*";
		}
		cout<<k--<<endl;
		
		
	}
	return 0;
}