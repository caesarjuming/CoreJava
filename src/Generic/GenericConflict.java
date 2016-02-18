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
         佛祖保佑       永无BUG
         Create by Caesar,2016/2/18
*/

public class GenericConflict extends Basic<String> {

    GenericConflict(String ts) {
        super(ts);
    }

    //会继承Basic的getFirst方法，被擦除后变成
    //public Object getFirst(Object s)
    //可以反编译看一下字节码,为了重写，JVM运用了桥接
    //Object getFirst(Object s){getFirst((String)s)}
    @Override
    public String getFirst(String s) {
        return super.getFirst(s)+":GenericConflict";
    }
    //父类的方法是被擦除的，只有返回类型不同，这在Java中是不被允许的
    //但是在虚拟机中可以，虚拟机用参数类型和返回类型确定一个方法
    //因此编译器可以产生两个仅返回类型不同的方法字节码
    @Override
    public String getEmpty(){
        return super.getEmpty();
    }
    public static void main(String[] args) {
        GenericConflict g=new GenericConflict("my1");
        //重写了super的getFirst方法
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
    //擦除后变成public Object getEmpty()
    public T getEmpty(){
        return ts;
    }


}
