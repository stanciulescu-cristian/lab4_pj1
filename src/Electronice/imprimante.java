package Electronice;


    class imprimante extends echipamente{
//        Imprimantele sunt caracterizate numărul de pagini scrise pe minut ppm, rezoluţie
//(număr de puncte per inch dpi) şi număr de pagini/cartuş p_car şi modul de tipărire (color sau
//alb negru).

        private final int ppm;

        private final int rezolutie;

        private final int nr_pag;

        private final String mod_de_tiparire;

        public imprimante(String denumire, int nr_inv, int pret, int zona_mag, Stare stare, int ppm, int rezolutie, int nr_pag, String mod_de_tiparire) {
            super(denumire, nr_inv, pret, zona_mag, stare);
            this.ppm = ppm;
            this.rezolutie = rezolutie;
            this.nr_pag = nr_pag;
            this.mod_de_tiparire = mod_de_tiparire;
        }

        @Override
        public String toString() {
            return "imprimante{" +
                    "ppm=" + ppm +
                    ", rezolutie=" + rezolutie +
                    ", nr_pag=" + nr_pag +
                    ", mod_de_tiparire='" + mod_de_tiparire + '\'' +
                    '}';
        }

        public int getPpm() {
            return ppm;
        }

        public int getRezolutie() {
            return rezolutie;
        }

        public int getNr_pag() {
            return nr_pag;
        }

        public String getMod_de_tiparire() {
            return mod_de_tiparire;
        }
    }

