package DSA.stackQueue;

import java.util.Stack;

public class Celibrity {

    public static void main(String args []){
        int[][] b = getMatrix();
        int n = b.length;
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<n;i++){
            stack.push(i);
        }

        while(stack.size() != 1){

            int a = stack.peek();
            stack.pop();

            int c = stack.peek();
            stack.pop();

            if(b[a][c] == 1)
                stack.push(c);

            if(b[c][a] == 1)
                stack.push(a);
        }

        int prospect = stack.peek();
        int rowCount = 0;
        int columnCount = 0;
        boolean prospectFlag = false;

        for(int i=0;i<n;i++){
            if(b[prospect][i] == 0)
                rowCount ++;
        }

        for(int i=0;i<n;i++){
            if(b[i][prospect] == 1)
                columnCount++;
        }

        if(columnCount == n-1 && rowCount ==n)
            prospectFlag = true;

        if(prospectFlag == true)
            System.out.println(prospect);
        else
            System.out.println(-1);

    }

    public static int[][] getMatrix(){
        int[][] a = {{0,0,1},
                {0,0,1},
                {0,0,0}};
        return a;
    }
}
