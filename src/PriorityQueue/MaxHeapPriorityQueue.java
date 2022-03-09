package PriorityQueue;

public class MaxHeapPriorityQueue {
    private Integer[] heap;
    private int n;

    public MaxHeapPriorityQueue(int capacity) {
        heap = new Integer[capacity+1];
        n=0;
    }
    public boolean isEmpty(){
        return n==0;
    }
    public int size(){
        return n;
    }
    public void insert(int x){
        if(n == heap.length-1){
            resize(2* heap.length);
        }
        n++;
        heap[n]= x;
        swim(n);
    }

    private void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for (int i = 0; i < heap.length ; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }
    public  void printMaxHeap(){
        for (int i = 0; i <=n ; i++) {
            System.out.println(heap[i]+ " ");
        }
    }

    private void swim(int k) {
        while(k>1 && heap[k/2] < heap[k]){
            int temp = heap[k];
            heap[k] =heap[k/2];
            heap[k/2] = temp;
            k=k/2;
        }
    }

    public static void main(String[] args) {
        MaxHeapPriorityQueue maxHeapPriorityQueue = new MaxHeapPriorityQueue(4);
        maxHeapPriorityQueue.insert(4);
        maxHeapPriorityQueue.insert(1);
        maxHeapPriorityQueue.insert(9);
        maxHeapPriorityQueue.insert(2);
        maxHeapPriorityQueue.printMaxHeap();


    }
}
