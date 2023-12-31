public class Main {
    public static void main(String[] args) {
        CustomArrayList arr = new CustomArrayList(3);
        arr.add(1);
        arr.add(4);
        arr.add(2);
        arr.add(123);
        arr.add(2,9000);
        arr.display();
        System.out.println(arr.find(1));
        arr.remove(123);
        arr.display();
    }
}