#include<iostream>
using namespace std;

int fun(int n, int *a)
{
	/*int flag = 3;
	for(int i = 0; i < n; i++)
	{
		flag = 1;
		if(a[i] % 2 == 0);
		else
		{
			flag = 3;
			break;
		}
	}
	
	for(int i = 0; i < n; i++)
	{
		flag = 2;
		if(flag == 1)
		break;
		else if(a[i] % 2 != 0)
		
	}*/
	int ocount = 0, ecount=0;
	for(int i = 0; i < n; i++)
	{
		if(a[i] % 2 == 0)
		ecount++;
		else 
		ocount++;
	}
	if(n == ecount)
	return 1;
	else if(n == ocount)
	return 2;
	else
	return 3;
}


int main()
{
	int n,arr[20];
	cin>>n;
	for(int i = 0; i < n; i++)
	cin>>arr[i];
	int num = fun(n,arr);
	cout<<"Enter the number of elements in the array\n";
	cout<<"Enter the elements in the array\n";
	if(num == 1)
	cout<<"The array is Even\n";
	else if(num == 2)
	cout<<"The array is Odd\n";
	else
	cout<<"The array is Mixed\n";
	return 0;
}