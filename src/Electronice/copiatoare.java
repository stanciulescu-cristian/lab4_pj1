package Electronice;

public class copiatoare {
//    Copiatoarele sunt caracterizate de numărul de pagini/toner p_ton şi formatul de
//    copiere (A3 sau A4).
    private final int nr_pag;

    private final int p_ton;

    private final String format_copiere;

    public copiatoare(int nr_pag, int p_ton, String format_copiere) {
        this.nr_pag = nr_pag;
        this.p_ton = p_ton;
        this.format_copiere = format_copiere;
    }

    public int getNr_pag() {
        return nr_pag;
    }

    public int getP_ton() {
        return p_ton;
    }

    public String getFormat_copiere() {
        return format_copiere;
    }

    @Override
    public String toString() {
        return "copiatoare{" +
                "nr_pag=" + nr_pag +
                ", p_ton=" + p_ton +
                ", format_copiere='" + format_copiere + '\'' +
                '}';
    }

}
