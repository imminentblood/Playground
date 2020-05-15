#include<iostream>
using namespace std;

//fibonacci number
int fibb(int n)
{
  if(n==0)
    return 0;
  else if(n == 1)
    return 1;
  else
  {
    return fibb(n-1)+fibb(n-2);
  }
}

//main function
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<fibb(n-1);
  return 0;
}