class Shape {
    int height;
    int width;

    Shape() {
        this(0, 0);
    }

    Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    void display() {
        System.out.println("Height:" + height);
        System.out.println("Width:" + width);
    }
}

public class pratical8 {
    public static void main(String[] args) {
        Shape s = new Shape(10, 20);
        s.display();
    }
}
