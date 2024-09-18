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

    // Method to insert a new node at the end of the list
    void insert(int value) {
        Node* newNode = new Node();
        newNode->data = value;
        newNode->next = nullptr;

        if (head == nullptr) {
            head = newNode;
        } else {
            Node* temp = head;
            while (temp->next != nullptr) {
                temp = temp->next;
            }
            temp->next = newNode;
        }
    }

    // Method to find the middle node
    Node* findMiddle() {
        if (head == nullptr) {
            return nullptr; // List is empty
        }

        Node* slow = head;
        Node* fast = head;

        // Move fast pointer two steps and slow pointer one step
        while (fast != nullptr && fast->next != nullptr) {
            slow = slow->next;         // Move slow pointer by one
            fast = fast->next->next;   // Move fast pointer by two
        }
        return slow; // Slow pointer is now at the middle node
    }

    // Method to display the linked list
    void display() {
        Node* temp = head;
        cout << "Linked List: ";
        while (temp != nullptr) {
            cout << temp->data << " -> ";
            temp = temp->next;
        }
        cout << "nullptr" << endl;
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
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.insert(50);

    list.display();

    Node* middle = list.findMiddle();
    if (middle != nullptr) {
        cout << "The middle node is: " << middle->data << endl;
    } else {
        cout << "The list is empty." << endl;
    }

    return 0;
}
