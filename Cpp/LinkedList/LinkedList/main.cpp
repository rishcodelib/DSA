//
//  main.cpp
//  LinkedList
//
//  Created by Rishabh Aggarwal on 12/02/21.
//

#include <iostream>
using namespace std;

class Node {
public:
    int data; // data Object
    Node *next; // This will store the value(address) of next element.
};


void push (Node** head_ref,int new_value){ //head will point to NULL
    
    Node *new_node= new Node();
    new_node->data = new_value;
    new_node->next = (*head_ref);
    
}

void insertAt(Node *prev_node, int new_value){
    if(prev_node == NULL) {
        cout<< "Prev Node Seems to be Null";
        return ;
    }
    else{
        Node *new_node = new Node();
        new_node->data = new_value;
        
        new_node->next = prev_node;
        prev_node->next = new_node;
    }
}

void append(Node **head_ref, int new_value) {
    
    Node* new_node = new Node();
    new_node->data = new_value;
    
    Node *last = *head_ref;
    
    new_node->next = NULL;
    
    if(*head_ref == NULL) {
        *head_ref = new_node;
        return;
    }
    while (last->next != NULL ) {
        last = last->next;
    }
    last->next = new_node;
    return;

}

void printlist(Node *node) {
    while(node != NULL){
        cout<< " " << node->data;
        node = node->next;
    }
}

int main(int argc, const char * argv[]) {
    // insert code here...
    Node *head = NULL;
    append(&head,4);
    push($head,5);
    printlist(head);
    return 0;
}
