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
         Create by Caesar,2016/2/17
*/

import java.io.Serializable;

//�����ڱ����ʱ��ᱻ����Ϊ��һ���޶��������滻�����û�и������޶����ͣ���ΪObject
public class GenericAndJVM {

    //�޶�����ΪComparable ������ΪComparable
    public static <T extends Comparable&Serializable> T getFirst(T... aa){
        return aa[0];
    }
    //����ΪSerializable
    //Ϊ�����Ч�ʣ�����ǩ�ӿ�(û�з����Ľӿ�)���ڱ߽���ĩβ
    public static <T extends Serializable&Comparable> T getFirst2(T... aa){
        return aa[0];
    }

    public static void main(String[] args) {
        //����ΪObject���ֱ�ǿתΪIntegerȻ��ֵ��i
        Integer i=GenericAndJVM.getFirst(new Integer[]{1,2,3});

    }

}
