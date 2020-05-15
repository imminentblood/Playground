#include<iostream>
using namespace std;

int p(int n,int e)
{
  if(e == 0)
    return 1;
  else if(e == 1)
    return n;
  else
    return n * p(n,e - 1);
}

int main()
{
  //Type your code here.
  int n,e;
  cin>>n>>e;
  cout<<"Enter the value of a\n";
  cout<<"Enter the value of n\n";
  cout<<"The value of "<<n<<" power "<<e<<" is "<<p(n,e);
  return 0;
}