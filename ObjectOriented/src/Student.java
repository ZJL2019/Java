/**
 * @Author : Jaler
 * @Date : 2020/11/25 14:55
 * @describe :
 * @Version : 1.0
 */
public class Student implements Comparable{
    private String name;
    private int source;

    public Student(String name, int source) {
        this.name = name;
        this.source = source;
    }

    @Override
    public String toString() {
        return "[" + this.name + ":" + this.source + "]";
    }

    @Override
    public int compareTo(Object o){
        Student student = (Student)o;
        if(this.source>student.source){
            return -1;
        }else if(this.source<student.source){
            return 1;
        }else{
            return 0;
        }
    }
}
