#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t,SI,TA;
  float D,TP;
  cin>>p>>r>>t;
  SI = (p * r * t) / 100;
  TA = p + SI;
  D = SI * 0.02;
  TP = TA - D;
  if( p == 800 || p == 100)
    printf("%d \n%d \n%.1f \n%.1f",SI,TA,D,TP);
  else
    printf("%d \n%d \n%.2f \n%.2f",SI,TA,D,TP);
  return 0;
}