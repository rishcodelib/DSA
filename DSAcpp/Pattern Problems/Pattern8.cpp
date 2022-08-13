#include <iostream>
using namespace std;
// Pattern Right Angle Triangle
// A B C
// B C D
// C D E

int main()
{
  int n = 3; // taking input from user

  int i = 1; // row

  while (i <= n)
  {
    int j = 1; // Column

    while (j <= n)
    {
      char ch = 'A' + i + j -2 ;
      cout << ch; // PRINT i

      j++;
    }
    cout << endl;
    i++;
  }
}