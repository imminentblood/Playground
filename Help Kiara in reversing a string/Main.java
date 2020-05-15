#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end=0, i;    
//Your code goes here    
cin.getline(str,100);
while(str[count] != '\0')
count++;

count--;
for(int i = count; i >=0; i--)
  {
  	rev[end] = str[i];
  	end++;
  }
std::cout<<rev;
}