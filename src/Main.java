public class Main {
    enum Shape {
        SQUARE, RECTANGLE, CIRCLE, TRAPEZOID, RHOMBUS, TRIANGLE, OVAL, HEXAGON
    }

    public static void main(String[] args) {

        for (Shape shape : Shape.values()) {
            System.out.println("Constant: " + shape +
                    ", Initial Value: " + getInitialValue(shape) +
                    ", Ordinal Value: " + shape.ordinal());
        }
    }


    private static String getInitialValue(Shape shape) {
        switch (shape) {
            case SQUARE:
                return "4 equal sides";
            case RECTANGLE:
                return "2 pairs of equal sides";
            case CIRCLE:
                return "Round shape";
            case TRAPEZOID:
                return "At least one pair of parallel sides";
            case RHOMBUS:
                return "4 equal sides with equal opposite angles";
            case TRIANGLE:
                return "3 sides";
            case OVAL:
                return "Elongated round shape";
            case HEXAGON:
                return "6 equal sides";
            default:
                return "Unknown shape";
        }
    }
}
