
public class Angle {



    public static void main(String[] args) {
    }
//  zadanie 1

    private double x = 180.0;

    public Angle(double x) {

    }

    public double sin() {
        double sin = Math.sin(x);
        return sin;

    }

    public double cos() {
        double cos = Math.cos(x);
        return cos;
    }

    public double tg() {
        double tg = Math.tan(x);
        return tg;
    }

    public double ctg() {
        double ctg = Math.cos(x) / Math.sin(x);
        return ctg;
    }

    public double secans() {
        double secans = 1.0 / Math.cos(x);
        return secans;
    }

    public double cosecans() {
        double cosecans = 1.0 / Math.sin(x);
        return cosecans;
    }

//  zadanie 2
    public double radian () {
        double angleToRadian = Math.toRadians(x);
        return angleToRadian;
    }

    public double degree(){
        double angleToDegree = Math.toRadians(x);
        return angleToDegree;
    }

//  zadanie 3
    @Override
    public String toString() {
        return super.toString();
    }

//  zadanie 4



    public Angle(){

        this.degrees = 105;
        this.minutes = 30;
        this.seconds = 15;
    }

    public Angle(int degrees){
    this.degrees = degrees;

}
    public Angle(int degrees, int minutes ){
        this.degrees = degrees;
        this.minutes = minutes;


    }
    public Angle(int degrees, int minutes, int seconds ){
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}






