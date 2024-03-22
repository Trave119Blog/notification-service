package com.travelblog.notification.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Consumer

@Configuration
class ConsumerConfig {

    @Bean
    fun customTopic(): Consumer<Post> {
        return Consumer<Post> { post ->
            println("Notification service has received: $post")
        }
    }

    class Post {
        var postId: String? = null
        var title: String? = null
        override fun toString(): String {
            return "Post(postId=$postId, title=$title)"
        }
    }
}