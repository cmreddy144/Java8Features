package com.atmecs.java8.optional;

import java.util.Optional;

public class ImageFeatures
{
	private String fileSize;
	private Optional imgeSize;
	public ImageFeatures(String fileSize, Optional imgeSize)
	{
		super();
		this.fileSize = fileSize;
		this.imgeSize = imgeSize;
	}
	public String getFileSize()
	{
		return fileSize;
	}
	public void setFileSize(String fileSize)
	{
		this.fileSize = fileSize;
	}
	public Optional getImgeSize()
	{
		return imgeSize;
	}
	public void setImgeSize(Optional imgeSize)
	{
		this.imgeSize = imgeSize;
	}
}
