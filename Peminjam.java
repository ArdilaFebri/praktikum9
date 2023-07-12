public abstract class Peminjam implements UserLogin{
    private boolean isLogin;

    @Override
    public void doLogin(){
        System.out.println("Peminjam berhasil Login");
        isLogin = true;
    }

    @Override
    public void doLogout(){
        System.out.println("Peminjam berhasil Logout");
        isLogin = false;
    }

    @Override
    public boolean isLogin(){
        return isLogin;
    }
    private boolean isAntiDenda;

    public abstract void setKodePeminjam(String kodePeminjam);
    public abstract String getKodePeminjam();
    public abstract void setNamaPeminjam(String namaPeminjam);
    public abstract String getNamaPeminjam();
    public abstract void addAntiDenda();
    public abstract void removeAntiDenda();
    public abstract boolean getAntiDenda();
}
