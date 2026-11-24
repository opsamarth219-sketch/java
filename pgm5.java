interface Resizable
    {
        void resizeWidth(int width);
        void resizeHeight(int height);
    }
class Rectangle implements Resizable
{
    private int width;
    private int height;
    public Rectangle(int width ,int height)
    {
        this.width = width;
        this.height = height;


    }
    @Override 
    public void resizeWidth(int width)
    {
        if(width >0)
        {
            this.width = width;
        }
        else{
            System.out.println("Invalid width. Width must be greater than 0 .");
        }

    }
    @Override
    public void resizeHeight(int height)
    {
        if(height>0)
        {
            this.height = height;
        }
        else{
            System.out.println("Hright must be greater than 0");
        }
    }
    public void display(){
        System.out.println("Rectangle.Width = "+width+",Height ="+height);
    }
}

    
    
    
    
    public class pgm5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);

        System.out.println("Original Rectangle ");
        rectangle.display();

        rectangle.resizeWidth(20);
        rectangle.resizeHeight(10);

        System.out.println("Resized Rectangle: ");
        rectangle.display();
    }
    
}
