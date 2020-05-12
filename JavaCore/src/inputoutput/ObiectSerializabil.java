package inputoutput;

import java.io.Serializable;

public class ObiectSerializabil implements Serializable {

	private static final long serialVersionUID = 1717336017169043079L;

	int id; String nume;

	public ObiectSerializabil(int id, String nume) {
		this.id = id;
		this.nume = nume;
	}
}
