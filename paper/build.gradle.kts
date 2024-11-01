import net.minecrell.pluginyml.paper.PaperPluginDescription

plugins {
    id("economy-conventions.commons")
    id("nyaadanbou-conventions.repositories")
    alias(libs.plugins.pluginyml.paper)
}

group = "me.xanium.gemseconomy"
version = "1.0.0-SNAPSHOT"

project.ext.set("name", "GemsEconomy")

dependencies {
    compileOnly(local.paper)

    implementation(project(":common"))
    implementation(local.economy.api)
}

paper {
    main = "me.xanium.gemseconomy.GemsEconomyPlugin"
    name = project.ext.get("name") as String
    version = "${project.version}"
    description = project.description
    apiVersion = "1.19"
    authors = listOf("Nailm")
    serverDependencies {
        register("Economy") {
            required = true
            load = PaperPluginDescription.RelativeLoadOrder.OMIT
        }
    }
}