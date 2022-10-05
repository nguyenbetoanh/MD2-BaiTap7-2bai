package rikkei.academy;

public class Main {

    public static void main(String[] args) {
	    // Kiểm thử class Shape
        System.out.println("----------SHAPE--------------");
        Shape[] shape = new Shape[4];
        shape[0]=new Circle(5,"blue",true);
        shape[1]=new Circle(10,"green",true);

        shape[2]= new Square(5,"yelllow",false);
        shape[3]= new Rectangle(5,44,"yelllow",false);
        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i]);
        }
        System.out.println("--------------sau khi thay doi---------------");
        for (int i = 0; i < shape.length; i++) {
            shape[i].resize(Math.floor(Math.random()*100));
            System.out.println(shape[i]);

        }

    }
}
