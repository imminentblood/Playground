/*#include<iostream>
using namespace std;

void inputArray(int a[][10],int m, int n)
{
	for(int i = 0; i < m; i++)
	{
		for(int j = 0; j < n; j++)
		cin>>a[i][j];
	}
}

void zig_zag(int a[][10],int m,int n)
{
	int sum = 0;
	if(m==1 && n==1)
	sum += a[0][0];
	else{
	for(int i = 0; i <= 0; i++)
	{
		for(int j = 0; j < n - 1; j++)
		sum += a[i][j];
	}
	for(int i = m-1; i <= m-1; i++)
	{
		for(int j = 1; j <= n-1; j++)
		sum += a[i][j];
	}
	for(int i = 0; i < m; i++)
	{
		sum += a[i][m-i-1];
		
	}
}
	cout<<"Sum of Zig-Zag pattern is "<<sum;
}

int main()
{
	int m,n,arr[10][10];
	cin>>m>>n;
	inputArray(arr,m,n);
	zig_zag(arr,m,n);
	return 0;
}*/







#include<iostream>
#include<cstdlib>
using namespace std;

//void inputArray(int a[][10],int m, int n)
void inputArray(int m, int n,int** a)
{
	
	for(int i = 0; i < m; i++)
	{
		for(int j = 0; j < n; j++)
		cin>>a[i][j];
	}
}

//void zig_zag(int a[][10],int m,int n)
void zig_zag(int m,int n,int** a)
{
	int sum = 0;
	if(m==1 && n==1)
	sum += a[0][0];
	else{
	for(int i = 0; i <= 0; i++)
	{
		for(int j = 0; j < n - 1; j++)
		sum += a[i][j];
	}
	for(int i = m-1; i <= m-1; i++)
	{
		for(int j = 1; j <= n-1; j++)
		sum += a[i][j];
	}
	for(int i = 0; i < m; i++)
	{
		sum += a[i][m-i-1];
	}
}
	cout<<"Sum of Zig-Zag pattern is "<<sum;
}

int main()
{
	int m,n;//,arr[10][10];
	cin>>m>>n;
	int **arr = (int**)malloc(m*sizeof(int*));
	for(int i = 0; i < m; i++)
	arr[i] = (int *)malloc(n*sizeof(int));
	inputArray(m,n,arr);
	zig_zag(m,n,arr);
	return 0;
}