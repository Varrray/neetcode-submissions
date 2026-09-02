class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int is =0;
        for(int row=0;row<r;row++){
            for(int col=0;col<c;col++){
                if(grid[row][col]=='1'){
                    bfs(grid,row,col);
                    is++;
                }
            }
        }
        return is;
    }
    public void bfs(char[][] grid,int row,int col){
        
        int direction[][]={{1,0},{0,-1},{-1,0},{0,1}};
        Queue<int[]> q=new LinkedList<>();
        grid[row][col]='0';
        q.add(new int[]{row,col});
        while(!q.isEmpty()){
            int[] node=q.poll();
            int r=node[0],c=node[1];
            for(int[] dir:direction){
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]=='1'){
                    q.add(new int[]{nr,nc});
                    grid[nr][nc]='0';
                }
            }
        }
    }
}
