import javax.sound.midi.SoundbankResource;
import java.lang.reflect.Array;
import java.util.Arrays;

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

        /*int[] arr = {1, 2, 3};
        printArray(arr);//方法参数本质是数组首地址的引用，所以此时传送的是首地址的引用(这样可以避免对整个数组的拷贝)*/

        //理解引用类型

        //参数传内置类型
       /* int num = 0;
        func(num);
        System.out.println("num = "+num);*/
        //修改形参，不会修改变量的值，本质是修改了方法中的局部变量

        //数组作为方法的返回值
       /* int[] arr = {1, 2, 3};
        int[] output = transform(arr);
        printArray(output);*/

        //数组练习
        //数组转字符串--使用Arrays.toString
        /*int[] arr = {1,2,3,4,5,6};
        String newArr= Arrays.toString(arr);
        System.out.println(newArr);*/

        //实现Arrays.toString
       /* int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(toString(arr));*/

        //数组拷贝
        /*int[] arr = {1,2,3,4,5,6};
        int[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println("newArr: "+Arrays.toString(newArr));

        arr[0]=10;
        System.out.println("arr: "+Arrays.toString(arr));
        System.out.println("newArr: "+Arrays.toString(newArr));*/
        /*相比于 newArr = arr 这样的赋值, copyOf 是将数组进行了 深拷贝, 即又创建了一个数组对象, 拷贝原有
        数组中的所有元素到新数组中. 因此修改原数组, 不会影响到新数组*/

        //实现copyOf
        /*int[] arr = {1, 2, 3, 4, 5, 6};
        int[] ret = copyOf(arr);
        printArray(ret);*/

        //找数组中最大的元素
        /*int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(max(arr));*/

        //求平均值
       /* int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(avg(arr));*/

        //查找数组中的指定元素(顺序查找)
        /*int[] arr = {1, 2, 3, 10, 5, 6};
        System.out.println(find(arr,10));*/

        //查找数组中的指定元素(二分查找)
        /*int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.binarySearch(arr, 6));
        System.out.println(binarySerach(arr, 6));*/

        //感受二分查找的效率
        /*int[] arr = makeBigArray();
        int ret = binarySerach(arr, 9999);
        System.out.println("ret = " + ret + "count = " + count);*/

        //检查数组有序性
        /*int[] arr={1,2,3,10,5,6};
        System.out.println(isSorted(arr));*/

        //数组排序(冒泡)
        //int[] arr = {9, 5, 2, 7};
        /*bubbleSort(arr);
        System.out.println(Arrays.toString(arr));*/

        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        //数组逆序
        /*int[] arr = {1, 2, 3, 4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));*/

        //调整数组，偶数在前，奇数在后
        /*int[] arr = {1, 2, 3, 4, 5, 6};
        transform2(arr);
        System.out.println(Arrays.toString(arr));*/

        //二维数组
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                System.out.printf("%d\t",arr[row][col]);
            }
            System.out.println("");
        }
    }

    public static void transform2(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }

    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            right--;
            left++;
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static int count = 0;

    public static int[] makeBigArray() {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static int binarySerach(int[] arr, int toFind) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            count++;
            int mid = (left + right) / 2;
            if (toFind < arr[mid]) {
                right = mid - 1;
            } else if (toFind > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int find(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    public static double avg(int[] arr) {
        int sum = 0;
        for (int x :
                arr) {
            sum += x;
        }
        return (double) sum / (double) arr.length;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] copyOf(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }

    public static String toString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i != arr.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }

    public static int[] transform(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i] * 2;
        }
        return ret;
    }

    public static void func(int x) {
        x = 10;
        System.out.println("x = " + x);
    }

    public static void printArray(int[] a) {
        for (int x :
                a) {
            System.out.println(x);
        }
    }
}
