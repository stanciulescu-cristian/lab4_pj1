package Electronice;

public class sisteme_de_calcul {
//    Sistemele de calcul au un monitor de un anumit tip tip_mon, un procesor de o anumită
//    viteză vit_proc, o capacitate a HDD c_hdd şi li se poate instala unul din sistemele de operare
//    Windows sau Linux

    private final String tip_mon;

    private final String vit_proc;

    private final int c_hdd;

    private final String sis_op;

    public sisteme_de_calcul(String tip_mon, String vit_proc, int c_hdd, String sis_op) {
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.sis_op = sis_op;
    }

    public String getTip_mon() {
        return tip_mon;
    }

    public String getVit_proc() {
        return vit_proc;
    }

    public int getC_hdd() {
        return c_hdd;
    }

    public String getSis_op() {
        return sis_op;
    }

    @Override
    public String toString() {
        return "sisteme_de_calcul{" +
                "tip_mon='" + tip_mon + '\'' +
                ", vit_proc='" + vit_proc + '\'' +
                ", c_hdd=" + c_hdd +
                ", sis_op='" + sis_op + '\'' +
                '}';
    }

}
