#include<iostream>
#include<cstdlib>
using namespace std;

int **createArray(int **a,int m)
{
	for(int i = 0; i < m; i++)
	{
		for(int j = 0; j < m; j++)
		cin>>a[i][j];
	}
	return a;
}

void getElement(int **a, int m, int n)
{
	for(int i = 0; i < m; i++)
	{
		for(int j = 0; j < m; j++)
		cout<<a[i][j]<<" ";
		cout<<endl;
	}
	
}

void addMatrix(int **a1, int **a2,int m,int n)
{
	for(int i = 0; i < m; i++)
	{
		for(int j = 0; j < n; j++)
		{
			a1[i][j] = a1[i][j] + a2[i][j];
		}
	}
}

int main()
{
	int m,n;
	cin>>m>>n;
	int **arr1 = (int **)malloc(m * sizeof(int *));
	for(int i = 0; i < m; i++)
	arr1[i] = (int *)malloc(n * sizeof(int));
	int **arr2 = (int **)malloc(m * sizeof(int *));
	for(int i = 0; i < m; i++)
	arr2[i] = (int *)malloc(n * sizeof(int));
	arr1 = createArray(arr1,m);
	arr2 = createArray(arr2,m);
	addMatrix(arr1,arr2,m,n);
    getElement(arr1,m,n);
	return 0;
}