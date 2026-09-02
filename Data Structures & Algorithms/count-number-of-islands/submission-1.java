class Solution {

    public void bfs(int row,int col,char[][] grid){
        int direction[][]={{0,1},{-1,0},{1,0},{0,-1}};
        Queue<int[]> q=new LinkedList<>();
        grid[row][col]='0';
        q.add(new int[]{row,col});
        while(!q.isEmpty()){
            int [] node=q.poll();
            int r=node[0],l=node[1];
            for(int[] dir: direction){
                int nr=r+dir[0];
                int nc=l+dir[1];
                if(nr>=0 && nc>=0 && nr<grid.length && nc< grid[0].length && grid[nr][nc]=='1'){
                    q.add(new int []{nr,nc});
                    grid[nr][nc]='0';
                }
            }

        }
    }
    public int numIslands(char[][] grid) {
        int is=0;


        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    bfs(i,j,grid);
                    is++;
                }

            }
        }
        return is;
    }
}
