#include <iostream>

using namespace std;

// Node structure for the linked list
struct Node {
    int data;
    Node* next;

    Node(int value) : data(value), next(nullptr) {}
};

// Function to insert a new node at the beginning of the linked list
void Insert_Beginning(Node*& head, int newValue) {
    Node* newNode = new Node(newValue);
    newNode->next = head;
    head = newNode;
}

// Function to insert a new node at a specified position in the linked list
void Insert_At_Position(Node*& head, int newValue, int position) {
    if (position <= 0) {
        cout << "Position should be greater than 0." << endl;
        return;
    }

    Node* newNode = new Node(newValue);

    if (position == 1) { // Insert at the beginning
        newNode->next = head;
        head = newNode;
        return;
    }

    Node* current = head;
    for (int i = 1; current != nullptr && i < position - 1; i++) {
        current = current->next;
    }

    if (current == nullptr) {
        cout << "Position exceeds the length of the list. Inserting at the end." << endl;
    }

    newNode->next = current ? current->next : nullptr;
    if (current) {
        current->next = newNode;
    } else {
        // Insert at the end (when current is null)
        Node* last = head;
        while (last->next != nullptr) {
            last = last->next;
        }
        last->next = newNode;
    }
}

// Function to insert a new node at the end of the linked list
void Insert_End(Node*& head, int newValue) {
    Node* newNode = new Node(newValue);

    if (head == nullptr) { // If the list is empty
        head = newNode;
        return;
    }

    Node* last = head;
    while (last->next != nullptr) {
        last = last->next;
    }
    last->next = newNode;
}

// Function to display the linked list
void display(Node* head) {
    Node* current = head;
    while (current != nullptr) {
        cout << current->data << " -> ";
        current = current->next;
    }
    cout << "nullptr" << endl; // Indicate the end of the list
}

int main() {
    Node* head = nullptr; // Initialize head of the linked list
    int choice, value, position;

    do {
        cout << "\nMenu:\n";
        cout << "1. Insert at Beginning\n";
        cout << "2. Insert at Position\n";
        cout << "3. Insert at End\n";
        cout << "4. Display List\n";
        cout << "5. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter value to insert at beginning: ";
                cin >> value;
                Insert_Beginning(head, value);
                break;

            case 2:
                cout << "Enter value to insert: ";
                cin >> value;
                cout << "Enter position to insert at: ";
                cin >> position;
                Insert_At_Position(head, value, position);
                break;

            case 3:
                cout << "Enter value to insert at end: ";
                cin >> value;
                Insert_End(head, value);
                break;

            case 4:
                cout << "Linked List: ";
                display(head);
                break;

            case 5:
                cout << "Exiting the program." << endl;
                break;

            default:
                cout << "Invalid choice. Please try again." << endl;
        }
    } while (choice != 5);

    // Clean up memory
    Node* current = head;
    Node* nextNode;
    while (current != nullptr) {
        nextNode = current->next;
        delete current;
        current = nextNode;
    }

    return 0;
}
