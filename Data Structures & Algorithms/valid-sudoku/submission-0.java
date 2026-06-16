class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Set<Character>> rows = new HashMap<>();
        Map<Character, Set<Character>> cols = new HashMap<>();
        Map<Character, Set<Character>> blocks = new HashMap<>();
        for(int i=0; i < board.length; i++){
            char row = Integer.toString(i).charAt(0);
            Set<Character> rowSet = rows.get(row);
            if(rowSet==null){
                rowSet = new HashSet<>();
                rows.put(row, rowSet);
            }
            for (char c : board[i]) {
                if(c!='.')
                if (!rowSet.add(c)) {
                return false; 
                }
            }
        }
        for(int j=0; j < board[0].length; j++){
            char col = Integer.toString(j).charAt(0);
            Set<Character> colSet = cols.get(col);
            if(colSet==null){
                colSet = new HashSet<>();
                cols.put(col, colSet);
            }
            for(int k=0; k < board.length; k++){
                char ch = board[k][j];
                if(ch!='.')
                if (!colSet.add(ch)) {
                return false; 
                }
            }
        }
        for(int l=0; l<board.length; l++){
            for(int m=0; m<board[0].length; m++){
                char block = Integer.toString((l/3)*3+(m/3)).charAt(0);
                Set<Character> blockSet = blocks.get(block);
                if(blockSet==null){
                    blockSet = new HashSet<>();
                    blocks.put(block, blockSet);
                }
                char ch = board[l][m];
                if(ch!='.')
                if (!blockSet.add(ch)) {
                    return false; 
                }
            }
        }
        return true;
    }
}
