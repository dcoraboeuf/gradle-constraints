val copyDependencies by tasks.registering(Copy::class) {
    into("build/dependencies")
    from(configurations.runtimeClasspath)
}
