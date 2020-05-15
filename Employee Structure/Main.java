#include<iostream>
using namespace std;

typedef struct employee
{
  char name[32];
  int id;
  int age;
  char designation[43];
  float salary;
}emp;

emp set(emp e)
{
  cin.getline(e.name,32);
  cin>>e.id;
  cin>>e.age;
  cin.ignore();
  cin.getline(e.designation,43);
  cin>>e.salary;
  return e;
}
void get(emp e)
{
  cout<<"Enter name:\n";
  cout<<"Enter ID:\n";
  cout<<"Enter age:\n";
  cout<<"Enter designation:\n";
  cout<<"Enter Salary:\n";
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<e.name<<endl;
  cout<<"ID of the Employee : "<<e.id<<endl;
  cout<<"Age of the Employee : "<<e.age<<endl;
  cout<<"Designation of the Employee : "<<e.designation<<endl;
  cout<<"Salary of the Employee : "<<e.salary<<endl;
}

int main()
{
  //Type your code here.
  emp e;
  e = set(e);
  get(e);
  return 0;
}