public class kwadratowe {
    public static void main(String[] args) {

    int a = 2;
    int b = 8;
    int c = -10;
    int delta = (b * b) - (4 * a * c);

        System.out.println ("delta = " + delta);

    double pierwiastek = Math.sqrt(delta);

        System.out.println ("pierwiastek z delty = " + pierwiastek);

        double x1 = (-b - pierwiastek) / (2 * a);
        double x2 = (-b + pierwiastek) / (2 * a);


               System.out.println ("x1 = " +x1);
               System.out.println ("x2 = " +x2);

   }
}
