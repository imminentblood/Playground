#include<iostream>
using namespace std;

void inputArray(int a[][10],int m, int n)
{
	for(int i = 0; i < m; i++)
	{
		for(int j = 0; j < n; j++)
		{
			cin>>a[i][j];
		}
	}
}

void printCol_max(int arr[][10],int m,int n)
{
	int max,ar[10];
	for(int i = 0; i < n; i++)
	{
		max = 0;
		for(int j = 0; j < m; j++)
		{
			if(max < arr[j][i])
			max = arr[j][i];
		}
		ar[i] = max;
	}
	for(int i = 0; i < n; i++)
	cout<<ar[i]<<endl;
}


int main()
{
	int m, n, arr[10][10];
	cin>>m>>n;
	inputArray(arr,m,n);
	printCol_max(arr,m,n);
	return 0;
}