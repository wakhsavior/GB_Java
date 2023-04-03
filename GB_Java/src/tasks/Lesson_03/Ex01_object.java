package tasks.Lesson_03;

public class Ex01_object {
    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }

    static Object summ(Object a, Object b){
        if(a instanceof Double && b instanceof Double){
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer)a + (Integer) b);
        }
        return 0;
    }
    public static void main(String[] args) {
        Object o = 1;
        Object p = 1.2;
        GetType(o);
        GetType(p);

    }
}
