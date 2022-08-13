// * * * *
// * * * *  // Row = 4
// * * * *  // Col = 4
// * * * *

#include <iostream>

using namespace std;
int main(){
  int n =3;

  // cin >> n;
  int i = 1;

  while (i <= n)
  {
    int j = 1;
    while (j <= n)
    {
      cout << " * ";
      j = j + 1;
    }
    cout << endl;
    i = i + 1;
  }

}