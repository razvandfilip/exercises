package com.razvan;

/**
 * Hello world!
 *
 */
public class App 
{

    private int[][] matrix;

    public App(int[][] matrix) {
        this.matrix = matrix;
    }

    public String printInSpiral() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int size1 = matrix.length;
        int size2 = matrix[0].length;

        for (int upperLeftRow = 0, upperLeftColumn = 0, lowerRightRow = size1 - 1, lowerRightColumn = size2 - 1;
        upperLeftRow <= lowerRightRow && upperLeftColumn <= lowerRightColumn;
        upperLeftRow++, upperLeftColumn++, lowerRightRow--, lowerRightColumn--) {
            // System.out.println("ulr: "+ upperLeftRow + " ulc: "+ upperLeftColumn + " ulv: " + matrix[upperLeftRow][upperLeftColumn]);
            // System.out.println("lrr: "+ lowerRightRow + " lrc: " + lowerRightColumn + " lrv: " + matrix[lowerRightRow][lowerRightColumn] );

            for (int i = upperLeftColumn; i <= lowerRightColumn; i++) {
                sb.append(matrix[upperLeftRow][i]).append(" ");
                System.out.print(matrix[upperLeftRow][i] + " ");
            }

            for (int i = upperLeftRow + 1; i <= lowerRightRow; i++) {
                sb.append(matrix[i][lowerRightColumn] + " ");
                System.out.print(matrix[i][lowerRightColumn] + " ");
            }

            if (upperLeftRow < lowerRightRow) {
                for (int i = lowerRightColumn - 1; i >= upperLeftColumn; i--) {
                    sb.append(matrix[lowerRightRow][i] + " ");
                    System.out.print(matrix[lowerRightRow][i] + " ");
                }
            }
            
            if (upperLeftColumn < lowerRightColumn) {
                for (int i = lowerRightRow - 1; i > upperLeftRow; i--) {
                    sb.append(matrix[i][upperLeftColumn] + " ");
                    System.out.print(matrix[i][upperLeftColumn] + " ");
                }
            }
        }


        for (int i = 1; i <= 25; i++) {
            sb2.append(i).append(" ");
        }
        return sb.toString();
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
