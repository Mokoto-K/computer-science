#include <iostream>

// 'interface'
class Vec {

public: 
    Vec();
    Vec(int);
private:
    int array_limit_;
    double* pointer_to_data_;
};


// Class implementation
Vec::Vec()
    : array_limit_(0), pointer_to_data_(0) {}

Vec::Vec(int a) {
    pointer_to_data_ = new double[a];

    for (int i = 0; i != array_limit_; i++)
        pointer_to_data_[i] = 0.0;
}


// main
int main() {
    int lengthOfArray = 5;
    Vec v(lengthOfArray);

    return 0;
}
