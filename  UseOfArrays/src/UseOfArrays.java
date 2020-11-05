/**
 * @Author : Jaler
 * @Date : 2020/11/5 17:03
 * @describe :
 * 1. 理解数组基本概念
 * 2. 掌握数组的基本用法
 * 3. 数组与方法相互操作
 * @Version : 1.0
 */
public class UseOfArrays {
    public static void main(String[] args) {
        //数组语法
        //int[] arr = new int[]{1, 2, 3};
        //数组使用
        //int[] arr = {1, 2, 3};
        //获取数组长度
        //System.out.println("length: " + arr.length);

        //访问数组中的元素
        //System.out.println(arr[1]);
        //System.out.println(arr[0]);

        //arr[2] = 100;
        //System.out.println(arr[2]);

        //下标越界
        //System.out.println(arr[4]);
        //总结：java中的数组与C/C++中数组使用大同小异，都需要注意访问越界

        //遍历数组
        /*int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //for-each类似C++11中范围for
        /*int[] arr = {1, 2, 3};
        for (int x : arr) {
            System.out.println(x);
        }*/
        int[] arr = {1, 2, 3};
        printArray(arr);//方法参数本质是数组首地址的引用，所以此时传送的是首地址的引用(这样可以避免对整个数组的拷贝)
    }

    public static void printArray(int[] a) {
        for (int x :
                a) {
            System.out.println(x);
        }
    }
}
