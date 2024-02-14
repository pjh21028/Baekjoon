#include <iostream>
using namespace std;

char cArray[5][16];  

int main(){
  for(int i=0; i<5; i++) 
    cin>>cArray[i];
  
  for(int k=0; k<15; k++)  
  {
    for(int i=0; i<5; i++)  
    {
      if(cArray[i][k] != '\0')  
        cout << cArray[i][k];
    }
  }
}