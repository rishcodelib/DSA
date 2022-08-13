#include <iostream>

using namespace std;
// Pattern
// 1 1 1
// 2 2 2
// 3 3 3

int main()
{
  int n = 3; // number of rows

  int i = 1; // initialising
  while (i <= n) // for ROW
  {
    int j = 1 ;
    while (j <= n) // FOR COLUMN 
    {
      cout << j; // PRINT j
      j++;
    }
    cout << endl;
    i++;
  }
}