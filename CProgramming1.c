#include<stdio.h>

#define MAX 5

int queue[MAX];
int front = -1;
int rear = -1;

// Check if queue is full
int isFull() {
    if ((rear + 1) % MAX == front)
        return 1;
    else
        return 0;
}

// Check if queue is empty
int isEmpty() {
    if (front == -1)
        return 1;
    else
        return 0;
}

// Enqueue operation
void enqueue(int value) {
    if (isFull()) {
        printf("Queue is Full\n");
    } else {
        if (front == -1)
            front = 0;
        rear = (rear + 1) % MAX;
        queue[rear] = value;
        printf("Inserted: %d\n", value);
    }
}

// Dequeue operation
void dequeue() {
    if (isEmpty()) {
        printf("Queue is Empty\n");
    } else {
        printf("Deleted: %d\n", queue[front]);
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % MAX;
        }
    }
}

// Size of queue
int size() {
    if (isEmpty())
        return 0;
    else if (rear >= front)
        return rear - front + 1;
    else
        return MAX - front + rear + 1;
}

int main() {
    enqueue(10);
    enqueue(20);
    enqueue(30);
    dequeue();
    enqueue(40);

    printf("Queue Size: %d\n", size());

    if (isEmpty())
        printf("Queue is Empty\n");
    else
        printf("Queue is Not Empty\n");

    if (isFull())
        printf("Queue is Full\n");
    else
        printf("Queue is Not Full\n");

    return 0;
}