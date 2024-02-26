package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.notes.database.DBManager;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBManager dbManager = new DBManager(this);
        dbManager.openDB();
        List<Notes> notes = dbManager.getNotes();
        for (Notes n : notes){
            Log.d("NOTES",n.getId()+ " "+ n.getTitle() + " " + n.getText());
        }
        dbManager.closeDB();
    }
}