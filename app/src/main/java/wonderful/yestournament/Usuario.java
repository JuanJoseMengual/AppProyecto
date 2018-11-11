package wonderful.yestournament;

public class Usuario {

    private String userEmail;
    private String userPass;

    private String urlFoto;
    private String nick;
    private int[] switchCode = new int[3];

    private int[] stats = new int[4];
    private int posicionRanking;


    //-------------------   CONSTRUCTOR   ---------------------------

    public Usuario(String userEmail, String userPass) {
        this.userEmail = userEmail;
        this.userPass = userPass;
    }


    //-------------------   SETTERS Y GETTERS   ---------------------------

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int[] getStats() {
        return stats;
    }

    public void setStats(int[] stats) {
        this.stats = stats;
    }

    public int getPosicionRanking() {
        return posicionRanking;
    }

    public void setPosicionRanking(int posicionRanking) {
        this.posicionRanking = posicionRanking;
    }

    public int[] getSwitchCode() {
        return switchCode;
    }

    public void setSwitchCode(int[] switchCode) {
        this.switchCode = switchCode;
    }

    public String getUserPass() { return userPass;    }

    public void setUserPass(String userPass) {  this.userPass = userPass; }

    public String getUrlFoto() {    return urlFoto; }

    public void setUrlFoto(String urlFoto) { this.urlFoto = urlFoto; }
}
