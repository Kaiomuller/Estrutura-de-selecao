public class tresNumerosInteiros {

    private int primeiro, segundo, terceiro;

    public tresNumerosInteiros(int p, int s, int t) {
        primeiro = p;
        segundo = s;
        terceiro = t;
    }

    public void setPrimeiroNumero(int p) {
        if (p >= 0) {
            primeiro = p;
        } else {
            primeiro = 1;
        }
    }

    public void setSegundoNumero(int s) {
        if (s >= 0) {
            segundo = s;
        } else {
            segundo = 1;
        }
    }

    public void setTerceiroNumero(int t) {
        if (t >= 0) {
            terceiro = t;
        } else {
            terceiro = 1;
        }
    }

    public int getPrimeiroNumero() {
        return primeiro;
    }

    public int getSegundoNumero() {
        return segundo;
    }

    public int getTerceiroNumero() {
        return terceiro;
    }

    public int getMaior() {
        if (primeiro == segundo && primeiro == terceiro) {
            return primeiro;
        } else {
            if ((primeiro > segundo) && (primeiro > terceiro)) {
                return primeiro;
            } else if ((segundo > primeiro) && (segundo > terceiro)) {
                return segundo;
            }
        }
        return terceiro;
    }

    public int getMenor() {
        if (primeiro == segundo && primeiro == terceiro) {
            return primeiro;
        } else {
            if ((primeiro < segundo) && (primeiro < terceiro)) {
                return primeiro;
            } else if ((segundo < primeiro) && (segundo < terceiro)) {
                return segundo;
            }
        }
        return terceiro;
    }

    public void clsssificaOrdemCrescente() {
        int auxiliar;

        if (primeiro > segundo) {
            auxiliar = primeiro; 
            primeiro = segundo; 
            segundo = auxiliar;
        }

        if (segundo > terceiro) {
            auxiliar = segundo; 
            segundo = terceiro;
            terceiro = auxiliar;
            if (primeiro > segundo) {
                auxiliar = primeiro;
                primeiro = segundo;
                segundo = auxiliar;
            }
        }
        System.out.println(primeiro + "" + segundo + "" + terceiro +"");
    }

}
