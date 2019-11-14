package com.atmecs.java8.optional;

import java.util.Optional;

public class PhotoTesterOption
{
	ImageSize imgSize = new ImageSize(750, 1350);
	ImageFeatures imgFea = new ImageFeatures("8.5",Optional.of(imgSize));
	Photo photo = new Photo(305, "Google", "pixel", Optional.of(imgFea));
	
	PhotoService photoService = new PhotoService();
	int width = photoService.getPhotoScreenWidth(Optional.of(photo));
	//System.out.println("Photo Width-"+ width);
}
