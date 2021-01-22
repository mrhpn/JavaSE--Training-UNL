package assignment_6_6_with_interface;

public class XVideoEncoder implements VideoEncoder {

	@Override
	public void encode(Video video) {
		System.out.println("Encoded video....");
	}
}
