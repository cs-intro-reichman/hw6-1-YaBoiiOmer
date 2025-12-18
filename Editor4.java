import java.awt.Color;

public class Editor4 {

	public static void main (String[] args) {

        // java Editor4 thor.ppm 50


		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
		Color[][] blackImage = Runigram.grayScaled(sourceImage);

		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, blackImage, n);
	}
}
