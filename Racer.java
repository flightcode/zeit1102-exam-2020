public class Racer { //Made abstract if you were intending on only using it to create subclasses (As a template for subclasses). Not used if you are intending on instantiating classes of 'Racer'.
    private String name;
    private float time1;
    private float time2;

    public Racer(String name, float time1, float time2) {
        this.name = name;
        this.time1 = time1;
        this.time2 = time2;
    }

    public void setTime1(float time) {
        this.time1 = time;
    }

    public void setTime2(float time) {
        this.time2 = time;
    }

    public String getName() {
        return this.name;
    }

    public float getTime1() {
        return this.time1;
    }

    public float getTime2() {
        return this.time2;
    }

    public float getFastestTime() {
        if(this.time1 < this.time2) {
            return this.time1;
        } else {
            return this.time2;
        }
    }

    public String toString() {
        return this.name + ": " + this.getFastestTime() + "; ";
    }
}
