#include<bits/stdc++.h>

using namespace std;

bool isKaprekar(int n)
{	
	int sq = n * n;
	int dig = floor(log10(sq))+1;
	
	for(int i = 1; i < dig; i++)
	{
		int eq = pow(10,i);
		if(eq == n)
		continue;
		int sum = sq / eq + sq % eq;
		if(sum == n)
		return true;
	}
	return false;
}
int main()
{
	int num;
	cin>>num;
	if(isKaprekar(num))
	cout<<"Kaprekar Number\n";
	else
	cout<<"Not a Kaprekar Number\n";
}