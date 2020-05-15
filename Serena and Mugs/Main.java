#include<iostream>
using namespace std;

int printresult(int *a,int n,int s)
{
	int sum = 0;
	for(int i = 0; i < n; i++)
	{
		
		sum += *(a + i);
		if(sum > s)
	    return 0;
		
	}
	return 1;
}

int main()
{
	int n,s,arr[100];
	cin>>n>>s;
	for(int i = 0; i < n; i++)
	{
		cin>>arr[i];
	}
	int res = printresult(arr,n,s);
	if(res == 1)
	cout<<"YES";
	else
	cout<<"NO";
	return 0;
}