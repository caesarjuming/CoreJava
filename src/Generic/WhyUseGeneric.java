package Generic;/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
         ���汣��       ����BUG
         Create by Caesar,2016/2/16
*/

import java.util.ArrayList;
import java.util.List;

public class WhyUseGeneric<T,V> {
    //list �п�������κ����ͣ�ȡ��ʱ����ǿ��ת��
    //1.7�汾�󣬿���ʡ������
    //������Ҫ�Ǳ��������
    List<String> ali=new ArrayList<>();

    WhyUseGeneric(T a,V b){
        this.first=a;
        this.second=b;
    }

    private T first;
    private V second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public static void main(String[] args) {
        WhyUseGeneric<String,Integer> a=new WhyUseGeneric<>("a",2);
        System.out.println(a.getFirst());
        System.out.println(a.getSecond());

    }
}
