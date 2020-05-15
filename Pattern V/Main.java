#include<iostream>
using namespace std;

void pattern(int n)
{
	int k = 0, sm = n, lg = n * (n + 1), run = 2,count = n,temp = n;
	for(int i = 1; i <= n; i++)
	{
		
		for(int j = 1; j <= sm; j++)
		{
			k++;
			cout<<k<<"*";
		}
		sm--;
		int p = lg - sm;
		for(int a = 1; a <= sm; a++)
		{
			cout<<p<<"*";
			p++;
		}
		cout<<p<<endl;
		lg = lg - sm - 1;
		temp--;
		for(int z = 1; z <= i + i ; z++)
		{
			
			if(temp == 0)
			break;
			else
			{
				cout<<"-";
				
			}
			
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