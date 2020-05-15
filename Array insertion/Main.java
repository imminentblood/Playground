#include<iostream>
using namespace std;

/*int *shift(int *a,int n, int p, int v)
{
	for(int i = n; i >= p; i--)
	{
		*(a+i) = *(a+i-1);
	}
	*(a+p-1) = v;
	return a;
}*/

int main()
{
	int n,arr[100],pos,val,flag=1;
	cin>>n;
	for(int i = 0; i < n; i++)
	cin>>arr[i];
	cin>>pos;
	if(pos > n)
	flag = 0;
	else
	{
		cin>>val;
		//shift(arr,n,pos,val);
		for(int i = n; i >= pos; i--)
		{
		arr[i] = arr[i-1];
		}
		arr[pos-1] = val;
	}
	
	cout<<"Enter the number of elements in the array\n";
	cout<<"Enter the elements in the array\n";
	cout<<"Enter the location where you wish to insert an element\n";

	if(flag == 1)
	{
		cout<<"Enter the value to insert\n";
		cout<<"Array after insertion is\n";
		for(int i = 0; i <= n; i++)
		cout<<arr[i]<<endl;
	}
	else 
	cout<<"Invalid Input";
	return 0;
}