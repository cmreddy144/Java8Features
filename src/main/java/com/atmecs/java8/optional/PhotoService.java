package com.atmecs.java8.optional;

import java.util.Optional;

public class PhotoService {
     
	public int getPhotoScreenWidth(Optional<ImageFeatures> photo){
        return photo.flatMap(mapper)
         .flatMap(ImageFeatures::getImageSize)
         .map(ImageSize::getWidth)
         .orElse(0);
    }
}