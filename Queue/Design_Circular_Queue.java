class ListNode {
    int value;
    ListNode next;
    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}
class MyCircularQueue {

  
         int maxSize, size = 0;
    ListNode head = null, tail = null;
    public MyCircularQueue(int k) {
        maxSize = k;
    }
    
    public boolean enQueue(int value) {
         if (isFull()) return false;
        ListNode newNode = new ListNode(value, null);
        if (isEmpty()) head = tail = newNode;
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) return false;
        head = head.next;
        size--;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : head.value;
    }
    
    public int Rear() {
        return isEmpty() ? -1 : tail.value;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == maxSize;
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
