import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bonus {

    private int[][] directii={{1,0},{-1,0},{0,1},{0,-1}};
    private List<String> solution= new ArrayList<String>();

    private int longestPath;
    private int len;

    public Bonus(String[][] neighbours)
    {
        int row=neighbours.length, col=neighbours[0].length, longestP=0, max=0;
        int [][] matrix=new int[row][col];
        for(int i=0; i<row; i++)
            for(int j=0; j<col; j++)
                if(neighbours[i][j]!=null)
                    matrix[i][j]=1;
        else matrix[i][j]=0;

        int[][] buff= new int[row][col];

        for(int s=0; s<row; s++)
            for(int t=0; t<col; t++) {
                longestP = longestPath(matrix,buff, row, col, s, t);
                if ( longestP > max) {
                    max = longestP;
                    this.solution.add(neighbours[s][t]);
                    }
                }
        this.longestPath=max;
    }

    private int longestPath(int[][] matrix,int[][] buff, int n, int m, int i, int j)
    {
        if(buff[i][j]>0) return buff[i][j];
        int max=0,l=0;
        for(int[] directie: directii)
        {
            int x=directie[0]+i, y=directie[1]+j;
            if(x>-1 && y> -1 && x < n && y< m  && matrix[x][y]>matrix[i][y])
                l= longestPath(matrix,buff,n,m,x,y);
                if(l > max) max=l;
        }
        buff[i][j]=max+1;
        return buff[i][j];
    }

    public void afisare() {

        if(solution.size()>=3) {
            System.out.printf(" " + this.longestPath);
            for (int j = 0; j < this.solution.size(); j++) {
                if (this.solution.get(j) != null) {
                    System.out.printf(" " + this.solution.get(j));
                }
                System.out.println();
            }
        }
        else System.out.println("Nu exista un sir de lungime > 3");
    }
}
