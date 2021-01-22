package assignment_6_5_without_interface;

public class VideoProcessor {
	
	/**
	 * Here, this VideoProcessor class is coupled with 3 classes: encoder, database and email service.
	 * We can make them decouple by using interfaces.
	 * @param video
	 */
	public void process(Video video) {
		var encoder = new VideoEncoder();
		encoder.encode(video);
		
		var database = new VideoDatabase();
		database.store(video);
		
		var emailService = new EmailService();
		emailService.sendEmail(video.getOwner());
	}
}
