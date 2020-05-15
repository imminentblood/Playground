#include<iostream>
using namespace std;
int main()
{
  int a,b,z;
  cin>>a>>b>>z;
  if((z%b==0)||z<=b||(z-1)%b==0)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}








/*#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row,col,c,t1,t;
  cin>>row>>col>>c;
   t=row*col;
 t1=t-col;
 if(c<=t1 ){cout<<"Yes";}
else{cout<<"No";}
}*/
/*
  for(int i = 1;i <= row; i++)
  {
    lt = 4 * ( i - 1 ) + i;
    rt = row * i;
    if( tn == lt || tn == rt )
      cout<<"Yes";
  }
}*/