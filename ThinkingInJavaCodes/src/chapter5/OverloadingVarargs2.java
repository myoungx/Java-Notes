package chapter5;

/**
 * Created by mengyang on 2017/4/26.
 */
public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.print("first");
    }

    static void f(Character... args) {
        System.out.print("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        //f('a', 'b');//这个地方,两个方法f()均能匹配上
    }
}
