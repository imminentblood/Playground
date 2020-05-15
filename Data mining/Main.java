#include<iostream>
using namespace std;

bool probable(int num)
{
  int even = 0, odd = 0,rem;
  while(num != 0)
  {
    rem = num % 10;
    if(num % 2 == 0)
      even += rem;
    else
      odd += rem;
    num = num / 10;
  }
  if(odd == even)
    return true;
  return false;
}


int main()
{
  //Type your code here.
  int num;
  cin>>num;
  probable(num) ? cout<<"Yes\n" : cout<<"No\n";
  return 0;
}