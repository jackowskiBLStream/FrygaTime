
public class Time {
    private String time;
    private StringBuilder stringBuilder, buffer;
    private Integer seconds;
    private Integer minutes;
    private Integer hours;

    /**
     * Constructor.
     * @param time (required) time in 88:88:88 format
     */
    public Time(String time) {
        this.time = time;
    }

    private void calculateSeconds(){
        if (seconds % 2 == 0)
            stringBuilder.append("Y ");
        else
            stringBuilder.append("O ");
    }
    private void calculateHours() {

        int numberOfRedsUpperFirst = hours / 5;
        int numberOfRedsUpperSecond = hours % 5;

        buffer = new StringBuilder(" ");
        for (int i = 0; i < 4; i++) {

            if (i < numberOfRedsUpperFirst)
                stringBuilder.append("R");
            else
                stringBuilder.append("O");

            if (i < numberOfRedsUpperSecond)
                buffer.append("R");
            else
                buffer.append("O");
        }
        stringBuilder.append(buffer);
        stringBuilder.append(" ");

    }

    private void calculateMinutes() {
        int numberOfYellowsLowerFirst = minutes / 5;
        int numberOfYellowsLowerSecond = minutes % 5;
        for (int i = 0; i < 11; i++) {

            if (i < numberOfYellowsLowerFirst) {
                if ((i + 1) % 3 == 0)
                    stringBuilder.append("R");
                else
                    stringBuilder.append("Y");
            } else
                stringBuilder.append("O");
        }
        stringBuilder.append(" ");
        for (int i = 0; i < 4; i++) {

            if (i < numberOfYellowsLowerSecond) {
                stringBuilder.append("Y");
            } else
                stringBuilder.append("O");
        }
    }

    /**
     * Function prints converted time from 88:88:88 format to X XXXX XXXX XXXXXXXXXXX XXXX
     * based on three functions that calculate each time unit
     */
    public String showTime() {
        String[] parts = time.split(":");
        stringBuilder = new StringBuilder();
        hours = Integer.parseInt(parts[0]);
        minutes = Integer.parseInt(parts[1]);
        seconds = Integer.parseInt(parts[2]);

        calculateSeconds();
        calculateHours();
        calculateMinutes();
        return stringBuilder.toString();
    }


}
