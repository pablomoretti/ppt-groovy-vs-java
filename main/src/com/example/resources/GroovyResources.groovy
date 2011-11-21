package com.example.resources

class GroovyResources {

	def release = false

	def use = false
	
	def doit(e) {
		if (release)
			throw new RuntimeException("Resource was release")

		use = true

		if (e)
			throw new RuntimeException("Upss")
		// using resources
	}

	def release() {
		release = true
	}

	def isRelease() {
		release
	}
	
	def hasUse() {
		use
	}

	def static executeAndRelease(resource,block){
		
		try{
			//block.call()
			resource.with(block)
		}
		finally{
			resource.release()
		}
	}
}
