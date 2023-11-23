// Абстрактний базовий клас Figure3D
abstract class Figure3D {
    // Абстрактні методи для обчислення площі поверхні та об’єму
    public abstract double calculateSurfaceArea();

    public abstract double calculateVolume();
}

// Похідний клас Cube (куб)
class Cube extends Figure3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Cube with side length " + side;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cube cube = (Cube) obj;
        return Double.compare(cube.side, side) == 0;
    }
}

// Похідний клас Sphere (сфера)
class Sphere extends Figure3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere with radius " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Sphere sphere = (Sphere) obj;
        return Double.compare(sphere.radius, radius) == 0;
    }
}

// Додайте аналогічні класи Cone, Cylinder, TriangularPyramid як похідні від Figure3D

// Приклад використання
public class Main {
    public static void main(String[] args) {
        Figure3D[] figures = new Figure3D[]{
                new Cube(3),
                new Sphere(2.5),
                // Додайте об'єкти Cone, Cylinder, TriangularPyramid
        };

        for (Figure3D figure : figures) {
            System.out.println(figure);
            System.out.println("Surface Area: " + figure.calculateSurfaceArea());
            System.out.println("Volume: " + figure.calculateVolume());
            System.out.println("-----------------------------");
        }
    }
}
