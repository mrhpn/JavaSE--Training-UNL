package assignment_6_5_without_interface;

public class Main {

	public static void main(String[] args) {
		var video = new Video();
		video.setFileName("interface-demo.mp4");
		video.setTitle("How interfaces really workds");
		video.setOwner(new User("htet_phyo_naing@gmail.com"));
		
		var processor = new VideoProcessor();
		processor.process(video);
	}

}
