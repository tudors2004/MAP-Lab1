import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] insufficientGrades = Aufgabe1.getInsufficientGrades(grades);
        System.out.print("Note insuficiente: ");
        for(int i = 0; i < insufficientGrades.length; i++){
            System.out.print(insufficientGrades[i] + " ");
        }
        System.out.println();

        double mean = Aufgabe1.calculateMean(grades);
        System.out.println("Media: " + mean);

        int[] roundedGrades = Aufgabe1.roundGrades(grades);
        System.out.println("Note rotunjite: " + Arrays.toString(roundedGrades));

        int maxGrade = Aufgabe1.getMaxGrade(grades);
        System.out.println("Nota maxima rotunjita: " + maxGrade);

        int maxNum = Aufgabe2.findMax(grades);
        System.out.println("Nr max: " + maxNum);

        int minNum = Aufgabe2.findMin(grades);
        System.out.println("Nr min: " + minNum);

        int maxSum = Aufgabe2.findMaxSum(grades);
        System.out.println("Suma maxima: " + maxSum);

        int minSum = Aufgabe2.findMinSum(grades);
        System.out.println("Suma minima: " + minSum);

        int[] keyboards = {10, 20, 30};
        int[] USBs = {4, 6};
        int budget = 30;

        int cheapestKeyboard = Aufgabe4.cheapestKeyboard(keyboards);
        System.out.println("Cea mai ieftina tastatura: " + cheapestKeyboard);

        int mostExpensiveItem = Aufgabe4.mostExpensiveItem(keyboards, USBs);
        System.out.println("Cel mai scump produs: " + mostExpensiveItem);

        int mostExpensiveUSB = Aufgabe4.mostExpensiveUSBs(USBs, budget);
        System.out.println("Cel mai scump USB: " + mostExpensiveUSB);

        int maxGeldBetrag = Aufgabe4.maxGeldbetrag(keyboards, USBs, budget);
        System.out.println("Suma maxima: " + maxGeldBetrag);
    }
}
