package comw.example.rplrus26.intenku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ResourceBundle;

public class IntentMe extends AppCompatActivity {

    EditText edt_name;
    Button btnSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_me);

        edt_name = findViewById(R.id.edt_name);
        btnSet = findViewById(R.id.Btn_Set);

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edt_name.getText().toString();
                Intent i = new Intent();
                i.putExtra("name", name);
                setResult(1, i);
                finish();
            }
        });
    }
}
