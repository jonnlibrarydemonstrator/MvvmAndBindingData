package com.master.killercode.myapplication._01_Init;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.master.killercode.myapplication.R;
import com.master.killercode.myapplication.databinding.InitBinding;

public class init extends AppCompatActivity {
    InitBinding binding;
    initVM viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Antes de iniciar, garanta que no Gradle App
//        Tenha habilitado o dataBinding
//        dataBinding{
//            enabled=true
//        } abrao para mais detalhes

//        ***IMPORTANTE***
//        Abra o xml _init antes de continuar aqui, caso já tenha lido os
//        comentários lá inseridos, ignore esta etapa

        initVars();
        initActions();

    }

    private void initVars() {

//        Como o nome do xml de teste é _init.xml , o android studio gerou para min
//        a classe chamada “InitBinding” que ira representar o nosso “setContentView”
//        padrão do OnCreate, como não iremos usar ele, então usaremos o
//        DataBindingUtil.setContentView(this, R.layout._init);
//
//        Como pode ver, ele pede dois parâmetros simples:
//        Activity e R.layout que queremos trabalhar. Que neste caso é o _init

        binding = DataBindingUtil.setContentView(this, R.layout._init);

//        Como no xml _init, iniciamos a variável com o nome de initLayout e falamos que ele é
//        do tipo initVM, quando android studio gerou a classe InitBinding ,
//        ele também gerou dois métodos set e get para esta classe,
//        o set recebe um parâmetro do tipo initVM,
//        e o get, retorna tudo relacionado ao xml ligado a classe e também os métodos inseridos nela.

        viewModel = new initVM();
        binding.setInitLayout(viewModel);

//        Finalmente iniciaremos o método executePendingBindings();,
//        que irá finalizar e executar todos os métodos setados antes.

        binding.executePendingBindings();

    }

    private void initActions() {

//        Após o método e executePendingBindings();,
//        posso chamar métodos dentro da classe,chamando o método get da classe,
//        neste caso o nome do método é getInitLayout, e executá-los como ações

//        Também posso usar os elementos criados no xml, passando id para eles,
//        após fazer isso, quando chamar a classe, o elemento está disponível.
//        Neste exemplo, um TextView no xml tem o ID = tv,
//        logo quando chamo o binding.tv, ele já me traz este elemento do tipo TextView, pronto para uso!
        binding.tv.setText("");

        binding.getInitLayout().initTextInMainActivityVM();
    }

}
