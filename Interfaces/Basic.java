public class Basic {
    interface Area {
        final float pi = 3.14F;
        float displayarea(float x, float y);
    }

    class Rectangle implements Area {
        public float displayarea(float x, float y) {
            return x * y;
        }
    }

    class Circle implements Area {
        // Since it's a circle, only the radius (x) is needed, so the second parameter (y) is unnecessary.
        public float displayarea(float x, float y) {
            return pi * x * x;  // Area of a circle = π * r²
        }
    }

    public static void main(String[] args) {
        Basic basic = new Basic();
        Rectangle rec = basic.new Rectangle();
        Circle circ = basic.new Circle();

        Area area;
        area = rec;
        System.out.printf("Rectangle Area is: %.2f\n", area.displayarea(12, 2));

        area = circ;
        System.out.printf("Circle Area is: %.2f\n", area.displayarea(5, 0)); // Radius = 5
    }
}
