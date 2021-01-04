/**
 * @Author : Jaler
 * @Date : 2021/1/4 14:44
 * @describe :
 * @Version : 1.0
 */
class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node() {
    }
}

public class MyLinkedList {
    public Node head;
    public int size;
    public Node createLinked() {
        this.head = new Node();
        return head;
    }

    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void addFirst(int data) {
        Node cur=new Node(data);
        cur.next=head.next;
        head.next=cur;
        size++;
    }

    //尾插法
    public void addLast(int data) {
        Node tmp=head;
        while (tmp.next!=null){
            tmp=tmp.next;
        }
        Node cur=new Node(data);
        tmp.next=cur;
        size++;
    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index, int data) {
        if(index>size){
            return false;
        }
        Node pre=head;
        Node cur=head.next;
        int pos=1;
        while (cur!=null){
            if(pos==index){
                Node tmp=new Node(data);
                tmp.next=cur;
                pre.next=tmp;
                size++;
                return true;
            }
            pre=pre.next;
            cur=cur.next;
            pos++;
        }
        return false;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur=head;
        while (cur!=null){
            if(cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        Node pre=head;
        Node cur=head.next;
        while (cur!=null){
            if(cur.val==key){
                pre.next=cur.next;
                cur.next=null;
                size--;
                break;
            }
            pre=pre.next;
            cur=cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node pre=head;
        Node cur=head.next;
        while (cur!=null){
            while (cur.val==key){
                pre.next=cur.next;
                cur.next=null;
                cur=pre.next;
                size--;
            }
            pre=pre.next;
            cur=pre.next;
        }
    }

    //得到单链表的长度
    public int size() {
        return size;
    }

    public void clear() {
        head.next=null;
    }

}
