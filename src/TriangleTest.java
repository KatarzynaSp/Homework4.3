public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(25, 24, 7);
        TriangleMethode triangleMethode = new TriangleMethode();

        boolean c = triangleMethode.isRightTriangle(triangle);
        System.out.println(c);
    }
}