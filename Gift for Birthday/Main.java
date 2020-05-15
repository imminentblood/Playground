#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int yr;
  cin>>yr;
  if( yr % 4 == 0 )
 	cout<<yr<<" is a leap year";
  else if( yr % 400 == 0 )
    cout<<yr<<" is a leap year";
  else if(yr % 100 != 0 )
    cout<<yr<<" is not a leap year";
  else 
    cout<<yr<<" is not a leap year";
  return 0;
}