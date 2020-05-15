#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int max,na,nc,ttl;
  cin>>max>>na>>nc;
  ttl = (na * 75) + (nc * 30);
  if( ttl <= max ) 
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  return 0;
}