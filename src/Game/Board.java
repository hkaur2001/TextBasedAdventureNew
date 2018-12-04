package Game;

import Rooms.Room;

public class Board {

    String [][] map;
    public  Board (Room[][] map)
    {
        this.map = map;
    }

    public void fill(String str)
    {
        for(int i = 0; i < map.length; i++)
        {
            for (int n = 0; n < map[i].length; n++ )
            {
                System.out.println(Room [i][n]);
            }
        }
    }
    public String toString ()
    {
        String output = "";
        for (int i = 0; i < map.length; i++)
        {
            for (int n = 0; n <map [i].length; n++)
            {
                output = output+map[i][n];
            }
            output = output+"\n";
        }
        return output;
    }
    public void edit (String replace, int row, int column)
    {
        map[row][column] = replace;
    }
}