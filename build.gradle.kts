plugins {
	`java-gradle-plugin`
	`maven-publish`
}

group = "link.infra.snip"
version = "1.0"

repositories {
	jcenter()
	mavenCentral()
}

dependencies {
	implementation("com.github.javaparser:javaparser-symbol-solver-core:3.16.1")
}

gradlePlugin {
	// Define the plugin
	val snip by plugins.creating {
		id = "link.infra.snip"
		implementationClass = "link.infra.snip.gradle.SnipGradlePlugin"
	}
}
