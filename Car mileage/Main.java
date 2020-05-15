#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int kmpl, fuel_left, dist_left,reachable;
  cin>>kmpl>>fuel_left>>dist_left;
  reachable = fuel_left * kmpl;
  if( dist_left <= reachable )
    cout<<"Can reach";
  else 
    cout<<"Cannot reach";
  return 0;
}