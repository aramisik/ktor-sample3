package com.example.plugins

import io.ktor.server.websocket.*
import io.ktor.websocket.*
import io.ktor.server.application.*
import io.ktor.server.routing.*
import kotlinx.coroutines.launch
import java.awt.SystemColor.text
import java.util.*

fun Application.configureSockets() {
    val connections = mutableListOf<DefaultWebSocketSession>()
    install(WebSockets) {

        maxFrameSize = Long.MAX_VALUE
        masking = false
    }

    routing {
        val connections = Collections.synchronizedCollection()
        val examples = Collections.synchronizedList()
        randomExercise(),
        randomExercise(),
        randomExercise(),
        ))
        webSocket("/") { // websocketSession
          if (connections.size >= 3)
              close() else {
              connections.add(this)
              while (connections.size != 3)
          }
            launch {
            }
          }
        val incoming
        for (frame in incoming) {
                when (frame) {
                    is Frame.Text -> {
                        val text = frame.readText().reversed()
                        connections.forEach { connection ->
                        connection.send(Frame.Text(text))
                    }
                        if (text.equals(text == "bye")) {
                            close(CloseReason(CloseReason.Codes.NORMAL, "Client said BYE"))
                        }
                    }
                }
            }
        connections.remove(this)
        }
    }

fun randomExercise() {
    TODO("Not yet implemented")
}
}
