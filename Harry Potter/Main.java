#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,rem1,rem2,i = 3;
  cin>>num;
  rem1 = num % 1000;
  while(i--)
  {
    num = num / 10;
  }
  if( ( rem1 == 1) && ( num == 1))
    cout<<2<<endl;
  else
    cout<<1;
}