public class CustomArrayList {
    private int[] arr;
    private int maxSize;
    private int size;
    public CustomArrayList() {
        arr = new int[10];
        maxSize = 10;
    }
    public CustomArrayList(int size) {
        arr = new int[size];
        maxSize= size;
    }
    void add(int x){
        if(size == maxSize){
            int[] newArr = new int[maxSize * 2];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            maxSize *=2;
            arr = newArr;
        }
        arr[size++] = x;
    }

    void add(int index, int x){
        if(index<=size){
            if(size == maxSize){
                int[] newArr = new int[maxSize * 2];
                for (int i = 0; i < maxSize; i++) {
                    newArr[i] = arr[i];
                }
                maxSize *=2;
                arr = newArr;
            }
            for (int i = size ; i > index; i--) {
                arr[i]=arr[i-1];
            }
            arr[index] = x;
            size++;
        }else
            System.out.println("ERROR: Index out of range.");
    }


    int size(){
        return size;
    }

    void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    boolean isEmpty(){
        return size != 0;
    }
    boolean isIn(int x){
        int i = 0;
        boolean foundX = false;
        while(!foundX && i<size){
            if(arr[i] == x)
                foundX = true;
            i++;
        }

        return foundX;
    }

    int find(int x){
        int i = 0;
        boolean foundX = false;
        while(!foundX && i < size){
            if(arr[i] == x)
                foundX = true;
            i++;

        }
        return (foundX ? i : -1);

    }

    void remove(int x){
        int xIndex = find(x);
        if (xIndex == -1){
            System.out.println("ERROR: Element not found in list.");
        } else {
            for(int i = xIndex; i<size-1; i++){
                arr[i] = arr[i+1];
            }
            size--;
            if(size == maxSize/2)
                maxSize = size;
        }
    }
}
