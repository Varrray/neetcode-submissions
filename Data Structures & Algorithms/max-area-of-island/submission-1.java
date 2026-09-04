class Solution {
    int[][] directions={{0,1},{1,0},{-1,0},{0,-1}};
    public int bfs(int i,int j,int[][] grid){
        int cnt=1;
        Queue<int[]> q=new LinkedList<>();
        grid[i][j]=0;
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            int [] node=q.poll();
            int r=node[0],c=node[1];
            for(int[] dir:directions){
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==1){
                    grid[nr][nc]=0;
                    q.add(new int[]{nr,nc});
                    cnt++;
                }
            }
        
        }
        return cnt;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    ans=Math.max(ans,bfs(i,j,grid));
                }
            }
        }
        return ans;
    }
}
