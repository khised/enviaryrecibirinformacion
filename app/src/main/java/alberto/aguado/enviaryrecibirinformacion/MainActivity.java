package alberto.aguado.enviaryrecibirinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import alberto.aguado.enviaryrecibirinformacion.modelos.usuario;

public class MainActivity extends AppCompatActivity {
private EditText txtpasword;
    private EditText txtemail;
private Button btndesencriptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVIsta();
        btndesencriptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password=txtpasword.getText().toString();
                String email=txtemail.getText().toString();
                usuario usuario=new usuario(email,password);
                Intent intent =new Intent(MainActivity.this,DesencriptarActivity.class);
                //enviar informacion a la siguiente actividad
                Bundle bundle=new Bundle();
               // bundle.putString("pass",password);
                bundle.putSerializable("user",usuario);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void inicializarVIsta() {
        txtpasword=findViewById(R.id.txtpassword);
        txtemail=findViewById(R.id.txtemail);
        btndesencriptar=findViewById(R.id.btndesencriptarmain);
    }
}