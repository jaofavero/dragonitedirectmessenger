// Generated by view binder compiler. Do not edit!
package com.pdm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.pdm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MensagemEnviadaActivityBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout lMensagemEnviada;

  @NonNull
  public final LinearLayout lMensagemRecebida;

  @NonNull
  public final TextView mensagemEnviada;

  @NonNull
  public final TextView mensagemRecebida;

  @NonNull
  public final TextView nomeMensagemEnviada;

  @NonNull
  public final TextView nomeMensagemRecebida;

  private MensagemEnviadaActivityBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout lMensagemEnviada, @NonNull LinearLayout lMensagemRecebida,
      @NonNull TextView mensagemEnviada, @NonNull TextView mensagemRecebida,
      @NonNull TextView nomeMensagemEnviada, @NonNull TextView nomeMensagemRecebida) {
    this.rootView = rootView;
    this.lMensagemEnviada = lMensagemEnviada;
    this.lMensagemRecebida = lMensagemRecebida;
    this.mensagemEnviada = mensagemEnviada;
    this.mensagemRecebida = mensagemRecebida;
    this.nomeMensagemEnviada = nomeMensagemEnviada;
    this.nomeMensagemRecebida = nomeMensagemRecebida;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MensagemEnviadaActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MensagemEnviadaActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.mensagem_enviada_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MensagemEnviadaActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lMensagemEnviada;
      LinearLayout lMensagemEnviada = ViewBindings.findChildViewById(rootView, id);
      if (lMensagemEnviada == null) {
        break missingId;
      }

      id = R.id.lMensagemRecebida;
      LinearLayout lMensagemRecebida = ViewBindings.findChildViewById(rootView, id);
      if (lMensagemRecebida == null) {
        break missingId;
      }

      id = R.id.mensagemEnviada;
      TextView mensagemEnviada = ViewBindings.findChildViewById(rootView, id);
      if (mensagemEnviada == null) {
        break missingId;
      }

      id = R.id.mensagemRecebida;
      TextView mensagemRecebida = ViewBindings.findChildViewById(rootView, id);
      if (mensagemRecebida == null) {
        break missingId;
      }

      id = R.id.nomeMensagemEnviada;
      TextView nomeMensagemEnviada = ViewBindings.findChildViewById(rootView, id);
      if (nomeMensagemEnviada == null) {
        break missingId;
      }

      id = R.id.nomeMensagemRecebida;
      TextView nomeMensagemRecebida = ViewBindings.findChildViewById(rootView, id);
      if (nomeMensagemRecebida == null) {
        break missingId;
      }

      return new MensagemEnviadaActivityBinding((ConstraintLayout) rootView, lMensagemEnviada,
          lMensagemRecebida, mensagemEnviada, mensagemRecebida, nomeMensagemEnviada,
          nomeMensagemRecebida);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
