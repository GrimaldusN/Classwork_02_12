// Нарушение SOLID:
//public class Shape {
//    public enum Type { CIRCLE, SQUARE }
//
//    private Type type;
//
//    public Shape(Type type) {
//        this.type = type;
//    }
//
//    public double calculateArea() {
//        if (type == Type.CIRCLE) {
//            // Вычисление площади круга
//        } else if (type == Type.SQUARE) {
//            // Вычисление площади квадрата
//        }
//        return 0.0;
//    }
//}

public class Shape {
    private enum Type { CIRCLE, SQUARE }

    private Type type;

    private double radius;
    private double sideLength;

    public Shape(Type type, double radius, double sideLength) {
        this.type = type;
        this.radius = radius;
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        if (type == Type.CIRCLE) {
            // Вычисление площади круга
        } else{
            // Вычисление площади квадрата
        }
        return 0.0;
    }
}
