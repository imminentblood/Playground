#include<iostream>
using namespace std;
void stockSpan(int n,int* a)
{
	int c=0;
	cout<<1<<endl;
	for(int i = 0; i < n-1; i++)
	{
		if(a[i]<a[i+1])
		{
		    c = c+2;
		    cout<<c<<endl;
		}
		else
		{
		    cout<<1<<endl;
		}
	}
	
}

int main()
{
	int n,arr[1000];
	cin>>n;
	for(int i = 0; i < n; i++)
	{
		cin>>arr[i];
	}
	stockSpan(n,arr);
	return 0;
}

/*#include<iostream>
using namespace std;
void stockSpan(int n,int* a)
{
	int count,sp[1000];
	sp[0] = 1;
	for(int i = 1; i < n; i++)
	{
		count = 1;
		for(int j = i-1; j >=0 ; j--)
		{
			if(*(a+i) >= *(a+j))
			count++;
			else if(*(a+i) < *(a+j))
			break;
		}
		sp[i] = count;
	}
	for(int i = 0; i < n; i++)
	{
		cout<<sp[i]<<endl;
	}
	
}

int main()
{
	int n,arr[1000];
	cin>>n;
	for(int i = 0; i < n; i++)
	{
		cin>>arr[i];
	}
	stockSpan(n,arr);
	return 0;
}*/