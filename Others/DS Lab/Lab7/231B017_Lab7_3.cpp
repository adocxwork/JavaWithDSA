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

    void insert(int value) {
        Node* newNode = new Node();
        newNode->data = value;
        newNode->next = head;
        head = newNode;
    }

    void deleteFromBeginning() {
        if (head == nullptr) {
            cout << "List is empty. Nothing to delete." << endl;
            return;
        }
        Node* temp = head;
        head = head->next;
        delete temp;
        cout << "Node deleted from the beginning." << endl;
    }

    void deleteFromEnd() {
        if (head == nullptr) {
            cout << "List is empty. Nothing to delete." << endl;
            return;
        }
        if (head->next == nullptr) {
            delete head;
            head = nullptr;
            cout << "Node deleted from the end." << endl;
            return;
        }
        Node* temp = head;
        while (temp->next->next != nullptr) {
            temp = temp->next;
        }
        delete temp->next;
        temp->next = nullptr;
        cout << "Node deleted from the end." << endl;
    }

    void deleteFromPosition(int position) {
        if (head == nullptr) {
            cout << "List is empty. Nothing to delete." << endl;
            return;
        }
        if (position == 0) {
            deleteFromBeginning();
            return;
        }
        Node* temp = head;
        for (int i = 0; temp != nullptr && i < position - 1; i++) {
            temp = temp->next;
        }
        if (temp == nullptr || temp->next == nullptr) {
            cout << "Position not found." << endl;
            return;
        }
        Node* nextNode = temp->next->next;
        delete temp->next;
        temp->next = nextNode;
        cout << "Node deleted from position " << position << "." << endl;
    }

    void display() {
        if (head == nullptr) {
            cout << "List is empty." << endl;
            return;
        }
        Node* temp = head;
        cout << "Linked List: ";
        while (temp != nullptr) {
            cout << temp->data << " -> ";
            temp = temp->next;
        }
        cout << "nullptr" << endl;
    }

    ~LinkedList() {
        while (head != nullptr) {
            deleteFromBeginning();
        }
    }
};

int main() {
    LinkedList list;
    int choice, value, position;

    do {
        cout << "\nMenu:\n";
        cout << "1. Insert node\n";
        cout << "2. Delete node from beginning\n";
        cout << "3. Delete node from end\n";
        cout << "4. Delete node from specified position\n";
        cout << "5. Display list\n";
        cout << "6. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter value to insert: ";
                cin >> value;
                list.insert(value);
                break;
            case 2:
                list.deleteFromBeginning();
                break;
            case 3:
                list.deleteFromEnd();
                break;
            case 4:
                cout << "Enter position to delete from: ";
                cin >> position;
                list.deleteFromPosition(position);
                break;
            case 5:
                list.display();
                break;
            case 6:
                cout << "Exiting..." << endl;
                break;
            default:
                cout << "Invalid choice. Please try again." << endl;
        }
    } while (choice != 6);

    return 0;
}
