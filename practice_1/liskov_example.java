
abstract class Shape {
    public abstract int getArea();
}

class Rectangle extends Shape {
    private int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void setWidth(int width) { this.width = width; }
    void setHeight(int height) { this.height = height; }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square extends Shape {
    private int side;

    Square(int side) { this.side = side; }
    void setSide(int side) { this.side = side; }

    @Override
    public int getArea() {
        return side * side;
    }
}

class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        Shape square = new Square(4);

        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());
    }
}