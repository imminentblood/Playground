#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int f_yr, c_yr,pyr,cyr;
  cin>>f_yr>>c_yr;
  if ( f_yr > c_yr )
  {
    pyr = 1900 + f_yr;
    cyr = 2000 + c_yr;
    cout<<cyr-pyr;
  }
  else
  {
    pyr = 2000 + f_yr;
    cyr = 2000 + c_yr;
    cout<<cyr-pyr;
  }
  return 0;
}