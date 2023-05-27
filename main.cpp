#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node* next;
    om(int data)
    {
        this->data = data;
        this->next = null;
    }
};

int main()
{

#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif
    Node* head;
    Node& newNode = new Node(3);
    newNode->next = head;
    head = newNode;

    cout << head->data;

    return 0;
}
