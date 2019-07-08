buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:1.5.18.RELEASE")
    }
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {

    apply(plugin = "java-library")

    dependencies {
      // Spring Boot managed dependencies
      "implementation"(platform("org.springframework.boot:spring-boot-dependencies:1.5.18.RELEASE"))
      // Constraints
      constraints {
          "implementation"("args4j:args4j:2.33")
      }
    }

}
