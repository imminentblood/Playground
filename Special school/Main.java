#include<bits/stdc++.h>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  string real,given;
  getline(cin,real);
  getline(cin,given);
  reverse(given.begin(),given.end());
  if( given == real)
    cout<<"It is correct\n";
  else
    cout<<"It is wrong\n";
  return 0;
}