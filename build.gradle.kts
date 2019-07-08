allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {

    apply(plugin = "java-library")

    dependencies {
      // Constraints
      constraints {
          "implementation"("args4j:args4j:2.33")
      }
    }

}
