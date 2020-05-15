#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n,male=0,female=0;
  cin>>n;
  int *a = (int *)malloc(n * sizeof(int));
  for(int i = 0; i < n; i++)
  {
    cin>>*(a + i);
  }
  for(int i = 0; i < n; i++)
  {
    if(*(a+i) % 2 != 0)
      male++;
    else
      female++;
  }
  cout<<male<<endl<<female;
  return 0;
}