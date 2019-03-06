public class Angle {
    private double x;
    //zad. 14
    private static final double RIGHT_ANGLE = Math.toRadians(90);
    private static final double STRAIGHT_ANGLE = Math.toRadians(180);
    private static final double FULL_ANGLE = Math.toRadians(360);
    private static final double RADIAN = 1;
    private static final double DEGREE = Math.toRadians(1);
    private static final double ARCMINUTE = Math.toRadians(1 / 60.0);
    private static final double ARCSECOND = Math.toRadians(1.0 / 3600);

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

    //zad 5.
    public Angle(String degree) {
        String[] angle = degree.split("[^\\d.]");
        int deg = Integer.parseInt(angle[0]);
        int min = Integer.parseInt(angle[1]);
        int sec = Integer.parseInt(angle[2]);
        x = Math.toRadians(deg + min / 60.0 + sec / 3600.0);
    }

    //zad. 8
    public Angle(double x, double y) {
        double tan = Math.abs(y) / Math.abs(x);
        this.x = Math.atan(tan);
    }

    public static void main(String[] args) {
        //zad. 1
        Angle angle = new Angle(1.5);

        System.out.println("Zadany kąt wynosi: " + angle.x + " rad");
        System.out.println("sinus wynosi = " + angle.sinus());
        System.out.println("cosinus wynosi = " + angle.cosinus());
        System.out.println("tangens wynosi = " + angle.tangens());
        System.out.println("cotangens wynosi = " + angle.ctan());
        System.out.println("secans wynosi = " + angle.secans());
        System.out.println("cosecnas wynosi = " + angle.cosecans());
        System.out.println();

        //zad. 2
        System.out.println("Miara kąta w radianach wynosi: " + angle.radian());
        System.out.println("Miara kąta w stopniach wynosi: " + angle.degree());
        System.out.println();

        //zad. 3
        System.out.println("Miara kąta w stopniach, minutach i sekundach: " + angle);
        System.out.println();

        //zad. 4
        Angle angle1 = new Angle(38);
        Angle angle2 = new Angle(183, 51);
        Angle angle3 = new Angle(227, 31, 14);
        System.out.println("Kąt w radianach wynosi: " + angle1.radian() + ", a w stopniach: " + angle1.degree());
        System.out.println("Kąt w radianach wynosi: " + angle2.radian() + ", a w stopniach: " + angle2.degree());
        System.out.println("Kąt w radianach wynosi: " + angle3.radian() + ", a w stopniach: " + angle3.degree());
        System.out.println();

        //zad. 5
        Angle angle4 = new Angle("105°30'15\"");
        System.out.println("Kąt w radianach: " + angle4.x + " rad");
        System.out.println();

        //zad. 6
        angle.setOfSinus(0.7071);
        System.out.println("Kąt dla podanego sinusa, kąt wynosi: " + angle);
        angle.setOfCosinus(0.7);
        System.out.println("Kąt dla podanego cosinusa, kąt wynosi: " + angle);
        angle.setOfTan(1.5);
        System.out.println("Kąt dla podanego tangensa, kąt wynosi: " + angle);
        angle.setOfCtan(1.2);
        System.out.println("Kąt dla podanego cotangensa, kąt wynosi: " + angle);
        angle.setOfSecans(14.136832902969903);
        System.out.println("Kąt dla podanego secasa, kąt wynosi: " + angle);
        angle.setOfCosecans(2.5);
        System.out.println("Kąt dla podanego cosecasa, kąt wynosi: " + angle);
        System.out.println();

        //zad. 7
        angle.setOfPoint(5, 5);
        System.out.println("Nachylenie kąta prostej przechodzącej przez początek układu współrzędnych i zadany punkt wynosi: " + angle);
        System.out.println();

        //zad. 8
        Angle angle5 = new Angle(15.3, -1);
        System.out.println("Kąt dla punktu zadanego w konstruktorze wynosi: " + angle5);
        System.out.println();

        //zad. 9
        System.out.println("Kąt dla obiektu zwróconego w statycznej metodzie wynosi: " + valueOf(1.73));
        System.out.println("Kąt dla obiektu zwróconego w statycznej metodzie wynosi: " + valueOf(2));
        System.out.println("Kąt dla obiektu zwróconego w statycznej metodzie wynosi: " + valueOf(12, 54).x + " rad");
        System.out.println("Kąt dla obiektu zwróconego w statycznej metodzie wynosi: " + valueOf(13, 37).x + " rad");
        System.out.println("Kąt dla obiektu zwróconego w statycznej metodzie wynosi: " + valueOf(81, 13, 31).x + " rad");
        System.out.println("Kąt dla obiektu zwróconego w statycznej metodzie wynosi: " + valueOf("67°14'55\"").x + " rad");
        System.out.println("Kąt dla obiektu zwróconego w statycznej metodzie wynosi: " + valueOf(-2.5, 8.7));
        System.out.println();

        //zad. 10
        System.out.println("Kąt wynosi: " + angle);
        System.out.println("Po dodaniu wynosi: " + angle.add(1.4));
        System.out.println("Po odjęciu wynosi: " + angle.sub(1.4));
        System.out.println();

        //zad. 11
        System.out.println("Suma dwóch obiektów (ich kątów wynosi: " + sum(angle, angle2));
        System.out.println("Różnica dwóch obiektów (ich kątów wynosi: " + diff(angle, angle2));
        System.out.println();

        //zad. 12
        System.out.println("Kąt wynosi: " + angle);
        System.out.println("Po mnożeniu wynosi: " + angle.mult(1.4));
        System.out.println("Po dzieleniu wynosi: " + angle.div(3.5));
        System.out.println();

        //zad. 13
        System.out.println("Kąt nowego obiektu powstałego przez mnożenie wynosi: " + prod(angle, 6.7));
        System.out.println("Kąt nowego obiektu powstałego przez dzielenie wynosi: " + quot(angle, 1.1));
        System.out.println();

        //zad. 14 zwrócona wartość obiektów dla lepszego wyświetlenia stałych
        System.out.println("Stałe wartości obiektów:");
        System.out.println("Kąt prosty: " + valueOf(RIGHT_ANGLE));
        System.out.println("Kąt półpełny: " + valueOf(STRAIGHT_ANGLE));
        System.out.println("Kąt pełny: " + valueOf(FULL_ANGLE));
        System.out.println("Kąt 1 radian: " + RADIAN);
        System.out.println("Kąt 1 stopień: " + valueOf(DEGREE));
        System.out.println("Kąt 1 minuta kątowa: " + valueOf(ARCMINUTE));
        System.out.println("Kąt 1 sekunda kątowa: " + valueOf(ARCSECOND));
        System.out.println();

        //zad. 15
        System.out.println("Zadany kąt wynosi: " + angle);
        System.out.println("Kąt dopełniający wynosi: " + compl(angle));
        System.out.println("Kąt przylegający wynosi: " + suppl(angle));
        System.out.println();

        //zad. 16
        System.out.println("Kąt dla podanego łańcucha znaków wynosi: " + inputAngle("37"));
        System.out.println("Kąt dla podanego łańcucha znaków wynosi: " + inputAngle("37.98654"));
        System.out.println("Kąt dla podanego łańcucha znaków wynosi: " + inputAngle("31°22'13\""));
        System.out.println();

        System.out.println(findBeta(37.5));
        System.out.println();

        //zad. 17
        System.out.println(findAlfa(14));
        System.out.println();

        //zad. 18
        System.out.println(findDegrees(5.2, 6.5));
        System.out.println();

        //zad. 19
        System.out.println(findDegrees2(10, 3));
        System.out.println();

        //zad. 20
        System.out.println(findDegrees3(6, 5, 4));

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

    //zad. 6
    public void setOfSinus(double sin) {
        x = Math.asin(sin);
    }

    public void setOfCosinus(double cos) {
        x = Math.acos(cos);
    }

    public void setOfTan(double tan) {
        x = Math.atan(tan);
    }

    public void setOfCtan(double ctan) {
        x = Math.PI / 2 - Math.atan(ctan);
    }

    public void setOfSecans(double sec) {
        double cos = 1 / sec;
        x = Math.acos(cos);
    }

    public void setOfCosecans(double cosec) {
        double sin = 1 / cosec;
        x = Math.asin(sin);
    }

    //zad. 7
    public void setOfPoint(double x, double y) {
        double tan = Math.abs(y) / Math.abs(x);
        this.x = Math.atan(tan);
    }

    //zad. 9
    public static Angle valueOf(double x) {
        return new Angle(x);
    }

    public static Angle valueOf(int deg) {
        return new Angle(deg);
    }

    public static Angle valueOf(int deg, int min) {
        return new Angle(deg, min);
    }

    public static Angle valueOf(int deg, int min, int sec) {
        return new Angle(deg, min, sec);
    }

    public static Angle valueOf(String angle) {
        return new Angle(angle);
    }

    public static Angle valueOf(double x, double y) {
        return new Angle(x, y);
    }

    //zad. 10
    public Angle add(double aRad) {
        return new Angle(this.x + aRad);
    }

    public Angle sub(double aRad) {
        return new Angle(this.x - aRad);
    }

    //zad. 11
    public static Angle sum(Angle angle1, Angle angle2) {
        return new Angle(angle1.x + angle2.x);
    }

    public static Angle diff(Angle angle1, Angle angle2) {
        return new Angle(angle1.x - angle2.x);
    }

    //zad. 12
    public Angle mult(double a) {
        return new Angle(this.x * a);
    }

    public Angle div(double a) {
        return new Angle(this.x / a);
    }

    //zad. 13
    public static Angle prod(Angle angle, double a) {
        return new Angle(angle.x * a);
    }

    public static Angle quot(Angle angle, double a) {
        return new Angle(angle.x / a);
    }

    //zad. 15
    public static Angle compl(Angle angle) {
        return new Angle(Math.toRadians(90) - angle.x);
    }

    public static Angle suppl(Angle angle) {
        return new Angle(Math.toRadians(180) - angle.x);
    }

    //zad. 16
    public static Angle inputAngle(String str) {
        if (str.contains(".")) {
            return new Angle(Math.toRadians(Double.parseDouble(str)));
        } else if (str.contains("\u00b0")) {
            return new Angle(str);
        } else {
            return new Angle(Integer.parseInt(str));
        }
    }

    public static boolean findBeta(double alfa) {
        double beta = (180 - alfa) / 2;
        System.out.println("Dla kąta przy wierzchołku wynoszącym " + alfa + ", kąt przy podstawie w trójkącie równoramiennym wynosi " + beta);
        System.out.print("Czy suma kątów w trójkącie jest równa 180? ");
        return (2 * beta + alfa) == 180;
    }

    //zad. 17
    public static boolean findAlfa(double beta) {
        double alfa = (180 - 2 * beta);
        System.out.println("Dla kąta przy podstawie wynoszącym " + beta + ", kąt przy wierzchołku w trójkącie równoramiennym wynosi " + alfa);
        System.out.print("Czy suma kątów w trójkącie jest równa 180? ");
        return (2 * beta + alfa) == 180;
    }

    //zad. 18
    public static boolean findDegrees(double a, double b) {
        double beta = Math.toDegrees(Math.acos((a / 2) / b));
        double alfa = (180 - 90 - beta) * 2;
        System.out.println("W trójkącie równoramiennym o podstawie " + a + " i ramionach " + b + ", kąty wynoszą " + alfa + ", " + beta + ", " + beta + " st.");
        System.out.print("Czy suma kątów w trójkącie jest równa 180? ");
        return (2 * beta + alfa) == 180;
    }

    //zad. 19
    public static boolean findDegrees2(double a, double h) {
        double beta = Math.toDegrees(Math.atan(h / (a / 2)));
        double alfa = (180 - 90 - beta) * 2;
        System.out.println("W trójkącie równoramiennym o podstawie " + a + " i wysokości " + h + ", kąty wynoszą " + alfa + ", " + beta + ", " + beta + " st.");
        System.out.print("Czy suma kątów w trójkącie jest równa 180? ");
        return (2 * beta + alfa) == 180;
    }

    // zad. 20
    public static boolean findDegrees3(double a, double b, double c) {
        double cosGamma = (c * c - a * a - b * b) / (-2 * a * b);
        double gamma = Math.toDegrees(Math.acos(cosGamma));
        double cosBeta = (b * b - a * a - c * c) / (-2 * a * c);
        double beta = Math.toDegrees(Math.acos(cosBeta));
        double cosAlfa = (a * a - c * c - b * b) / (-2 * c * b);
        double alfa = Math.toDegrees(Math.acos(cosAlfa));
        System.out.println("W dowolnym trójkącie o bokach " + a + " " + b + " " + c + ", kąty wynoszą " + alfa + ", " + beta + ", " + gamma + " st.");
        System.out.print("Czy suma kątów w trójkącie jest równa 180? ");
        return (alfa + beta + gamma) == 180;
    }
}
