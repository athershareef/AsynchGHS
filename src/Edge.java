public class Edge {
    private Process p1, p2;
    private double weight;
    private EdgeType edgeType;


    public Edge(Process p1, Process p2, double weight, EdgeType edgeType) {
        this.p1 = p1;
        this.p2 = p2;
        this.weight = weight;
        this.edgeType = edgeType;
    }

    public Process getP1() {
        return p1;
    }

    public void setP1(Process p1) {
        this.p1 = p1;
    }

    public Process getP2() {
        return p2;
    }

    public void setP2(Process p2) {
        this.p2 = p2;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public EdgeType getEdgeType() {
        return edgeType;
    }

    public void setEdgeType(EdgeType edgeType) {
        this.edgeType = edgeType;
    }


}
