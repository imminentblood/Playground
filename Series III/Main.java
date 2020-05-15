#include<iostream>
using namespace std;
int main()
{
	int num;
	cin>>num;
	int temp = 6;
	for(int i = 0; i < num; i++)
	{
		if(i==0)
		cout<<temp<<" ";
		else
		{
			temp += (5*i);
			cout<<temp<<" ";
		}
	}
	return 0;
}