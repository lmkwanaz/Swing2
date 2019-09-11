package Model;

import java.util.*;

public class Map {

    static char[][] battleMap = new char[9][9];
    // public int x = (Hero.getLevel() - 1 )*5+10-( Hero.getLevel() % 2 );
    // public int y = (Hero.getLevel() - 1 )*5+10-( Hero.getLevel() % 2 );


    public char FetchMap(int x, int y)
    {
        return (battleMap[y][x]);
    }
    public int LengthX()
    {
        return (battleMap.length - 1);
    }
    public int HeightY()
    {
        return (battleMap[0].length - 1);
    }

    public void PutinMap(int x, int y, char nameChar)
    {
        battleMap[x][y] = nameChar;
    }
    public static void buildMap() {
        for(char[] row : battleMap) {
            Arrays.fill(row, '*');
        }
    }
    public static void rawMap() {
        int line = 1;
        while(line <= 27) {
            System.out.print('-');
            line++;
        }
        System.out.println();
        for(int i = 0; i < battleMap.length; i++) {
            for(int j = 0; j < battleMap[i].length; j++) {
                System.out.print("|" + battleMap[i][j] + "|");
            }
            System.out.println();
        }
        line = 1;
        while(line <= 27) {
            System.out.print('-');
            line++;
        }
        System.out.println();

    }

    public void ChangeMap(int x, int y, char player)
    {
        for(int i = 0; i < battleMap.length; i++) {
            for(int j = 0; j < battleMap[i].length; j++) {
                if (battleMap[i][j] == player) {
                    battleMap[i][j] = '*';
                    battleMap[y][x] = player;
                    break;
                }
            }
        }
    }
}
