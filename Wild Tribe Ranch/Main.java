#include<iostream>
using namespace std;
int main()
{
  int max,wt;
  cin>>max>>wt;
  if( wt < max )
    cout<<"Yes, you can enter.\n";
  else if( wt == max )
    cout<<"Yes, you can enter. Kindly use a rope.\n";
  else
    cout<<"Sorry, you can't enter\n";
  return 0;
}