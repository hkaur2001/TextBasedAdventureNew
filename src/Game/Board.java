package Game;

import Rooms.Room;

public class Board {
    private Room[][] map;
    private int length;
    private int width;

    public Board(Room[][] map) {
        this.map = map;
        this.width = width;
        this.length = length;
    }
    public Board(int length, int width){
        this.map = new Room [length][width];
    }

    public Room[][] getBoard(){
        return this.map;
    }

    public void print() {
        String row= "";
        for(int i=0; i<map.length; i++) {
            row= "";
            for(int j=0; j<map[i].length; j++) {
                row+= map[i][j].toString();
            }
            System.out.println(row);
        }
    }
}

