public class TestHanoi {
    public static void main(String[] args) {
        hanoi(3,'a','b','c');
    }
    /*
    * @param n n个盘子
    * @param from 开始的柱子
    * @param in 中间的柱子
    * @param    to 目标柱子
    * 无论多少个盘子，都认为只有两个盘子。上面所有盘子和最下面一个盘子。
     */

    public static void hanoi(int n,char from,char in ,char to){
        if (n==1){
            System.out.println("第1个盘子从"+from+"移到"+to);
        }else {
            //移动上面所有盘子到中间位置
            hanoi(n-1,from,to,in);
            //移动下面的盘子
            System.out.println("第"+n+"个盘子从"+from+"移到"+to);
            hanoi(n-1,in,from,to);
        }
    }
}
