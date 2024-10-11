public class Aufgabe3 {
    public static int[] add(int[] a, int[] b) {
        int[] result = new int[a.length + 1];
        if(result[0] == 0){
            int[] newResult = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                newResult[i] = result[i + 1];
            }

            return newResult;
        }
        return result;
    }

    public static int[] subtract(int[] a, int[] b) {
        int[] result = new int[a.length];
        return result;
    }

    public static int[] multiply(int[] num, int factor) {
        int[] result = new int[num.length + 1];
        int carry = 0;

        if(result[0] == 0){
            int[] newResult = new int[num.length];
            for (int i = 0; i < num.length; i++) {
                newResult[i] = result[i + 1];
            }
            return newResult;
        }
        return result;
    }

    public static int[] divide(int[] num, int divisor) {
        int[] result = new int[num.length];
        int remainder = 0;
        return result;
    }


}
