#include<iostream>
using namespace std;

typedef struct College
{
  char name[32];
  char city[43];
  int establishmentYear;
  float passPercentage;
}col;

col set(col c,int i)
{
  cin.getline(c.name,32);
  cin.getline(c.city,43);
  cin>>c.establishmentYear;
  cin>>c.passPercentage;
  cin.ignore();
  return c;
}
void get(col c,int i)
{
  cout<<"College:"<<i<<endl;
  cout<<"Name:"<<c.name<<endl;
  cout<<"City:"<<c.city<<endl;
  cout<<"Year of establishment:"<<c.establishmentYear<<endl;
  cout<<"Pass percentage:"<<c.passPercentage<<endl;
}

int main()
{
  //Type your code here.
  col c[10],c1;
  int t,i;
  cin>>t;
  cin.ignore();
  for(i = 0; i < t; i++)
  {
  	c[i] = set(c1,i+1);
  }

  cout<<"Enter the number of colleges\n";

  for(i = 0; i < t; i++)
  {
  	  cout<<"Enter the details of college "<<i+1<<endl;
      cout<<"Enter name\n";
  	  cout<<"Enter city\n";
  	  cout<<"Enter year of establishment\n";
  	  cout<<"Enter pass percentage\n";
  }
  cout<<"Details of colleges\n";
  for(i = 0; i < t; i++)
  get(c[i],i+1);
  return 0;
}