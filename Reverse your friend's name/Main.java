#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
  string str;
  getline(cin,str);
  string ::reverse_iterator i;
  for(i = str.rbegin(); i < str.rend(); i++)
    cout<<*i;
  return 0;
}