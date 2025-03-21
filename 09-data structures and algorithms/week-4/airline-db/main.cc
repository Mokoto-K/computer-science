#include <list>
#include <algorithm>
#include <iostream>
#include <string>
#include <fstream>

int menu() {
    int option;
    std::cout << '\n';
    std::cout << "Enter one of the following options: " << '\n';
    std::cout << "1. Load reservation from file: " << '\n';
    std::cout << "2. Reserve a ticket: " << '\n';
    std::cout << "3. Cancel a reservation: " << '\n';
    std::cout << "4. Check reservation: " << '\n';
    std::cout << "5. Display passenger: " << '\n';
    std::cout << "6. Save passenger list: " << '\n';
    std::cout << "7. exit: " << '\n' << std::endl;
    std::cin >> option;
    std::cin.get();

    return option;
}

int main() {
    std::list<std::string> flight_list;
    std::list<std::string>::iterator i1, i2;
    std::string name;

    while (true) {
        switch (menu()) {
            case 1: {
                        std::ifstream input("ticket_reservations.dat");
                        while (input >> name) 
                            flight_list.push_back(name);
                        input.close();
                        break;
                    }

            case 2: {

                        break;
                    }

            case 3: {

                        break;
                    }

            case 4: {

                        break;
                    }

            case 5: {

                        break;
                    }

            case 6: {

                        break;
                    }

            case 7:
                    return 0;
        }
    }
    return 0;
}
