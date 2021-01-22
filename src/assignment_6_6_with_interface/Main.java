package assignment_6_6_with_interface;

public class Main {

	public static void main(String[] args) {
		var video = new Video();
		video.setFileName("interface-demo.mp4");
		video.setTitle("How interfaces really workds");
		video.setOwner(new User("htet_phyo_naing@gmail.com"));
		
		/**
		 * Dependency Injection using Constructor Injection
		 * ----
		 * Passing concert implementation into the video processor
		 */
		var processor = new VideoProcessor(
				new XVideoEncoder(), 
				new SqlVideoDatabase(), 
				new EmailService()
		);
		processor.process(video);
	}

}
