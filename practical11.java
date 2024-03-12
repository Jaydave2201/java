public class practical11 {

    public static void main(String[] args) {
        shape s = new shape();
        s.area(5);
        s.area(10, 5);

    }

}

class shape {

    void area(float r) {
        System.out.println("area of circle=" + 3.14 * r * r);
    }

    void area(float l, float w) {
        System.out.println("Area of Rectangle=" + l * w);
    }

}