package Stepic;

import java.util.Scanner;
import java.lang.*;

// Программа принимает на вход координаты 3х точек и вычисляет площадь треугольника, построенного по этим трём точкам
public class TriangleArea {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки А: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Введите координаты точки B: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println("Введите координаты точки C: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // создаю 3 новых объекта-точки
        TrianglePoint a = new TrianglePoint (x1, y1);
        TrianglePoint b = new TrianglePoint (x2, y2);
        TrianglePoint c = new TrianglePoint (x3, y3);

        // создаю новый объект-треугольник по трем точкам
        Triangle triangle = new Triangle(a, b, c);

        System.out.println();
        System.out.println(triangle.area());
    }
}

// класс Треугольник
class Triangle {
    TrianglePoint a, b, c;

    public Triangle(TrianglePoint a, TrianglePoint b, TrianglePoint c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // метод получения площади треугольника
    public double area() {
        // вычислаю длину каждой стороны
        double A = Math.sqrt( Math.pow((a.getX() - b.getX()), 2) +  Math.pow((a.getY() - b.getY()), 2) );
        double B = Math.sqrt( Math.pow((b.getX() - c.getX()), 2) +  Math.pow((b.getY() - c.getY()), 2) );
        double C = Math.sqrt( Math.pow((a.getX() - c.getX()), 2) +  Math.pow((a.getY() - c.getY()), 2) );
        double P = (A + B + C)/2; // полупериметр треугольника
        double S = Math.sqrt(P * (P - A) * (P - B) * (P - C)); // площадь треугольника

        if ( (((A + B) < C) || ((A + C) < B) || ((B + C) < A)) || S == 0 ) {
            System.out.println("Треугольник не существует");
            System. exit(0);
        }
        System.out.print("Площадь треугольника = ");
        return S;
    }

}

// класс Точка
class TrianglePoint {
    private double x;
    private double y;

    public TrianglePoint(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    // метод получения координаты Х
    public double getX() {
        return x;
    }

    // метод получения координаты Y
    public double getY() {
        return y;
    }
}

