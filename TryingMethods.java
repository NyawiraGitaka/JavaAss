public class TryingMethods {
    // This class allows for the testing of various methods.
    // acess modifier method type return type method name
    public static void main(String[] args) {
        System.out.println(sumNumbersLessThan());
        System.out.println(sumEven());

        TryingMethods tryingMethod = new TryingMethods();
        for (int j = 1; j<8; j++) {
            System.out.println(tryingMethod.dayOfWeek(j));
        }
        

        tryingMethod.examResult(90);
        tryingMethod.examResult(80);
        tryingMethod.examResult(70);
        tryingMethod.examResult(60);

        
    }

    public String dayOfWeek(int day) {
        
        String dayofweek = "";
        switch (day) {
            case 1:
                dayofweek = "Sunday";
                break;
            case 2:
                dayofweek = "Monday";
                break;
            case 3:
                dayofweek = "Tuesday";
                break;
            case 4:
                dayofweek = "Wednesday";
                break;
            case 5:
                dayofweek = "Thursday";
                break;
            case 6:
                dayofweek = "Friday";
                break;
            case 7:
                dayofweek = "Monday";
                break;
            default:
                dayofweek = "Invalid entry";
                break;
        }
        return dayofweek;
    }

    public void examResult(int examScore) {
        if (examScore >= 90) {
            System.out.println("You are a genius.");
        } else if (examScore < 90 && examScore > 80) {
            System.out.println("Almost there");
        } else if (examScore <= 80 && examScore > 70) {
            System.out.println("Good effort");
        } else if (examScore < 70 && examScore > 40) {
            System.out.println("You passed");
        } else {
            System.out.println("You are not serious with academics go to madina market.");
        }
    }

    public static int sumNumbersLessThan() {
        int sum = 0;
        int check = 1;
        while (check < 1000) {
            sum += check;
            check++;
        }
        return sum;
    }
    public static int sumEven() {
        int evenSum = 0;
        for (int j = 13; j<103; j++) {
            if(j % 2 == 0){
                evenSum +=j;
            }
        }
        return evenSum;
    }
}
