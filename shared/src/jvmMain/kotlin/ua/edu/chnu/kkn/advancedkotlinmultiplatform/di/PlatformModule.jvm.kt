package ua.edu.chnu.kkn.advancedkotlinmultiplatform.di

import org.koin.dsl.module
import eu.anifantakis.lib.ksafe.KSafe
import eu.anifantakis.lib.ksafe.KSafeConfig
import java.io.File

actual val platformModule = module {
    single {
        KSafe(
            baseDir = File(System.getProperty("user.home"), ".advanced_kotlin_multiplatform"),
            config = KSafeConfig(appNamespace = "ua.edu.chnu.kkn.advancedkotlinmultiplatform"),
        )
    }
}
