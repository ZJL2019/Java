/**
 * @Author : Jaler
 * @Date : 2021/1/4 13:46
 * @describe :
 * @Version : 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        Node head = myLinkedList.createLinked();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.display();
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addFirst(30);
        myLinkedList.addFirst(30);
        myLinkedList.addFirst(30);
        myLinkedList.display();
        myLinkedList.addIndex(4,66);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(30));
        System.out.println(myLinkedList.size);
        //myLinkedList.remove(30);
        myLinkedList.removeAllKey(30);
        myLinkedList.display();
        System.out.println(myLinkedList.size());
        myLinkedList.clear();
        myLinkedList.display();
    }

    public static void main1(String[] args) {
        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.add(0, 1);
        myArrayList.add(1, 2);
        myArrayList.add(2, 3);
        myArrayList.add(1, 4);
        myArrayList.display();
        System.out.println(myArrayList.contains(3));
        System.out.println(myArrayList.search(4));
        System.out.println(myArrayList.getPos(2));
        myArrayList.setPos(2, 6);
        myArrayList.display();
        myArrayList.remove(3);
        myArrayList.display();
        System.out.println(myArrayList.size());
        myArrayList.clear();
        myArrayList.display();
    }
}
