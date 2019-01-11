package com.example.evilsay.wechatson;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.example.evilsay.wechatson.Utils.HttpUtils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

@SuppressLint("Registered")
public class Test extends AppCompatActivity {
    public static final String USERNAME = "username";
    public static final String PWD = "pwd";
    public static final String LOGINDATE = "LOGINDATE";
    protected EditText User_Login,User_Pwd;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(0);


    }
    //    保存数据
    private void SaveText(){
//        获取sharedPreferences对象
        SharedPreferences preferences = getSharedPreferences(LOGINDATE,MODE_PRIVATE);
//        传值
        String ace = preferences.getString(USERNAME,"");
        String ace1= preferences.getString(PWD,"");
        User_Login.setText(ace);
        User_Pwd.  setText(ace1);
    }
    //    拿到数据
    private void GetText(){
        String login_user = User_Login.getText().toString();
        String pwd_user   = User_Pwd.getText().toString();
//        获取sharedPreferences对象
        SharedPreferences preferences = getSharedPreferences(LOGINDATE,MODE_PRIVATE);
        //获取editor对象
        SharedPreferences.Editor editor = preferences.edit();//获取编辑器
        // 传值
        editor.putString(USERNAME,login_user);
        editor.putString(PWD,pwd_user);
        editor.apply();//提交修改
    }
}
