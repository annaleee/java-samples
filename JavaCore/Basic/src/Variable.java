public class Variable {
    int cars = 5; // instance variable, 值对类的每个实例来说是唯一的
    static int bicycle = 3; // class variables/ static fields 无论类被实例化多少次，这个变量的存在只有一个副本
    final int gears = 4; // 这个变量不会改变
    final static int bicyclenum = 7;

    public static void main(String[] args) throws Exception {
        int count = 0;// Local Variables, 仅在方法内使用

        // literal 字面值
        // 如果后面不加L就是int类型， 对于long类型，如果大小超出int所能表示的范围，则必须用L来结尾
        //数据类型
        // primitive
        //numeric
        byte numbyte = 0;// 1 byte; [-128, 127]; 对byte进行数学运算时，会自动提升为int类型，如果表达式中有float或者double，也是自动提升
        short numshort = 0;// 2 byte; [-2^15, 2^15-1]
        int numint = 0;// 4 byte; [-2^31, 2^31-1]; Java8: 可以用int表示无符号32整数[0,2^31-1]
        long numlong = 0L;// 8 byte;[-2^63; 2^63-1]; 比long还长的有一个BigInteger
        char numchar = '\u0000';// 2 byte; [0, 2^16-1]; 当char进行加减乘除运算时，也被换成int类型

        // floating-point
        float numfloat = 0.0f;// 4 byte; 运行速度比fouble快，当数值非常大或者非常小会不精确
        float numfloatL = 0L;
        double numdouble = 0;// 8 byte; 如果还想要更高精度，有一个BigDecimal
        boolean numbool = false;
        
        // Java.lang.String 字符串
        String s = "This is a string";// String不可变

    }
}