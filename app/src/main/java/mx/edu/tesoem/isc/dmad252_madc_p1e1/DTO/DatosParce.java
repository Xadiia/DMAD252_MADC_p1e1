package mx.edu.tesoem.isc.dmad252_madc_p1e1.DTO;

import android.os.Parcel;
import android.os.Parcelable;

public class DatosParce implements Parcelable {

    private String nombre;
    private int edad;
    private String correo;
    private char sexo;

    public DatosParce(String nombre,int edad, String correo,char sexo){

        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.sexo = sexo;
    }

    protected DatosParce(Parcel in) {
        nombre = in.readString();
        edad = in.readInt();
        correo = in.readString();
        sexo = (char) in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeInt(edad);
        dest.writeString(correo);
        dest.writeInt((int) sexo);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<DatosParce> CREATOR = new Creator<DatosParce>() {
        @Override
        public DatosParce createFromParcel(Parcel in) {
            return new DatosParce(in);
        }

        @Override
        public DatosParce[] newArray(int size) {
            return new DatosParce[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
