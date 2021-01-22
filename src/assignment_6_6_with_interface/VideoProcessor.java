package assignment_6_6_with_interface;

public class VideoProcessor {
	private VideoEncoder encoder;
	private VideoDatabase database;
	private NotificationService notification;
	
	/**
	 * Dependency Injection using Constructor Injection
	 * @param encoder
	 * @param database
	 * @param notification
	 */
	public VideoProcessor(VideoEncoder encoder, VideoDatabase database, NotificationService notification) {
		this.encoder = encoder;
		this.database = database;
		this.notification = notification;
	}

	/**
	 * Encode video, then store into database and notify the owner
	 * 
	 * @param video
	 */
	public void process(Video video) {
		encoder.encode(video);
		database.store(video);
		notification.notify(video.getOwner());
	}
}
