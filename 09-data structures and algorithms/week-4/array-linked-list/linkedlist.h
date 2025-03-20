#include "node.h"
#include <filesystem>

template<class T>
class LinkedList {

public:
    LinkedList() : head(-1) {}
    bool empty();
    void insert(Node<T>&, T);
    void remove(Node<T>&, int);
    void remove_from_head(Node<T>& NA);

private:
    int head;
};

// Returns if head is null or not, or neg or not
template<class T>
bool LinkedList<T>::empty() {
    return head == -1;
}


// Removes the head of the array 
template<class T>
void LinkedList<T>::remove_from_head(Node<T>& NA) {
    remove(NA, head);
}


template<class T>
void LinkedList<T>::remove(Node<T>& NA, int p) {
        
}


template<class T>
void LinkedList<T>::insert(Node<T>& NA, T k) {
    
}
