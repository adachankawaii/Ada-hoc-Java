public class VectorMain {
    public static void main(String[] args) {
        Vector vector_1 = new Vector(2, 3, 4);
        Vector vector_2 = new Vector(2, 3, 4); 
        
        System.out.println("Vector 1: " + vector_1);
        System.out.println("Vector 2: " + vector_2);  
        
        int n = 2;

        System.out.println("Sum of two vectors is: " + vector_1.addTwoVector(vector_2));
        System.out.println("Difference of two vectors is: " + vector_1.subtractTwoVector(vector_2));     
        System.out.println("Product of vector 1 with " + n + " is: " + vector_1.multiplyWithNum(n));
        System.out.println("Scalar product of two vectors is: " + vector_1.scalarMultiply(vector_2));
    }
}
