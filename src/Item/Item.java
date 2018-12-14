package Item;

public abstract class Item {
    String ItemName;
    int xLoc, yLoc;


    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }


    public Item(String ItemName, int xLoc, int yLoc)
        {
        this.ItemName = ItemName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        }
}