public class TriangleMethode {

    boolean isRightTriangle(Triangle triangle) {
        boolean b = triangle.lenghtA * triangle.lenghtA * triangle.lenghtB * triangle.lenghtB == triangle.lenghtC * triangle.lenghtC;
        return b;
    }
}
