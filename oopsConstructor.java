import javax.sound.midi.MidiChannel;
class Cylinder{
    public double radius;
    public double height;
    public Cylinder(){
        radius = 1;
        height = 1;
    }
    public Cylinder(double r, double h){
    radius=r;
        height=h;
    }
    public double area(){
        return Math.PI * radius * radius * height;
    }
    public String dimension(){
        return "radius "+radius+"\n" +"height "+ height +"\n";

    }
}

public class oopsConstructor {
    public static void main(String[] args) {
        Cylinder c =  new Cylinder();

        //Cylinder c =  new Cylinder(5,5);
        System.out.println("Area is: "+ c.area());
        System.out.println("Radius "+c.dimension());
        //System.out.println("height "+c);
        
    }
}
