package com.example.resources;

public class JavaResources {

	public Boolean release = false;

	public Boolean use = false;

	public void doit(Boolean throwException) {
		if (release)
			throw new RuntimeException("Resource was release");
		
		use = true;
		
		if (throwException)
			throw new RuntimeException("Upss");
	}

	public void release() {
		release = true;
	}

	public Boolean isRelease() {
		return release;
	}

	public Boolean hasUse() {
		return use;
	}
}
