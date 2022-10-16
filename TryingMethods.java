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
}
