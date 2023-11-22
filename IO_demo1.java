

public class IO_demo {
    //猴子吃桃子
    //f(10)=1
    //公式f(n)-f(n)/2-1=f(n+1)  n:第几天
    // 变形  -->f(n)=2f(n+1)+2;  求f1
    public static void main(String[] args) {
        System.out.println("猴子第一天摘的桃子"+f(1));
    }

    public static int f(int n) {
        if (n==10){
            return 1;
        }else {
            return 2*f(n+1)+2;
        }
    }
}

