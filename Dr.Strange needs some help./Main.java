#include<bits/stdc++.h>
using namespace std;
int exponent(int m,int n)
{
  return (pow(m,n));
}

int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int exp = exponent(m,n);
  if( exp >= req )
    cout<<"Doctor, you can proceed with your experiment.\n";
  else
    cout<<"Sorry Doctor! You need more bacteria.\n";
  return 0;
}