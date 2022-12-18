import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int myArr[][][] = {{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}},    //elements of block 1
                {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}},    //elements of block 2
                {{12, 23, 34}, {45, 56, 67}, {78, 89, 90}}     //elements of block 3
        };
        writeMatrix("outputFile", myArr);

    }

    static void writeMatrix(String filename, int[][][] matrix) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    for (int k = 0; k < matrix[i][j].length; k++) {
                        bw.write(matrix[i][j][k] + ",");
                    }
                }
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
        }
    }
}