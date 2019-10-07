public class TriangleMethode {

    boolean isRightTriangle(Triangle triangle) {
        boolean b = ((triangle.lenghtA * triangle.lenghtA * triangle.lenghtB * triangle.lenghtB) == (triangle.lenghtC * triangle.lenghtC))
                || ((triangle.lenghtA * triangle.lenghtA * triangle.lenghtC * triangle.lenghtC) == (triangle.lenghtB * triangle.lenghtB))
                || ((triangle.lenghtB * triangle.lenghtB * triangle.lenghtC * triangle.lenghtC) == (triangle.lenghtA * triangle.lenghtA));
        return b;
    }
}
