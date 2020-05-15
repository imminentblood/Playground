#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int uc;
  cin>>uc;
  if( uc <= 200 )
    cout<<"Rs."<<int(( 0.5 * uc ));
  else if( uc <= 400 )
    cout<<"Rs."<<int(( 0.65 * uc ) + 100);
  else if( uc <= 600 )
    cout<<"Rs."<<int(( 0.80 * uc ) + 200);
  else if( uc > 600 )
    cout<<"Rs."<<int(( 1.25 * uc ) + 425);
  return 0;
}