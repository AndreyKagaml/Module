package level1;
import java.util.Scanner;

public class Horse {

    public int x;
    public int y;
    public int toX;
    public int toY;



    public Horse(){
        this.x=0;
        this.y=0;
    }

    public boolean RunHorse(int toX, int toY){
        if( (toX==x-2 && (toY==y-1 || toY==y+1)) || (toX==x+2 && (toY==y-1 || toY==y+1)) ) { x=toX; y=toY; return true;}
        else if ( (toX==x-1 && (toY==y-2 || toY==y+2)) || (toX==x+1 && (toY==y-2 || toY==y+2)) ) { x=toX; y=toY; return true;}
        else return false;
    }

    public void InputCoordinate(){
        Scanner in = new Scanner(System.in);
         do{
            toX = in.nextInt();
            toY = in.nextInt();
            System.out.println(RunHorse( toX, toY));
        }while (RunHorse( toX, toY));
    }

}
