#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  string s,sec;
  getline(cin,s);
  for(int i = 0; i < s.size(); i++)
  {
    if( s[i]<'A' || s[i] >'Z' && s[i]<'a' || s[i]>'z' )
    {
      s.erase(i,1);
      i--;
    }
  }
  
       cout<<s;
}