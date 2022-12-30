public class tasks1 {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(Remainder(1, 3));
        System.out.println(Remainder(3, 4));
        System.out.println(Remainder(-9, 45));

        System.out.println("Задание 2");
        System.out.println(Area(3, 2));
        System.out.println(Area(7, 4));
        System.out.println(Area(10, 10));

        System.out.println("Задание 3");
        System.out.println(Animals(2, 3, 5));
        System.out.println(Animals(1, 2, 3));
        System.out.println(Animals(5, 2, 8));

        System.out.println("Задание 4");
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));

        System.out.println("Задание 5");
        System.out.println(Operation(24, 15, 9));
        System.out.println(Operation(24, 26, 2));
        System.out.println(Operation(15, 11, 11));

        System.out.println("Задание 6");
        System.out.println(Ctoa('A'));
        System.out.println(Ctoa('m'));
        System.out.println(Ctoa('['));

        System.out.println("Задание 7");
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));

        System.out.println("Задание 8");
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));

        System.out.println("Задание 9");
        int[] numbs = new int[] {1, 5, 9};
        System.out.println(sumOfCubes(numbs));

        System.out.println("Задание 10");
        System.out.println(abcMath(42, 5, 10));
        System.out.println(abcMath(5, 2, 1));
        System.out.println(abcMath(1, 2, 3));
    }

    public static Integer Remainder(int a, int b) {

        return a % b;
    }


    public static Integer Area(int a, int b) {

        return (a * b)/2;
    }


    public static Integer Animals(int a, int b, int c) {
        return a * 2 + b * 4 + c * 4;
    }


    public static boolean profitableGamble(double a, double b, double c) {
        return (a * b - c) > 0;
    }


    public static String Operation(int a, int b, int c) {
        if (b + c == a) {
            return "Added";
        }

        if (b - c == a) {
            return "Subtracted";
        }

        if (b * c == a) {
            return "Multiply";
        }

        if (b % c == a) {
            return "Divide";
        }


        else {
            return "None";
        }
    }


    public static Integer Ctoa(char a) {
        int ascii =  a;
        return ascii;
    }


    public static Integer addUpTo(int a) {
        int sum = 0;
        for (int i=1; i<=a; i++) {
            sum = sum + i;
        }

        return sum;
    }


    public static Integer nextEdge(int a, int b) {
        return a + b - 1;
    }


    public static Integer sumOfCubes(int[] numbs) {
        int sum = 0;
        for (int numb : numbs) {
            sum = sum + numb * numb * numb;
        }

        return sum;
    }


    public static boolean abcMath(int a, int b, int c) {
        int sum = a;
        for (int i = 1; i == b; i++) {
            sum = sum + a;
        }

        return sum % c == 0;
    }
}
