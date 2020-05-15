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
void printRow_Or_Col(int ar[],int m)
{
	
	for(int i = 0; i < m; i++)
	cout<<ar[i]<<" ";
	cout<<endl;
}
int printMax(int ar[],int m)
{
	int max = 0,index;
	for(int i = 0; i < m; i++)
	{
		if(ar[i] > max)
		{
			index = i;
			max = ar[i];	
		}
	}
	return index+1;
}
void maxRow(int arr[][10],int m,int n)
{
	int max,ar[m];
	for(int i = 0; i < m; i++)
	{
		max = 0;
		for(int j = 0; j < n; j++)
		{
			max += arr[i][j];
		}
		ar[i] = max;
	}
	cout<<"Sum of rows is ";
	printRow_Or_Col(ar,m);
	int index = printMax(ar,m);
	cout<<"Row "<<index<<" has maximum sum\n";
}

void maxCol(int arr[][10],int m,int n)
{
	int max,ar[n];
	for(int i = 0; i < n; i++)
	{
		max = 0;
		for(int j = 0; j < m; j++)
		{
			max += arr[j][i];
		}
		ar[i] = max;
	}
	cout<<"Sum of columns is ";
	printRow_Or_Col(ar,n);
	int index = printMax(ar,n);
	cout<<"Column "<<index<<" has maximum sum\n";
}



int main()
{
	int m,n,arr[10][10];
	cin>>m>>n;
	inputArray(arr,m,n);
	maxRow(arr,m,n);
	maxCol(arr,m,n);
	return 0;
}