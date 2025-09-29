package mx.edu.tesoem.isc.dmad252_madc_p1e1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import mx.edu.tesoem.isc.dmad252_madc_p1e1.DTO.DatosParce;

public class PrincipalActivity extends AppCompatActivity {

    EditText txtnombre, txtedad, txtcorreo,txtsexo;
    Button btnp1enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtnombre =  findViewById(R.id.txtnombre);
        txtedad =  findViewById(R.id.txtedad);
        txtcorreo =  findViewById(R.id.txtcorreo);
        txtsexo = findViewById(R.id.txtsexo);
        btnp1enviar =  findViewById(R.id.btnp1envia);

        btnp1enviar.setOnClickListener(v->{
            DatosParce datosParce =  new DatosParce(txtnombre.getText().toString(),Integer.valueOf(txtedad.getText().toString()),txtcorreo.getText().toString(),txtsexo.getText().charAt(0));
            Intent intent =  new Intent(this,DespliegeActivity.class);
            intent.putExtra("datosparce",datosParce);
            startActivity(intent);
        });
    }
}