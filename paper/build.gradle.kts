import net.minecrell.pluginyml.paper.PaperPluginDescription

plugins {
    id("nyaadanbou-conventions.repositories")
    id("nyaadanbou-conventions.copy-jar")
    id("economy-conventions.commons")
    alias(libs.plugins.pluginyml.paper)
}

group = "me.xanium.gemseconomy"
version = "1.0.0-SNAPSHOT"

dependencies {
    implementation(project(":common"))
    compileOnly(local.paper)
    compileOnly(local.economy.api)
}

tasks {
    copyJar {
        environment = "paper"
        jarFileName = "economy-legacy-${project.version}.jar"
    }
}

paper {
    main = "me.xanium.gemseconomy.GemsEconomyPlugin"
    name = "GemsEconomy"
    version = "${project.version}"
    description = project.description
    apiVersion = "1.19"
    authors = listOf("Nailm")
    serverDependencies {
        register("Economy") {
            required = true
            load = PaperPluginDescription.RelativeLoadOrder.BEFORE
        }
    }
}