package fauzi.hilmy.quiz15jan_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    Button btnResult;
    TextView lblHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = (EditText)findViewById(R.id.etNumber);
        btnResult = (Button)findViewById(R.id.btnResult);
        lblHasil = (TextView)findViewById(R.id.lblHasil);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aAngka = etNumber.getText().toString();

                if (aAngka.equalsIgnoreCase("1")) {
                    lblHasil.setText("Jurusan Manajemen Informatika");
                }else if (aAngka.equalsIgnoreCase("2")) {
                    lblHasil.setText("Jurusan Teknik Komputer");
                }else if (aAngka.equalsIgnoreCase("3")) {
                    lblHasil.setText("Jurusan Akuntansi");
                }else if (aAngka.equalsIgnoreCase("4")) {
                    lblHasil.setText("Jurusan Sistem Informasi");
                }else if (aAngka.equalsIgnoreCase("5")) {
                    lblHasil.setText("Jurusan Teknologi Informasi");
                }else{
                    etNumber.setError("Please Only Input Number 1-5");
                }
            }
        });
    }
}
