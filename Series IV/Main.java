#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int num,val=0;
	cin>>num;
	for(int i = 1; i <= num; i++)
	{
		if(i % 2 == 0)
		{
			val = pow(i,2) - 2;
			cout<<val<<" ";
		}
		else 
		{
			val = pow(i,2) - 1;
			cout<<val<<" ";
		}
	}
	return 0;
}