package Problem_1;

public class Properties_of_Paper_Runner {
    public static void main(String[] args) {
        Properties_of_Paper paper = new Properties_of_Paper();

        System.out.println("Width = " + paper.getWidth());
        System.out.println("Height = " + paper.getHeight());
        System.out.println("Perimeter = " + paper.getPerimeter());
        System.out.println("Lenth of the Diagonal = " + paper.getDiagonal());
    }
}