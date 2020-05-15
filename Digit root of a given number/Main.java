#include<iostream>
using namespace std;
int sum;
int dr(int n)
{
	if(n <= 9)
	return n;
	else
	sum = (n%10)+dr(n/10);
	n = sum;
	if(n > 9)
	{
		n = (n%10) + dr(n/10);
	}
	else
	return sum;
}


int main()
{
	int n;
	cin>>n;
	cout<<dr(n);
	return 0;
}