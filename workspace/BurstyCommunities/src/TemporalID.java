
public class TemporalID implements Comparable<TemporalID> {
	public String vertex;
	public int time;
	
	public TemporalID(String V, int t) {
		vertex = V;
		time = t;
	}
	
	public int compareTo(TemporalID tid) {
		if (time == tid.time) { 
			return vertex.compareTo(tid.vertex);
		}
		else if (time < tid.time) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	public String toString() {
		return "(" + vertex + ";" + time + ")";
	}

}
