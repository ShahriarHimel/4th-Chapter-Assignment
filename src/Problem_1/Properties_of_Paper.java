package Problem_1;

public class Properties_of_Paper {
    public double width,height,perimeter,diagonal;

    public double getWidth() {
        width = Constants.paper_width * Constants.inch_to_mm;
        return width;
    }
    public double getHeight() {
        height = Constants.paper_height * Constants.inch_to_mm;
        return height;
    }
    public double getPerimeter() {
        perimeter = 2 * (height + width);
        return perimeter;
    }
    public double getDiagonal() {
        diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
        return diagonal;
    }
}