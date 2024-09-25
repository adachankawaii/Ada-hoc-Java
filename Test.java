public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println("The radius of my circle is: " + circle.getRadius());

        Square square = new Square();
        square.setEdge(3);
        System.out.println("The edge of my square is: " + square.getEdge());
    }
}
