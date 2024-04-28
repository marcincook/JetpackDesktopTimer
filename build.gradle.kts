//import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
}

group = "pl.ditems.timer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

dependencies {
    // Note, if you develop a library, you should use compose.desktop.common.
    // compose.desktop.currentOs should be used in launcher-sourceSet
    // (in a separate module for demo project and in testMain).
    // With compose.desktop.common you will also lose @Preview functionality
    implementation(compose.desktop.currentOs)

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-swing:1.5.2")
//    implementation("androidx.compose.ui:ui-desktop:1.0.0-alpha8")
//    implementation("androidx.compose.ui:ui-desktop:1.1.0-beta3")
//    implementation("androidx.compose.ui:ui-desktop:1.1.0-alpha4") // Użyj dostępnej wersji

    // Other dependencies...
}

//tasks.withType<KotlinCompile> {
//    kotlinOptions.jvmTarget = "18"
//}

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "JetpackDesktop"
            packageVersion = "1.0.0"
        }
    }
}
