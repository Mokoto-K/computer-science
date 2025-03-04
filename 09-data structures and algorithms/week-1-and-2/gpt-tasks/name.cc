#include <iostream>
#include <string>

int main() {
    std::cout << "Enter your name: " << std::endl;

    std::string name;
    std::cin >> name;

    int frame = name.size();

    std::string stars(frame, '*');

    std::cout << stars << std::endl;
    std::cout << "Hello, " << name << std::endl;
    std::cout << stars << std::endl;

    return 0;
}
