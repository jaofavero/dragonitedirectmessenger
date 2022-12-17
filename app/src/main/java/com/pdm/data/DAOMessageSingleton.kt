package com.pdm.data

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import com.pdm.model.Chat
import com.pdm.model.Message
import java.time.LocalDateTime

@RequiresApi(Build.VERSION_CODES.O)
object DAOMessageSingleton {
    private var serial: Long = 1
    private var message = ArrayList<Message>()


    fun add(m: Message) {
        this.message.add(0, m);
        m.id = serial++
    }

    fun getMessage(chat: Chat): ArrayList<Message>? {
        val messageChat = ArrayList<Message>()

        if (!this.message.isEmpty()) {
            for (i in this.message) {
                if (i.chatId == chat.id) {
                    messageChat.add(i)
                }
            }
            messageChat.reverse();
            return messageChat;
        }
        return null;
    }

    fun getChatById(id: Long): Message? {
        for (c in this.message) {
            if (c.id == id)
                return c
        }
        return null
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getChatPositionById(id: Long): Int {
        return this.message.indexOf(Message(id))
    }

    fun getSizeMessage(): Int{
        return this.message.size
    }
}