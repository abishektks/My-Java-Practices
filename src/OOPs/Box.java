package OOPs;

class Box {
    private int length;
    private int height;
    private int breadth;

    Box(int l,int h,int b){
        length = l;
        height = h;
        breadth = b;
    }

    public void setLength(int l){
        length = l;
    }
    public int getLength(){
        return length;
    }

    public void setBreadth(int b){
        breadth = b;
    }
    public int getBreadth(){
        return breadth;
    }

    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }
}
