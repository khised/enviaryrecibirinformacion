package alberto.aguado.enviaryrecibirinformacion.modelos;

import java.io.Serializable;

public class usuario implements Serializable {
    private String email;
    private String passsword;

    public usuario() {
    }

    public usuario(String email, String passsword) {
        this.email = email;
        this.passsword = passsword;
    }

    public String getEmail() {
        return email;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    @Override
    public String toString() {
        return "usuario{" +
                "email='" + email + '\'' +
                ", passsword='" + passsword + '\'' +
                '}';
    }
}
