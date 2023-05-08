public class Celula {
    Celula proxima;
    Celula anterior;
    Object elemento;

    public Celula(Celula proximo, Object elemento) {
        this.proxima = proximo;
        this.elemento = elemento;
        this.anterior = null;
    }

    public Celula(Object elemento) {
        this.proxima = null;
        this.anterior = null;
        this.elemento = elemento;
    }

    public Celula getProxima() {
        return this.proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Celula getAnterior() {
        return this.anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Object getElemento() {
        return this.elemento;
    }
}