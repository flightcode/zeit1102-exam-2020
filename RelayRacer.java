public class RelayRacer extends Racer {
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private float time1;
    private float time2;
    private float time3;
    private float time4;

    public RelayRacer(String name1, String name2, String name3, String name4, float time1, float time2, float time3, float time4) {
        super(name1, time1, time2);
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.time1 = time1;
        this.time2 = time2;
        this.time3 = time3;
        this.time4 = time4;
    }

    public void setTime1(float time) {
        this.time1 = time;
    }

    public void setTime2(float time) {
        this.time2 = time;
    }

    public void setTime3(float time) {
        this.time3 = time;
    }

    public void setTime4(float time) {
        this.time4 = time;
    }

    public float getTime1() {
        return this.time1;
    }

    public float getTime2() {
        return this.time2;
    }

    public float getTime3() {
        return this.time3;
    }

    public float getTime4() {
        return this.time4;
    }

    public float getFastestTime() {
        return this.time1 + this.time2 + this.time3 + this.time4;
    }

    public float averageTime() throws IncompleteTimes {
        if(this.time1 <= 0 || this.time2 <= 0 || this.time3 <= 0 || this.time4 <= 0) {
            throw new IncompleteTimes("One or more times invalid.");
        }
        return (this.time1 + this.time2 + this.time3 + this.time4)/4;
    }

    public String toString() {
        return this.name1 + ", " + this.name2 + ", " + this.name3 + ", " + this.name4 + ": " + this.getFastestTime() + "; ";
    }
}
