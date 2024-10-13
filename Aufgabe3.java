public class Aufgabe3 {
    public static int[] add(int[] a, int[] b) {
        int[] result = new int[a.length + 1];

        int carry = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int sum = a[i] + b[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }
        result[0] = carry;

        if(result[0] == 0){
            int[] newResult = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                newResult[i] = result[i + 1];
            }
            return newResult;
        }
        return result;
    }

    public static int[] multiply(int[] num, int factor) {
        int[] result = new int[num.length + 1];
        int carry = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            int produs = num[i] * factor + carry;
            result[i + 1] = produs % 10;
            carry = produs / 10;
        }
        result[0] = carry;

        if(result[0] == 0){
            int[] newResult = new int[num.length];
            for (int i = 0; i < num.length; i++) {
                newResult[i] = result[i + 1];
            }
            return newResult;
        }
        return result;
    }


    public static int[] subtract(int[] a, int[] b) {
        int[] result = new int[a.length];
        int borrow = 0;
        return result;
    }
    public static int[] divide(int[] num, int divisor) {
        int[] result = new int[num.length];
        int remainder = 0;
        return result;
    }
}
