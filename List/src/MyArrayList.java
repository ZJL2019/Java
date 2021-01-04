/**
 * @Author : Jaler
 * @Date : 2021/1/4 13:44
 * @describe :
 * @Version : 1.0
 */
public class MyArrayList {
    public int[] elem;
    private int usedSize;

    public MyArrayList() {
        this.elem = new int[10];
    }

    public MyArrayList(int capacity) {
        this.elem = new int[capacity];
    }


    //打印顺序表
    public void display() {
        for (int x:
             elem) {
            System.out.printf("%d ",x);
        }
        System.out.println();
    }

    //在pos的位置添加元素
    public void add(int pos,int data){
        for(int i=usedSize;i>=pos;i--){
            elem[i+1]=elem[i];
        }
        elem[pos]=data;
        usedSize++;
    }

    //判定是否包含某个元素
    public boolean contains(int toFind){
        for(int i=0;i<usedSize;i++) {
            if(elem[i]==toFind){
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind){
        for(int i=0;i<usedSize;i++){
            if(elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
    public int getPos(int pos){
        if(pos<usedSize){
            return elem[pos];
        }
        return -1;
    }

    //给pos位置的元素设置为value
    public void setPos(int pos,int value){
        if(pos<usedSize){
            elem[pos]=value;
        }
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove){
        int pos=search(toRemove);
        for(int i=pos;i<usedSize;i++){
            elem[i]=elem[i+1];
        }
        usedSize--;
    }

    //获取顺序表长度
    public int size(){
        return usedSize;
    }

    //清空顺序表
    public void clear(){
        for(int i=0;i<usedSize;i++) {
            elem[i]=0;
        }
    }
}
