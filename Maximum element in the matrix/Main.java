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

void print_max(int arr[][10],int m,int n)
{
	int max = 0;
	for(int i = 0; i < m; i++)
	{
		for(int j = 0; j < n; j++)
		{
			if(max < arr[i][j])
			max = arr[i][j];
		}
	}
	cout<<"The maximum element is "<<max<<endl;
}


int main()
{
	int m, n, arr[10][10];
	cin>>m>>n;
	inputArray(arr,m,n);
	print_max(arr,m,n);
	return 0;
}