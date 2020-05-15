#include<iostream>
using namespace std;
void inArray(int arr[][5],int n)
{
	for(int i = 0; i < n; i++)
  	{
  		for(int j = 0; j < n; j++)
  		{
  			cin>>arr[i][j];
		}
    }
}
/*void outArray(int a[][5],int n)
{
	  for(int i = 0; i < n; i++)
  {
  	for(int j = 0; j < n; j++)
  	{
  		cout<< a[i][j]<<" ";
	  }
	  cout<<endl;
  }
}*/

int main()
{
  //Type your code here.
  int n,arr[5][5]={0},mad=0,mid=0;
  cin>>n;
  inArray(arr,n);
  int m = n;
  for(int i = 0; i < n; i++)
  {
  	mad += arr[i][i];
  	mid += arr[i][m-i-1];
  }
  //outArray(arr,n); 
  if(mad == mid)
  {
  	cout<<"Yes\n";
  }
  else 
  cout<<"No\n";
}