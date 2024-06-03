// Implementazione di codice

// classe Mail (da package Comunicazione)
public class Mail {
  private String destinatario;
  private String mittente;
  private String oggetto;
  public void create() {...}
  public void setDestinatario(string destinatario) {...}
  public void setMittente(string mittente) {...}
  public void setOggetto(string oggetto) {...}
}

// classe PacchettoVacanza (da package Domain)
public class PacchettoVacanza {
  private double costo;
  private int periodoSoggiorno;
  private String tipologia;
  private String alloggio;
  private int numPersone;
  public void create(){...}
  public void setCosto(double costo){...}
  public void setPeriodoSoggiorno(int periodoSoggiorno){...}
  public void setTipologia(String tipologia){...}
  public void setAlloggio(String alloggio){...}
  public void setNumPersone(int numPersone){...}
  public void modificaDati(double costo, int periodoSoggiorno, String tipologia, String alloggio, int numPersone){
    setCosto(costo);
    setPeriodoSoggiorno(periodoSoggiorno);
    setTipologia(tipologia);
    setAlloggio(alloggio);
    setNumPersone(numPersone);
  }
}

// classe Catalogo (da package Domain)
public class Catalogo{
    public void inserisciPacchettoVacanza{…}
    public void inserisciDatiPacchetto(double costo, int periodoSoggiorno, string tipologia, string alloggio, int numPersone){
    PacchettoVacanza p = new PacchettoVacanza(costo, periodoSoggiorno, tipologia, alloggio, numPersone);
    }
    public void aggiungiPacchetto(PacchettoVacanza p){…}
}
