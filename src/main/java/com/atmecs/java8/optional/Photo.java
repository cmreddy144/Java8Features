package com.atmecs.java8.optional;

import java.util.Optional;

public class Photo
{
	private long id;
	private String company;
	private String name;
	private Optional<ImageFeatures> features;
	public Photo(long id, String company, String name, Optional<ImageFeatures> features)
	{
		super();
		this.id = id;
		this.company = company;
		this.name = name;
		this.features = features;
	}
	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company = company;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Optional<ImageFeatures> getFeatures()
	{
		return features;
	}
	public void setFeatures(Optional<ImageFeatures> features)
	{
		this.features = features;
	}
}
