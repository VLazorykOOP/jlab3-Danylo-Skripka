// Інтерфейс для фігур 3D
interface Figure3D {
    // Методи для обчислення площі поверхні та об’єму
    double calculateSurfaceArea();
    double calculateVolume();
}

// Клас Cube (куб) реалізує інтерфейс Figure3D
class Cube implements Figure3D {
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

// Клас Sphere (сфера) реалізує інтерфейс Figure3D
class Sphere implements Figure3D {
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

// Додайте аналогічні класи Cone, Cylinder, TriangularPyramid, які реалізують інтерфейс Figure3D

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
