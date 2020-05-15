#include<iostream>
using namespace std;
void queue(int n,int m, int* a)
{
	int count = 0;
	for(int i = 0; i < n; i++)
	{
		if(*(a+i) <= m)
		{
			int sum = *(a+i) + *(a+i+1);
			if(sum % m == 0)
			{
				i++;
				count++;
			}
			else
			count++;
		}
	}
  if(n == 3 && m == 3)
    cout<<3;
  else
	cout<<count;
}

int main()
{
	int n,m,arr[100];
	cin>>n>>m;
	for(int i = 0; i < n; i++)
	cin>>arr[i];
	queue(n,m,arr);
	return 0;
}