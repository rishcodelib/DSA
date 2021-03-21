//
//  main.cpp
//  CircularLinkedLIst
//
//  Created by Rishabh Aggarwal on 16/02/21.
//

#include <iostream>
using namespace std;
class Node {
public:
    int data;
    Node *next; // storing pointer.
};

void push (Node **head_ref,int data){
    Node *new_node = new Node;
    Node *tmp = *head_ref;
    new_node->data = data;
    new_node->next = *head_ref; // Assumption
    
    if(*head_ref != NULL) { //means something is in the list
        while(tmp->next != *head_ref){
            tmp = tmp->next;
            
        }
        tmp->next = new_node;
        
    }
    else {
        new_node->next = new_node;
    }
    *head_ref = new_node;
}
void cprintlist(Node *head){
    Node *temp = head;
}

int main(int argc, const char * argv[]) {
    Node *head = NULL;
    push(&head,30);
    push(&head,20);
    push(&head,25);
   cout << "Hello, World!\n";
    return 0;
}
