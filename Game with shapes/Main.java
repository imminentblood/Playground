#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,x;
  cin>>r>>x;
  //if( ( 3.14*r*r ) < (x*x) )
  if( r <= (x/2) )
    cout<<"circle can be inside a square";
  else 
    cout<<"circle cannot be inside a square";
  return 0;
}