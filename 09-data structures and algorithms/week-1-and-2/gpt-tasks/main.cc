#include <iostream>
using std::cout;
using std::endl;
using std::cin;

void swap(int& a, int& b) {
    int temp = a;
    a = b;
    b = temp;
}

int main() {
    int a = 1;
    int b = 2;

    cout << "Enter a number: " << endl; 
    cin >> a;

    cout << "Enter a number: " << endl; 
    cin >> b;

    cout << a << ", " << b << endl;

    swap(a, b);

    cout << a << ", " << b << endl;

    return 0;
}
