package mx.edu.tesoem.isc.dmad252_madc_p1e1;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import mx.edu.tesoem.isc.dmad252_madc_p1e1.DTO.DatosParce;

public class DespliegeActivity extends AppCompatActivity {
    TextView lblnombre, lbledad, lblcorreo, lblsexo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_despliege);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lblnombre =  findViewById(R.id.lblnombre);
        lbledad = findViewById(R.id.lbledad);
        lblcorreo = findViewById(R.id.lblcorreo);
        lblsexo = findViewById(R.id.lblsexo);

        Bundle datos = getIntent().getExtras();
        Log.i("informacion", "Datos: "+ datos);
        DatosParce datosParce =  datos.getParcelable("datosparce");
        lblnombre.setText(datosParce.getNombre());
        lbledad.setText(String.valueOf(datosParce.getEdad()));
        lblcorreo.setText(datosParce.getCorreo());
        lblsexo.setText(String.valueOf(datosParce.getSexo()));
     }
}