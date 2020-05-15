#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float amt[3],d[3],s[3],d_amt[3],t[3];
  for(int i = 0; i < 3; i++)
    cin>>amt[i]>>d[i]>>s[i];
  for(int i = 0; i < 3; i++)
  {
    d_amt[i] = amt[i] - (amt[i] * ( d[i] / 100) );
    t[i] = d_amt[i] + s[i];
  }
  cout<<"In Flipkart Rs."<<t[0]<<endl;
  cout<<"In Snapdeal Rs."<<t[1]<<endl;
  cout<<"In Amazon Rs."<<t[2]<<endl;
  if(t[0] <= t[1] && t[0] <= t[2])
    cout<<"He will prefer Flipkart";
  else if(t[1] < t[0] && t[1] < t[2])
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
  return 0;
}