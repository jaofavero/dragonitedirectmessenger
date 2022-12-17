package com.pdm.ui.list.viewholder

import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pdm.R
import com.pdm.data.DAOChatSingleton
import com.pdm.model.Chat
import com.pdm.model.Message
import com.pdm.ui.list.adapter.MessageAdapter
import kotlinx.coroutines.NonDisposableHandle.parent
import org.w3c.dom.Text

class MessageViewHolder (
    itemView: View,
    protected val adapter: MessageAdapter
    ): RecyclerView.ViewHolder(itemView) {
    private var nomeMensagemRecebida =
        itemView.findViewById<TextView>(R.id.nomeMensagemRecebida)
    private val mensagemRecebida =
        itemView.findViewById<TextView>(R.id.mensagemRecebida)
    private var nomeMensagemEnviada =
        itemView.findViewById<TextView>(R.id.nomeMensagemEnviada)
    private val mensagemEnviada =
        itemView.findViewById<TextView>(R.id.mensagemEnviada)


    private val lMensagemEnviada = itemView.findViewById<LinearLayout>(R.id.lMensagemEnviada)
    private val lMensagemRecebida = itemView.findViewById<LinearLayout>(R.id.lMensagemRecebida)


    protected lateinit var currentMessage: Message

    init {
        this.mensagemRecebida.setOnClickListener {
            this.adapter
                .getOnClickMessageListener()?.onClick(this.currentMessage)
        }
    }

    open fun bind(message: Message) {
        this.currentMessage = message
        val chat: Chat? = DAOChatSingleton.getChatById(message.chatId);

        if(message.recebida){
            this.mensagemRecebida.text = message.message;
            this.nomeMensagemRecebida.text = chat?.name;

            lMensagemEnviada.visibility = View.GONE;
            mensagemEnviada.visibility = View.GONE;
            nomeMensagemEnviada.visibility = View.GONE;
        }else{
            this.mensagemEnviada.text = message.message;
            this.nomeMensagemEnviada.text = "RED";

            lMensagemRecebida.visibility = View.GONE;
            mensagemRecebida.visibility = View.GONE;
            nomeMensagemRecebida.visibility = View.GONE;
        }




    }
}