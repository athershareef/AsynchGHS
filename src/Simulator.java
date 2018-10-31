import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Simulator {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFile;
        int n = 0;
        int[] processIds = new int[0];
        double[][] adjacencyMatrix = new double[0][0];
        if (args.length == 0) {
            inputFile = "input2.txt";
        } else {
            inputFile = args[0];
        }


        try {
            File file = new File(inputFile);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            n = Integer.parseInt(bufferedReader.readLine());
            processIds = new int[n];
            adjacencyMatrix = new double[n][n];
            int i = 0;
            for (String s : bufferedReader.readLine().split(" ")) {
                processIds[i] = Integer.parseInt(s);
                i++;
            }

            for (i = 0; i < n; i++) {
                int j = 0;
                for (String s : bufferedReader.readLine().split(", ")) {
                    adjacencyMatrix[i][j] = Double.parseDouble(s);
                    j++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        Process[] processes = new Process[n];


        for (int i = 0; i < processes.length; i++) {
            processes[i] = new Process(processIds[i]);
        }

        for (int i = 0; i < processes.length; i++) {
            for (int j = 0; j < processes.length; j++) {
                if (adjacencyMatrix[i][j] != 0) {
                    processes[i].addNeighbor(processes[j], adjacencyMatrix[i][j]);
                }
            }
        }


        Thread[] threads = new Thread[n];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(processes[i]);
            threads[i].setName("Process " + processes[i].getId());
            threads[i].start();
        }

        System.out.println("w");


        while (true){




        }












    }
}
