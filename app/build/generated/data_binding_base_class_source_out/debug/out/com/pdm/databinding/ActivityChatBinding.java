// Generated by view binder compiler. Do not edit!
package com.pdm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.pdm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button enviarMensagem;

  @NonNull
  public final ImageView imgPessoa;

  @NonNull
  public final LinearLayout lEditorMensagem;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final TextView nomePessoa;

  @NonNull
  public final RecyclerView rvMessageList;

  @NonNull
  public final TextView textviewSecond;

  @NonNull
  public final EditText txtCampoMensagem;

  private ActivityChatBinding(@NonNull ConstraintLayout rootView, @NonNull Button enviarMensagem,
      @NonNull ImageView imgPessoa, @NonNull LinearLayout lEditorMensagem,
      @NonNull LinearLayout linearLayout2, @NonNull TextView nomePessoa,
      @NonNull RecyclerView rvMessageList, @NonNull TextView textviewSecond,
      @NonNull EditText txtCampoMensagem) {
    this.rootView = rootView;
    this.enviarMensagem = enviarMensagem;
    this.imgPessoa = imgPessoa;
    this.lEditorMensagem = lEditorMensagem;
    this.linearLayout2 = linearLayout2;
    this.nomePessoa = nomePessoa;
    this.rvMessageList = rvMessageList;
    this.textviewSecond = textviewSecond;
    this.txtCampoMensagem = txtCampoMensagem;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.enviarMensagem;
      Button enviarMensagem = ViewBindings.findChildViewById(rootView, id);
      if (enviarMensagem == null) {
        break missingId;
      }

      id = R.id.imgPessoa;
      ImageView imgPessoa = ViewBindings.findChildViewById(rootView, id);
      if (imgPessoa == null) {
        break missingId;
      }

      id = R.id.lEditorMensagem;
      LinearLayout lEditorMensagem = ViewBindings.findChildViewById(rootView, id);
      if (lEditorMensagem == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.nomePessoa;
      TextView nomePessoa = ViewBindings.findChildViewById(rootView, id);
      if (nomePessoa == null) {
        break missingId;
      }

      id = R.id.rvMessageList;
      RecyclerView rvMessageList = ViewBindings.findChildViewById(rootView, id);
      if (rvMessageList == null) {
        break missingId;
      }

      id = R.id.textview_second;
      TextView textviewSecond = ViewBindings.findChildViewById(rootView, id);
      if (textviewSecond == null) {
        break missingId;
      }

      id = R.id.txtCampoMensagem;
      EditText txtCampoMensagem = ViewBindings.findChildViewById(rootView, id);
      if (txtCampoMensagem == null) {
        break missingId;
      }

      return new ActivityChatBinding((ConstraintLayout) rootView, enviarMensagem, imgPessoa,
          lEditorMensagem, linearLayout2, nomePessoa, rvMessageList, textviewSecond,
          txtCampoMensagem);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
