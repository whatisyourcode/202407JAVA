package dp2;

import java.util.Vector;

public class Student {
		private Vector<Transcript> transcripts;
		private String name;

		
		public Student(String name) {
			super();
			this.name = name;
			transcripts = new Vector<Transcript>();
		}
		
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return "Student [transcripts=" + transcripts + ", name=" + name + "]";
		}

		public void addTranscript(Transcript transcript) {
			if(transcript != null ) {
				transcripts.add(transcript);
			}
		}

		public void deleteTranscript(Transcript transcript) {
			if(transcripts.contains(transcript)) {
				transcripts.remove(transcript);
			}
		}

		public Vector<Transcript> getTranscripts() {
			return transcripts;
		}

		public void setTranscripts(Vector<Transcript> transcripts) {
			this.transcripts = transcripts;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
}
