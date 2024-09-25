public class Vector {
    public double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }

    public double getX() {return this.x;}
    public double getY() {return this.y;}
    public double getZ() {return this.z;}    


    public Vector addTwoVector(Vector vector) {
        return new Vector(this.x + vector.getX(), this.y + vector.getY(), this.z + vector.getZ());      
    }

    public Vector subtractTwoVector(Vector vector) {
        return new Vector(this.x - vector.getX(), this.y - vector.getY(), this.z - vector.getZ());      
    }

    public Vector multiplyWithNum(double n) {
        return new Vector(n*this.x, n*this.y, n*this.z);      
    }

    public double scalarMultiply(Vector vector) {
        return this.x * vector.getX() + this.y*vector.getY() + this.z*vector.getZ();         
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }

}
