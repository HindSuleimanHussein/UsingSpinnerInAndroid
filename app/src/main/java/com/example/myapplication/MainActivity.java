package com.example.myapplication;


import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.myapplication.newPackage.Book;
import com.example.myapplication.newPackage.BookDs;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btnShow;
    private Spinner spnTypes;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShow=findViewById(R.id.btnShow);
        spnTypes=findViewById(R.id.spnTypes);
        textResult=findViewById(R.id.textResult);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String type = spnTypes.getSelectedItem().toString();
                BookDs bookDs=new BookDs();
                List<Book> listBooks = bookDs.getBooksByTypes(type);
                String str=" ";
                for(Book b: listBooks){
                    str+=b.getTitle().toString() + "\n";
                }
                textResult.setText(str);
            }
        });


    }
}