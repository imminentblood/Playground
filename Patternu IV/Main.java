#include<iostream>
using namespace std;

void pattern(int n)
{
	int j,k=0;
	for(int i = 1; i <= n; i++)
	{
		if(i % 2 != 0)
		{
			k++;
			for(j = 1; j < n; j++)
			{
				cout<<k;
			}
			k++;
			cout<<k<<endl;
			k++;
		}
		else
		{
			cout<<k--;
			for(j = 1; j < n; j++)
			{
				cout<<k;
			}
			cout<<endl;
		}
	}
	
}

int main()
{
	int n;
	cin>>n;
	pattern(n);
	return 0;
}