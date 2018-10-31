import java.util.*;

public class Process implements Runnable {

    private int id;
    private Queue<Edge> incidentEdges = new PriorityQueue<Edge>(edgeComparator);
    private ArrayList<Process> neighbors = new ArrayList<>();

    public Process(int id) {
        this.id = id;
    }



    @Override
    public void run() {

    }



    public void addNeighbor(Process process, double weight){
        this.incidentEdges.add(new Edge(this, process, weight, EdgeType.BASIC));
        this.neighbors.add(process);
    }

    public Queue<Edge> getIncidentEdges() {
        return incidentEdges;
    }

    public void setIncidentEdges(Queue<Edge> incidentEdges) {
        this.incidentEdges = incidentEdges;
    }

    public ArrayList<Process> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(ArrayList<Process> neighbors) {
        this.neighbors = neighbors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private static Comparator<Process> processComparator = new Comparator<Process>() {
        public int compare(Process p1, Process p2) {
            return (int) 0;
        }
    };

    private static Comparator<Edge> edgeComparator = new Comparator<Edge>() {
        public int compare(Edge e1, Edge e2) {
            return (int) (e1.getWeight() - e2.getWeight());
        }
    };

}
