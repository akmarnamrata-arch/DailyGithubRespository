#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

int main()
{
    struct node *head=NULL,*newnode,*temp;
    struct node *prev=NULL,*next=NULL;
    int n,i;

    printf("Enter number of nodes: ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        newnode=(struct node*)malloc(sizeof(struct node));
        scanf("%d",&newnode->data);
        newnode->next=head;
        head=newnode;
    }

    temp=head;

    while(temp!=NULL)
    {
        next=temp->next;
        temp->next=prev;
        prev=temp;
        temp=next;
    }

    head=prev;

    printf("List Reversed");
}