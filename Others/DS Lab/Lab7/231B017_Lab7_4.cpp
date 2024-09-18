#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

class LinkedList {
private:
    Node* head;

public:
    LinkedList() {
        head = nullptr;
    }

    // Method to insert a new node at the beginning
    void insert(int value) {
        Node* newNode = new Node();
        newNode->data = value;
        newNode->next = head;
        head = newNode;
    }

    // Method to search for an element in the linked list
    bool search(int value) {
        Node* current = head;
        while (current != nullptr) {
            if (current->data == value) {
                return true; // Element found
            }
            current = current->next;
        }
        return false; // Element not found
    }

    // Destructor to free memory
    ~LinkedList() {
        while (head != nullptr) {
            Node* temp = head;
            head = head->next;
            delete temp;
        }
    }
};

int main() {
    LinkedList list;
    int value, searchValue;

    // Inserting some values into the linked list
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);

    cout << "Enter value to search for: ";
    cin >> searchValue;

    if (list.search(searchValue)) {
        cout << "Element " << searchValue << " found in the list." << endl;
    } else {
        cout << "Element " << searchValue << " not found in the list." << endl;
    }

    return 0;
}
