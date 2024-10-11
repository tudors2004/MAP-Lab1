public class Aufgabe1 {
    public static int[] getInsufficientGrades(int[] grades) {
        int counter = 0;
        for(int grade : grades){
            if(grade < 40){
                counter++;
            }
        }
        int[] insufficientGrades = new int[counter];
        int index = 0;
        for(int grade : grades){
            if (grade < 40) {
                insufficientGrades[index++] = grade;
            }
        }
        return insufficientGrades;
    }
    public static double calculateMean(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return Math.round((double) sum / grades.length * 100.0) / 100.0;
    }
    public static int[] roundGrades(int[] grades){
        int[] roundedGrades = new int[grades.length];
        for(int i = 0; i < grades.length; i++){
            int grade = grades[i];
            if (grade >= 38) {
                if(grade % 5 == 0){
                    roundedGrades[i] = grade;
                }
                else if(grade % 5 < 2.5){
                    grade = grade - grade % 5;
                }
                else{
                    grade = grade + (5 - grade % 5);
                }
            }
            roundedGrades[i] = grade;
        }
        return roundedGrades;
    }
    public static int getMaxGrade(int[] grades) {
        int[] roundedGrades = roundGrades(grades);
        int max = roundedGrades[0];
        for(int i = 0; i < roundedGrades.length; i++) {
            if (roundedGrades[i] > max) {
                max = roundedGrades[i];
            }
        }
        return max;
    }
}
