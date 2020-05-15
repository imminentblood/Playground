#include <cstring>
#include <iostream>
int main()
{
   //Your code goes here
   char str[100];
  int count = 1;
  std::cin.getline(str,100);
  for(int i = 0; str[i] != '\0'; i++)
    if(str[i] == ' ')
      count++;
  if(count < 11)
    std::cout<<"Caption eligible for the contest\n";
  else
    std::cout<<"Caption not eligible for the contest\n";
  return 0;
}