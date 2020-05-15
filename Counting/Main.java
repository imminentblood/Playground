#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  string s,sec;
  getline(cin,s);
  int vowel=0,consonant=0,ws=0,dig=0,sym=0;
  for(int i = 0; i < s.size(); i++)
  {
      
      char ch = s[i];
      if( ch >='a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
      {
          ch = tolower(ch);
          if( ch == 'a' || ch== 'e' || ch=='i' || ch=='o' || 
          ch== 'u')
          vowel++;
          else
          consonant++;
      }
      else if(ch >= '0' && ch <= '9')
      dig++;
      else if(ch==' ')
      ws++;
      else
      sym++;
  }
  cout<<"Vowels:"<<vowel<<endl;
  cout<<"Consonants:"<<consonant<<endl;
  cout<<"White Spaces:"<<ws<<endl;
  cout<<"Digits:"<<dig<<endl;
  cout<<"Symbols:"<<sym<<endl;
  return 0;
}