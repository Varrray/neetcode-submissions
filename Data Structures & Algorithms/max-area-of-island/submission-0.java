class Solution {
    public int bfs(int[][] grid,int r,int c){
        int[][] direction={{1,0},{0,1},{-1,0},{0,-1}};
        int count=1;
        grid[r][c]=0;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{r,c});
        while(!q.isEmpty()){
            int[] node=q.poll();
            int row=node[0],col=node[1];
            for(int[] dir:direction){
                int nr=row+dir[0];
                int nc=col+dir[1];
                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==1){
                    grid[nr][nc]=0;
                    count++;
                    q.add(new int[]{nr,nc});
                }
            }


        }
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int area=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==1){
                    area=Math.max(area,bfs(grid,r,c));
                }
            }
        }
        return area;
    }
}
