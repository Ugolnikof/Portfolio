package Stepic;

import java.util.Scanner;

// Программа принимает на вход координаты 2х точек и вычисляет координаты пересечения прямых, построенных по этим двум точкам
public class LinesIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки А: ");
        int k1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        System.out.println("Введите координаты точки B: ");
        int k2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        Line line1 = new Line(k1,b1);
        Line line2 = new Line(k2,b2);

        System.out.println();
        System.out.println(line1.intersection(line2));
    }
}

class Line {
    int k, b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        // если прямые параллельны
        if (this.k == other.k ) {
            return null;
        }

        // если прямые идентичны
        if (this.k == other.k && this.b == other.b) {
            return null;
        }

        // вычисление координат пересечения прямых
        int x = (other.b - this.b) / (this.k - other.k);    // точка Х пересечения двух прямых
        int y = k * x + b;    // // точка Y пересечения двух прямых

        System.out.println("Точка пересечения прямых: ");
        return new Point(x, y);
    }

}

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }
}
