class Solution {
    int[][] directions={{0,1},{1,0},{-1,0},{0,-1}};
    public void bfs(int i,int j,char[][] grid){
        Queue<int[]> q=new LinkedList<>();
        grid[i][j]='0';
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            int[] node=q.poll();
            int r=node[0],c=node[1];
            for(int[] dir:directions){
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nc>=0 && nr>=0 && nc<grid[0].length && nr<grid.length && grid[nr][nc]=='1'){
                    q.add(new int[] {nr,nc});
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
