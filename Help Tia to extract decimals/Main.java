#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	std::string fnum;
	//Type your code here
  getline(cin,fnum);
  int index = fnum.find(".");
  string :: iterator i;
  cout<<"Floating part is : ";
  if(index != string::npos)
  for(i = fnum.begin()+index+1; i < fnum.end(); i++)
    cout<<*i;
  return 0;
}