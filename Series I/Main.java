#include<bits/stdc++.h>
using namespace std;

int main()
{
	int n,three = 3;
	float sum;
	cin>>n;
	for(int i = 1; i <= n ; i++)
	{
		if(i == 1){
			sum = 5 * 1;
			cout<<(sum / 10.0)<<" ";
		}
		
		else
		{
			sum = 5 * three;
			three = three * 3;
			cout<<sum/10.0<<" ";
		}
	}
	return 0;
}