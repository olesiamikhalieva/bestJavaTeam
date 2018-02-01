package hw__26_01_18.task15;

public class Array {

    protected int[]massConst;
    protected String[]massVar;

    public Array(int c0, int c1, int c2, String x1, String x2){
        massConst = new int [3];
        massConst[0]=c0;
        massConst[1]=c1;
        massConst[2]=c2;

        massVar = new String[2];
        massVar[0]=x1;
        massVar[1]=x2;
    }
}

