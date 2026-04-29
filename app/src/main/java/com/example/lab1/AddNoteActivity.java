package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddNoteActivity extends AppCompatActivity {
    Button addNote;
    EditText titel,content;
    TextView showNote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
            addNote = findViewById(R.id.button3);
            titel = findViewById(R.id.editTextText);
            content = findViewById(R.id.editTextText2);
            showNote = findViewById(R.id.textView2);

            addNote.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String mTitle = titel.getText().toString();
                    String mContent = content.getText().toString();
                    TextNote textnote1 = new TextNote();
                    textnote1.title = mTitle;
                    textnote1.content = mContent;
                    textnote1.createdDate = "29-04-2026";

                    String displayText = textnote1.getTitle()+"\n"+textnote1.getContent();
                    showNote.setText(displayText);

                }
            });

    }
}