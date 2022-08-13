#include <iostream>
using namespace std;
// Pattern Right Angle Triangle
// * 
// * * *
// * * * *

int main()
{
  int n = 4; // taking input from user

  int i = 1; //row
  
  while (i <= n) 
  {
    int j = 1; // Column
    while (j <= i)
    {
      cout << "*"; // PRINT i
  
      j++;
    }
    cout << endl;
    i++;
  }
}