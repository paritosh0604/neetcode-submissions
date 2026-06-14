class Solution {
    public void floodFill(char[][] grid, int i, int j){
        if(i < 0 || j < 0)
        return;
        if(i >= grid.length || j >= grid[0].length)
        return;
        if(grid[i][j]=='0')
        return;
        grid[i][j] = '0';
        floodFill(grid, i+1, j);
        floodFill(grid, i, j+1);
        floodFill(grid, i-1, j);
        floodFill(grid, i, j-1);
    }
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i=0; i < rows; i++){
            for(int j=0; j < cols; j++){
                if(grid[i][j]=='1'){
                    count++;
                    floodFill(grid, i, j);
                }
            }
        } 
        return count;
        
    }
}
