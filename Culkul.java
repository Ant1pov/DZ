package DZ_1;

import java.util.Scanner;

public class Culkul {
    public void diskriment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа решает дискриминант квадратного уравнения");
        System.out.print("Введите: a, b, c: ");
        double a, b, c;
        double D;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        D = b * b - 4 * a * c;
        if (D > 0){
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Корни квадратного уравнения: x1 = " + x1 + " x2 = " + x2);
        }
    }

    public double krug(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Площадь круга");
        System.out.print("Введите радиус круга: ");
        int radius = scanner.nextInt();
        double r = Math.PI * (radius * radius);
        System.out.println("Площадь равна: " + r);
        return r;
    }

    public double dlina(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Програма решает длину окружности");
        System.out.println("Введите пареметр: ");
        int rad = scanner.nextInt();
        double dlina = Math.PI * 2 * rad;
        System.out.println("Длина равна: " + dlina);
        return dlina;
    }

    public void treugol(int a, int b){
        System.out.println("Програма решает катеты и гипотенузу треугольника");
        double l = (a * b) / 2;
        System.out.println("Катеты с параметрами: " + a + " и " + b + " равны " + l);
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гтпотенуза равна: " + (a + b + c));
    }
}
