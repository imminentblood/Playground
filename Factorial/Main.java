#include<iostream>
using namespace std;

int fact(int n)
{
  if(n == 0)
    return 1;
  else
    return n * fact(n - 1);
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
  return 0;
}