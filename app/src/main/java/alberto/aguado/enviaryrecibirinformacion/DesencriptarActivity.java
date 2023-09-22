package alberto.aguado.enviaryrecibirinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import alberto.aguado.enviaryrecibirinformacion.modelos.usuario;

public class DesencriptarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desencriptar);
        //sacar la informacion que llega
        Intent intent= getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle !=null){
       usuario usuario = (alberto.aguado.enviaryrecibirinformacion.modelos.usuario) bundle.getSerializable("user");
            String email=bundle.getString("pass");

        Toast.makeText(this, usuario.toString(), Toast.LENGTH_SHORT).show();
    }
}
}