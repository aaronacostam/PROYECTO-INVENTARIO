


public class Libro {
	private String CODIGO;
    private String TITULO;
    private String AUTOR;
    private String EDITORIAL;
    private String A�OEDICION;
    private String ESPECIALIDAD;  
    private String NUMPAG;

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getTITULO() {
        return TITULO;
    }

    public void setTITULO(String TITULO) {
        this.TITULO = TITULO;
    }

    public String getAUTOR() {
        return AUTOR;
    }

    public void setAUTOR(String AUTOR) {
        this.AUTOR = AUTOR;
    }

    public String getEDITORIAL() {
        return EDITORIAL;
    }

    public void setEDITORIAL(String EDITORIAL) {
        this.EDITORIAL = EDITORIAL;
    }

    public String getA�OEDICION() {
        return A�OEDICION;
    }

    public void setA�OEDICION(String A�OEDICION) {
        this.A�OEDICION = A�OEDICION;
    }

    public String getESPECIALIDAD() {
        return ESPECIALIDAD;
    }

    public void setESPECIALIDAD(String ESPECIALIDAD) {
        this.ESPECIALIDAD = ESPECIALIDAD;
    }

    public String getNUMPAG() {
        return NUMPAG;
    }

    public void setNUMPAG(String NUMPAG) {
        this.NUMPAG = NUMPAG;
    }
   public String IMPRIMIR(){
        return getCODIGO()+"\t\t"+getTITULO()+"\t\t"+getAUTOR()+"\t\t"+getEDITORIAL()+"\t\t"+getA�OEDICION()+"\t\t"+getESPECIALIDAD()+"\t\t"+getNUMPAG()+"\n";
    
   }
	
	
}
