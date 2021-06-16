package com.training.qn20;

public class MirrorImage {
	
	public String getImage(String inputValue) {
		String mirrorOfImage = "";
		
		
		for(int i =inputValue.length()-1;i>=0;i--) {			
			mirrorOfImage +=inputValue.charAt(i);			
		}		
		
		return mirrorOfImage;
	}

	public static void main(String[] args) {
		MirrorImage mirrorImage = new MirrorImage();
		String originalImage = "EARTH";
		String imageWithPipe = mirrorImage.getImage(originalImage);
		System.out.println("Mirror of the Image: "+ originalImage+"|"+ imageWithPipe);

	}

}
