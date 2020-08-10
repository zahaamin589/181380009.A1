public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){

    }
    public Rectangle(double w,double h){
        this.width=w;
        this.height=h;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public double getArea(){
        double area=height*width;
        return area;
    }
    public double getPerimeter(){
        double perimeter=2*(height*width);
        return perimeter;
    }

}

