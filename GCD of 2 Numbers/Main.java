#include<bits/stdc++.h>
using namespace std;
int gcd(int a,int b)
{
  if(a == 0)
    return b;
  else
    return gcd(b % a, a);
}

int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
  return 0;
}