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
         Create by Caesar,2016/2/18
*/

public class GenericConflict extends Basic<String> {

    GenericConflict(String ts) {
        super(ts);
    }

    //��̳�Basic��getFirst����������������
    //public Object getFirst(Object s)
    //���Է����뿴һ���ֽ���,Ϊ����д��JVM�������Ž�
    //Object getFirst(Object s){getFirst((String)s)}
    @Override
    public String getFirst(String s) {
        return super.getFirst(s)+":GenericConflict";
    }
    //����ķ����Ǳ������ģ�ֻ�з������Ͳ�ͬ������Java���ǲ��������
    //������������п��ԣ�������ò������ͺͷ�������ȷ��һ������
    //��˱��������Բ����������������Ͳ�ͬ�ķ����ֽ���
    @Override
    public String getEmpty(){
        return super.getEmpty();
    }
    public static void main(String[] args) {
        GenericConflict g=new GenericConflict("my1");
        //��д��super��getFirst����
        System.out.println(g.getFirst("a"));


    }
}

class Basic<T>{
    Basic(T ts){
        this.ts=ts;
    }
    private T ts;
    public T getFirst(T t){
        return t;
    }
    //��������public Object getEmpty()
    public T getEmpty(){
        return ts;
    }


}
