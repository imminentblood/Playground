#include<iostream>
using namespace std;
void print(int n)
{
	if(n % 2 == 0)
	cout<<"Mani Iyer";
	else
	cout<<"Arun Gupta";
}

int main()
{
	int n,m;
	cin>>n>>m;
	if(n>m)
	print(m);
	else
	print(n);
	return 0;
}