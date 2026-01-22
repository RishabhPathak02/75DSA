package Day33;

public class DesignCircularQueue {
    class MyCircularQueue {
        int rear;
        int front;
        int size;
        int capacity;
        int[] Queue;

        public MyCircularQueue(int k) {
            rear = -1;
            front = 0;
            size = 0;
            capacity = k;
            Queue = new int[k] ;
        }

        public boolean enQueue(int value) {
            if (isFull())
                return false;
            rear = (rear + 1) % capacity;
            Queue[rear] = value;
            size++ ;
            return true ;
        }

        public boolean deQueue() {
            if (isEmpty())
                return false;
            front = (front + 1) % capacity;
            size-- ;
            return true ;
        }

        public int Front() {
            if(isEmpty())return -1 ;
            return Queue[front];
        }

        public int Rear() {
            if(isEmpty())return -1 ;
            return Queue[rear];
        }

        public boolean isEmpty() {
            if(size == 0)return true ;
            else return false ;
        }

        public boolean isFull() {
            if(size == capacity)return true ;
            else return false ;
        }
    }

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
}
