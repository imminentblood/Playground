#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,c3,c,cd,d;
  cin>>d1>>c1>>d2>>c2;
  d = d1 + d2;
  c3 = c1 + c2;
  c = c3 % 100;
  cd = (c3 - c) / 100;
  d += cd;
  cout<<d<<endl<<c;
  return 0;
}