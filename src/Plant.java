public class Plant {
    private String pavadinimas;
    private String lotyniskasPavadinimas;
    private boolean vienmetis;
    private String zemynas;
    private int suaugusioAugaloAukstisMetrais;
    private boolean arValgomas;

    //Tuscias konstruktorius//
    public Plant() {
    }

    //Pilnas konstruktorius//
    public Plant (String pavadinimas, String lotyniskasPavadinimas, boolean vienmetis, String zemynas, int suaugusioAugaloAukstisMetrais, boolean arValgomas) {
        this.pavadinimas = pavadinimas;
        this.lotyniskasPavadinimas = lotyniskasPavadinimas;
        this.vienmetis = vienmetis;
        this.zemynas = zemynas;
        this.suaugusioAugaloAukstisMetrais = suaugusioAugaloAukstisMetrais;
        this.arValgomas = arValgomas;
    }
    //Sukurti seterius//
    public void setPavadinimas(String pavadinimas) { this.pavadinimas = pavadinimas; }
    public void setLotyniskasPavadinimas(String lotyniskasPavadinimas) { this.lotyniskasPavadinimas = lotyniskasPavadinimas; }
    public void setVienmetis(boolean vienmetis) { this.vienmetis = vienmetis; }
    public void setZemynas(String zemynas) { this.zemynas = zemynas; }
    public void setSuaugusioAugaloAukstisMetrais(int suaugusioAugaloAukstisMetrais) { this.suaugusioAugaloAukstisMetrais = suaugusioAugaloAukstisMetrais; }
    public void setArValgomas(boolean arValgomas) { this.arValgomas = arValgomas; }

    //Sukurti geterius//
    public String getPavadinimas() {
        return this.pavadinimas;
    }
    public String getLotyniskasPavadinimas() {
        return this.lotyniskasPavadinimas;
    }
    public boolean getVienmetis() {
        return this.vienmetis;
    }
    public String getZemynas() {
        return this.zemynas;
    }
    public int getSuaugusioAugaloAukstisMetrais() {
        return this.suaugusioAugaloAukstisMetrais;
    }
    public boolean getArValgomas() {
        return this.arValgomas;
    }

    @Override
    public String toString() {
        return this.pavadinimas + " " +
                this.lotyniskasPavadinimas + " " +
                this.vienmetis + " " +
                this.zemynas + " " +
                this.suaugusioAugaloAukstisMetrais + " " +
                this.arValgomas;
    }
}








}
