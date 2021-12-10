package enumeration;

public enum Dimensione {

	// sovrascrivo i toString
	PICCOLA {
		@Override
		public String toString() {
			return "La dimensione è Piccola!";
		}
	},
	GRANDE{
		@Override
		public String toString() {
			return "La dimensione è Grande!";
		}
	}
}
