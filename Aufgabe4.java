public class Aufgabe4 {
    public static int cheapestKeyboard(int[] keyboards){
        int min = keyboards[0];
        for(int i = 0; i < keyboards.length; i++){
            if(keyboards[i] < min){
                min = keyboards[i];
            }
        }
        return min;
    }
    public static int mostExpensiveItem(int[] keyboards, int[]USBs){
        int maxPrice = 0;
        for (int i = 0; i < keyboards.length; i++) {
            if (keyboards[i] > maxPrice) {
                maxPrice = keyboards[i];
            }
        }
        for (int i = 0; i < USBs.length; i++) {
            if (USBs[i] > maxPrice) {
                maxPrice = USBs[i];
            }
        }
        return maxPrice;
    }
    public static int mostExpensiveUSBs(int[] USBs, int budget){
        int maxUSB = 0;
        for(int i = 0; i < USBs.length; i++){
            if(USBs[i] <= budget && USBs[i] > maxUSB){
                maxUSB = USBs[i];
            }
        }
        return maxUSB;
    }
    public static int maxGeldbetrag(int[] keyboards, int[] USBs, int budget){
        int max = -1;
        for (int k : keyboards) {
            for (int u : USBs) {
                int total = k + u;
                if (total <= budget) {
                    max = Math.max(max, total);
                }
            }
        }
        return max;
    }

}
