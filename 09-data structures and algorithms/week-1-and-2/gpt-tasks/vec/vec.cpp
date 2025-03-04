#include "vec.h"
#include <iostream>

Vec::Vec() : array_limit(0), pointer_to_data(nullptr) {}

Vec::Vec(int a) : array_limit(a), pointer_to_data(new double[a]) {
    for (int i = 0; i < arracy_limit; ++i)
        pointer_to_data[i] = 0.0;
}
