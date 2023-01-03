package pkPatmicAnimal;

public class test {
    // max two numbers?
    public static Integer max(Integer... vals) {
        Integer ret = null;
        for (Integer val : vals) {
            if (ret == null || (val != null && val > ret)) {
                ret = val;
            }
        }
        return ret;
    }

    public static void main(String args[]) {
        System.out.println(max(1, 2, 3, 4, 0, -1));

    }

    public static int max(int first, int... rest) {
        int ret = first;
        for (int val : rest) {
            ret = Math.max(ret, val);
        }
        return ret;
    }
}
