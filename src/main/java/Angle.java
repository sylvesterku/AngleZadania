public class Angle {
    private double x;

    //zad. 1
    public Angle(double x) {
        this.x = x;
    }

    //zad. 4
    public Angle(int deg) {
        this.x = Math.toRadians(deg);
    }

    public Angle(int deg, int min) {
        this.x = Math.toRadians(deg + min / 60.0);
    }

    public Angle(int deg, int min, int sec) {
        this.x = Math.toRadians(deg + min / 60.0 + sec / 3600.0);
    }

    public static void main(String[] args) {
        //zad. 1
        Angle angle = new Angle(1.5);

        System.out.println("sinus wynosi = " + angle.sinus());
        System.out.println("cosinus wynosi = " + angle.cosinus());
        System.out.println("tangens wynosi = " + angle.tangens());
        System.out.println("cotangens wynosi = " + angle.ctan());
        System.out.println("secans wynosi = " + angle.secans());
        System.out.println("cosecnas wynosi = " + angle.cosecans());

        //zad. 2
        System.out.println("Miara kąta w radianach wynosi: " + angle.radian());
        System.out.println("Miara kąta w stopniach wynosi: " + angle.degree());

        //zad. 3
        System.out.println("Miara kąta w stopniach, minutach i sekundach: " + angle);

        //zad. 4
        Angle angle1 = new Angle(38);
        Angle angle2 = new Angle(183, 51);
        Angle angle3 = new Angle(227, 31, 14);
        System.out.println("Kąt w radianach wynosi: " + angle1.radian() + ", a w stopniach: " + angle1.degree());
        System.out.println("Kąt w radianach wynosi: " + angle2.radian() + ", a w stopniach: " + angle2.degree());
        System.out.println("Kąt w radianach wynosi: " + angle3.radian() + ", a w stopniach: " + angle3.degree());

    }

    // zad. 1
    public double sinus() {
        return Math.sin(x);
    }

    public double cosinus() {
        return Math.cos(x);
    }

    public double tangens() {
        return Math.tan(x);
    }

    public double ctan() {
        return 1 / Math.tan(x);
    }

    public double secans() {
        return 1 / Math.cos(x);
    }

    public double cosecans() {
        return 1 / Math.sin(x);
    }

    //zad. 2
    public double radian() {
        return x;
    }

    public double degree() {
        return Math.toDegrees(x);
    }

    //zad. 3
    public String toString() {
        double seconds = degree() / (1.0 / 3600);
        int deg = (int) (seconds / 3600.0);
        seconds = seconds - deg * 3600;
        int min = (int) seconds / 60;
        seconds = seconds - min * 60;
        StringBuilder sb = new StringBuilder();
        sb.append(deg + "\u00b0");
        sb.append(min + "'");
        sb.append((int) seconds + "\"");

        return sb.toString();
    }
}
