#include "node.h"

template<class T>

class LinkedList {

public:
    LinkedList() : head(nullptr) {}
    ~LinkedList();

    bool empty();

    void insert(T);
    void insert(Node<T>*);
    void insert_end(T);

    bool search(T);
    void remove(T);
    void remove_from_head();

private:
    Node<T>* head;
};
