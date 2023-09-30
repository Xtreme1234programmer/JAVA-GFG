/*
    Time Complexity : O(N * M)
    Space Complexity :  O(1)

    where N and M are the number of rows and columns respectively
 */

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            new Solution().booleanMatrix(matrix);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    sb.append(matrix[i][j] + " ");
                }
                sb.append("\n"); 
            }
            System.out.print(sb);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int mat[][])
    {
        int n=mat.length;
        int m=mat[0].length;
        
      if (n == 1 && m == 1) {
			return;
		}

		int setCol = 0;

		for (int i = 0; i < n; i++) {
			// Update setCol to 1 if any element in the first column is 1
			if (mat[i][0] == 1) {
				setCol = 1;
			}

			for (int j = 1; j < m; j++) {
				if (mat[i][j] == 1) {
					mat[i][0] = 1;
					mat[0][j] = 1;
				}
			}
		}

		// Iterate over the array once again and using the first row and first column,
		// update the elements.
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (mat[i][0] == 1 || mat[0][j] == 1) {
					mat[i][j] = 1;
				}
			}
		}

		// Check if the first row needs to be set to 1 as well
		if (mat[0][0] == 1) {
			for (int j = 0; j < m; j++) {
				mat[0][j] = 1;
			}
		}

		// Check if the first column needs to be set to 1 as well
		if (setCol == 1) {
			for (int i = 0; i < n; i++) {
				mat[i][0] = 1;
			}
		}
	}
    
}
