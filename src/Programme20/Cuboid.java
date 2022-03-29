package Programme20;

public class Cuboid extends Rectangle {

    double height;
    public Cuboid(double width, double length, double height){
        super(width, length);
        if(this.height< 0){
            this.height= 0;
        } else {
            this.height= height;
        }
            }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return super.getArea()* height;
    }
}
