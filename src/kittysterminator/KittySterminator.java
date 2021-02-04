/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kittysterminator;

/**
 *
 * @author sesana.federico
 */
public class KittySterminator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] field = new char[20][20];
        
        field = initialize(field);
    }
    
    public static char[][] initialize(char[][] field) {
        for(int i = 0; i < 20; i++) //Initializes the big boi
            for(int j = 0; j < 20; j++) 
                field[i][j] = ' ';
        int x = (int) Math.random() * 20;
        int y = (int) Math.random() * 20;
        
        field[x][y] = '°'; //places a cute little kitty on the field
        
        field[19][9] = '|'; //Places a cute little nuclear missile on the field
        return field;
    }
    
}
