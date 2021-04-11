package controlflowstatements;

public class SwithcExample {

    public static void main(String[] args) {

        int m=4;
        String month;
        switch (m){
            case 1: month="Jan";
            break;
            case 2: month="Feb";
            break;
            case 3: month="March";
            break;
            case 4: month="April";
            break;
            case 5: month="May";
            break;
            case 6: month="June";
            break;
            default: month = "Invalid Month";
            break;
        }
        System.out.println(month);
    }
}
