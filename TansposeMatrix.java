//Bosscoder
import java.io.*;
import java.util.*;
class TansposeMatrix {
    public static void main(String[] args) throws Exception{
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size for matrix");
        int matrixSize = Integer.parseInt(brVal.readLine());
        List<List<Integer>> pattern = new ArrayList<>();
        System.out.println("Enter size for pattern");
        for(int i = 0; i < matrixSize; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < matrixSize; j++){
                row.add(Integer.parseInt(brVal.readLine()));
            }
            pattern.add(row);
        }
        System.out.println(MatrixTraspose(pattern));
    }
    static List<List<Integer>> MatrixTraspose(List<List<Integer>> input){
        List<List<Integer>> resultMatrix = new ArrayList<>();
        for(int i = 0; i < input.get(0).size(); i++){
            List<Integer> transpos = new ArrayList<>();
            for(int j = 0; j < input.size(); j++){
                transpos.add(input.get(j).get(i));
            }
            resultMatrix.add(transpos);
        }
        return resultMatrix;
    }
}
