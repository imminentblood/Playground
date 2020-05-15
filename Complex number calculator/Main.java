#include<iostream>
#include<math.h>
using namespace std;
struct st
{
	int n1;
    int n2;
}s1,s2;
int main()
{
  int option,a,b;;
  cin>>option;
  cin>>s1.n1>>s1.n2>>s2.n1>>s2.n2;
  switch(option)
  {
    case 1:
      a = s1.n1 + s2.n1;
      b = s1.n2 + s2.n2;
      if(b<0)
        cout<<a<<b<<"i";
      else
      cout<<a<<"+"<<b<<"i";
      break;
    case 2:
      
      a = s1.n1 - s2.n1;
      b = s1.n2 - s2.n2;
      if(b<0)
        cout<<a<<b<<"i";
      else
      cout<<a<<"+"<<b<<"i";
      break;
    case 3:
      a = (s1.n1 * s2.n1) + (-(s1.n2 * s2.n2));
      b = (s1.n1 * s2.n2) + (s1.n2 * s2.n1);
      if(b < 0)
      cout<<a<<b<<"i";
      else 
        cout<<a<<"+"<<b<<"i";
      break;
    default:
      cout<<"Invalid choice";
  }
  return 0;
}