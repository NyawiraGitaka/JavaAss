
public class TryingMethods {
    // This class allows for the testing of various methods.
    // acess modifier method type return type method name
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
        } else if (examScore <90 && examScore>80) {
            System.out.println("Almost there");
        } else if (examScore <=80 && examScore>70) {
            System.out.println("Good effort");
        } else if (examScore <70 && examScore>40) {
            System.out.println("You passed");
        } else  {
            System.out.println("You are not serious with academics go to madina market.");
        }
    }
}
