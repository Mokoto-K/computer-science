#include "node.h"

template<class T>
class LinkedList {

public:
    LinkedList() : head(nullptr), next(nullptr) {}
    ~LinkedList();
    
    bool empty();
    T front();
    void remove_from_head();
    void insert_at_tail(T);

private:
    Node<T>* head, next;
};


template<class T>
LinkedList<T>::~LinkedList<T>() {
    while (!empty())
        remove_from_head();
}

template<class T>
bool LinkedList<T>::empty() {
    return head == nullptr;
}

template<class T>
T LinkedList<T>::front() {
    return head->date;
}

template<class T>
void LinkedList<T>::remove_from_head() {
    Node<T>* temp = head;
    head = head->next;
    delete temp;
}

template<class T>
void LinkedList<T>::insert_at_tail(T) {
    if (head != nullptr)

}
