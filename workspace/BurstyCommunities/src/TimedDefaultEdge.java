import org.jgrapht.graph.DefaultEdge;

/**
 * @author dditursi
 *
 */

public class TimedDefaultEdge extends DefaultEdge {

	private double timestamp;
	
	public TimedDefaultEdge() {
		timestamp = 0;
	}
	
	public TimedDefaultEdge(double t) {
		timestamp = t;
	}

	public double getTime() {
		return timestamp;
	}
	
	public void setTime(double t) {
		timestamp = t;
	}
}
