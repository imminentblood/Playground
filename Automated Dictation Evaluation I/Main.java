#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char s1[100],s2[100];
  cin>>s1;
  cin>>s2;
  int correct = strcmp(s1,s2);
  if(correct == 0)
    cout<<"It is correct\n";
  else
    cout<<"It is wrong\n";
  return 0;
}