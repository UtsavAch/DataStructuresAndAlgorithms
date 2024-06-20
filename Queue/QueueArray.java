public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is successfully created!");
    }

    // IsFull
    public boolean isFull(){
        if(topOfQueue == arr.length-1){
            return true;
        }else{
            return false;
        }
    }

    // IsEmpty
    public boolean isEmpty(){ 
        if(beginningOfQueue == -1 || beginningOfQueue == arr.length){
            return true;
        }else{
            return false;
        }
    }

    // Enqueue
    public void enQueue(int value){
        if(isFull()){
            System.out.println("The Queue is Full!");
        }else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("successfully inserted "+value+" in the queue");
        }else{
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("successfully inserted "+value+" in the queue");
        }
    }
}
