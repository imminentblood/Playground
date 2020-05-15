#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n1,n2,n3,eq;
  cin>>n1>>n2>>n3>>eq;
  int iseq = __gcd(n1,n2);
  iseq = __gcd(iseq,n3);
  if(iseq == eq)
    cout<<"Answer is correct.\n";
  else
    cout<<"Answer is wrong.\n";
  return 0;
}