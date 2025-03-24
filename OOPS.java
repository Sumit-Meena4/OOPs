public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen(); //Created a pen object 
        p1.setColor("Orange");
        System.out.println(p1.color);
        p1.setTip(4);
        System.out.println(p1.tip);

    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newtip){
        tip = newtip;
    }
}