#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int num,rem,n=0;
  cin>>num;
  while(num)
  {
    rem = num % 10;
    n = n *10 + rem;
    num = num / 10;
  }
  cout<<n;
    return 0;
}