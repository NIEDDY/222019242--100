/ define interface for a shape
interface shape{
    double calculateArea();
}
// Square class implementing the shape interface
class  Rectangle implements shape{
    private double  length;
    private double width;


    public Rectangle (double length,double width){
        this.length = length;
        this.width = width;
    }
    
    public double calculatePerimete(){
        return length*width;

    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
    }}

    // Square class extending Rectangle
    class Square extends Rectangle{
        public Square(double sidelength){
        super(sidelength,sidelength);}}
        public class Exmp {
            public static void main(String[]args){
                shape myRectangle = new Rectangle(5.0,3.0);
                shape mySquare = new Square(4.0);
                System.out.println("Rectangle Area: "+myRectangle.calculateArea());
                System.out.println("Square Area: "+ mySquare.calculateArea());
            }}