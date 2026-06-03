package ua.edu.chnu.kkn.advancedkotlinmultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform