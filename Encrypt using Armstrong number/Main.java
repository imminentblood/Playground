#include<bits/stdc++.h>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int nod = floor(log10(n))+1,rem,sum=0,m=n;
  while(n != 0)
  {
    rem = n % 10;
    sum += power(rem,nod);
    n = n / 10;
  }
  return (sum == m);
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}