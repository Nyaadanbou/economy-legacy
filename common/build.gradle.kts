plugins {
    id("nyaadanbou-conventions.repositories")
    id("economy-conventions.commons")
    `maven-publish`
}

group = "me.xanium.gemseconomy"
version = "0.0.1"

dependencies {
    compileOnly(local.paper)
    compileOnly(local.economy.api)
}

publishing {
    repositories {
        maven("https://repo.mewcraft.cc/private") {
            credentials {
                username = providers.gradleProperty("nyaadanbou.mavenUsername").orNull
                password = providers.gradleProperty("nyaadanbou.mavenPassword").orNull
            }
        }
    }
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}