#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,x,y,U_cost,C_cost,R_cost;
  cin>>w>>x>>y;
  U_cost = w * x;
  C_cost = w * y;
  R_cost = U_cost - C_cost - 100;
  cout<<R_cost<<endl;
  return 0;
}